package com.webproject.model.dao;

import com.webproject.model.entity.Applicant;
import com.webproject.model.entity.Faculty;
import com.webproject.model.entity.Subject;
import com.webproject.model.entity.User_Role;
import com.webproject.view.DBUtil;
import org.apache.log4j.Logger;

import javax.sql.DataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicantDAOImpl  {//implements ApplicantDAO
    private static String INSERT_APPLICANT = "INSERT INTO Applicants" +
            " (login, password, role_id, name, surname, secondName, email, phoneNumber, faculty_id, certificateScore, overallScore) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static String INSERT_APPLICANT_SUBJECTS = "INSERT INTO ApplicantSubjectsAndMarks " +
            "(name, score, applicant_id, subject_id) VALUES (?,?, ?, ?)";
    private static String DELETE_APPLICANT = "DELETE FROM Applicant WHERE login = ?";
    private static String DELETE_SUBJECTS = "DELETE FROM ApplicantSubjectsAndMarks where applicant_id = ?";
    private static String GET_ALL_APPLICANTS = "SELECT * FROM Applicants";
    private static String GET_APPLICANT_BY_ID = "SELECT * FROM Applicants where id = ?";
    private static String GET_APPLICANT_BY_LOGIN = "SELECT * FROM Applicants where login = ?";
    private static String GET_APPLICANTS_BY_SUBJECT_ID = "SELECT * FROM ApplicantSubjectsAndMarks WHERE subject_id = ?";
    private static String GET_APPLICANTS_BY_FACULTY_ID = "SELECT * FROM Applicants WHERE faculty_id = ?";
    private static String GET_FACULTY_BY_ID = "SELECT * FROM Faculties WHERE id = ?";
    private static String GET_SUBJECTS_BY_APPLICANT_ID = "SELECT * FROM ApplicantSubjectsAndMarks WHERE applicant_id = ?";

    private static final Logger logger = Logger.getLogger(ApplicantDAOImpl.class);

    private DataSource ds;

    public ApplicantDAOImpl() throws SQLException {}

    private void connect() throws SQLException {
        if (ds == null) {
            ds = DBUtil.getDataSource();
        }
    }

    public void disconnect() throws SQLException {
       ds.getConnection().close();
    }

    //@Override
    public void save(Connection connection, Applicant applicant) throws SQLException {
        //connect();
        //Connection connection = ds.getConnection();
        connection.setAutoCommit(false);
        PreparedStatement applicantStatement = null;
        PreparedStatement subjectStatement = null;
        try {
            applicantStatement = connection.prepareStatement(INSERT_APPLICANT);
            applicantStatement.setString(1, applicant.getLogin());
            applicantStatement.setString(2, encodePassword(applicant.getPassword()));
            applicantStatement.setInt(3, User_Role.ADMIN.getId());
            applicantStatement.setString(4, applicant.getName());
            applicantStatement.setString(5, applicant.getSurname());
            applicantStatement.setString(6, applicant.getSecondName());
            applicantStatement.setString(7, applicant.getEmail());
            applicantStatement.setString(8, applicant.getPhoneNumber());
            applicantStatement.setInt(9, 1);
            applicantStatement.setInt(10, applicant.getCertificateScore());
            applicantStatement.setInt(11, applicant.getOverallScore());

            //ResultSet rs = applicantStatement.executeQuery();
            applicantStatement.executeUpdate();
            //rs.next();
            //int applicantId = rs.getInt("id");
            int applicantId = 0;
            subjectStatement = connection.prepareStatement(INSERT_APPLICANT_SUBJECTS);
            for (Map.Entry<Subject, Integer> pair : applicant.getSubjectMarks().entrySet()) {
                subjectStatement.setString(1, pair.getKey().getName());
                subjectStatement.setInt(2, pair.getValue());
                subjectStatement.setLong(3, applicantId);
                subjectStatement.setLong(4, applicant.getFaculty().getId());
                subjectStatement.executeUpdate();
            }
            connection.commit();
            logger.info("Saved to Applicants: " + applicant);
        } catch (SQLException e) {
            logger.error("Error saving to Applicants applicant: " + applicant);
            connection.rollback();
        } finally {
            if (applicantStatement != null) applicantStatement.close();
            if (subjectStatement != null) subjectStatement.close();
            //disconnect();
        }
    }

    //@Override
    public void deleteByLogin(String login) throws SQLException {
        connect();
        Connection connection = ds.getConnection();
        connection.setAutoCommit(false);

        PreparedStatement applicantStatement = null;
        PreparedStatement subjectStatement = null;
        try {
            applicantStatement = connection.prepareStatement(DELETE_APPLICANT);
            applicantStatement.setString(1, login);
            ResultSet rs = applicantStatement.executeQuery();
            rs.next();
            int id = rs.getInt("id");

            subjectStatement = connection.prepareStatement(DELETE_SUBJECTS);
            subjectStatement.setInt(1, id);

            connection.commit();
            logger.info("deleted user with login: " + login);
        } catch (SQLException e) {
            logger.error("error deleting applicant with login: " + login);
            connection.rollback();
        } finally {
            if (applicantStatement != null) applicantStatement.close();
            if (subjectStatement != null) subjectStatement.close();
            disconnect();
        }
    }

    //@Override
    public Applicant findByLogin(Connection connection, String login) throws SQLException {
        //connect();
        //Connection connection = ds.getConnection();
        Applicant applicant;
        PreparedStatement applicantStatement = null;
        PreparedStatement facultyStatement = null;
        PreparedStatement subjectStatement = null;
        try {
            applicantStatement = connection.prepareStatement(GET_APPLICANT_BY_LOGIN);
            facultyStatement = connection.prepareStatement(GET_FACULTY_BY_ID);
            subjectStatement = connection.prepareStatement(GET_SUBJECTS_BY_APPLICANT_ID);
            applicantStatement.setString(1, login);

            ResultSet applicantSet = applicantStatement.executeQuery();
            applicantSet.next();
            applicant = Applicant.newBuilder().
                    setId(applicantSet.getInt("id")).
                    setLogin(applicantSet.getString("login")).
                    setPassword(applicantSet.getString("password")).
                    setName(applicantSet.getString("name")).
                    setSurname(applicantSet.getString("surname")).
                    setSecondName(applicantSet.getString("secondName")).
                    setEmail(applicantSet.getString("email")).
                    setPhoneNumber(applicantSet.getString("phoneNumber")).
                    setCertificateScore(applicantSet.getInt("certificateScore")).
                    setOverallScore(applicantSet.getInt("overallScore")).
                    setSurname(applicantSet.getString("surname")).
                    build();
            facultyStatement.setInt(1, applicantSet.getInt("faculty_id"));
            ResultSet facultySet = facultyStatement.executeQuery();
            facultySet.next();
            Faculty faculty = new Faculty(facultySet.getString("name"),
                    facultySet.getString("shortName"),
                    facultySet.getInt("studentsToAccept"),
                    facultySet.getInt("markToAdmission"));
            applicant.setFaculty(faculty);

            subjectStatement.setInt(1, applicantSet.getInt("id"));
            Map<Subject, Integer> subjects = new HashMap<>();
            ResultSet subjectSet = subjectStatement.executeQuery();
            while (subjectSet.next()) {
                subjects.put(Subject.valueOf(subjectSet.getString("name")) ,subjectSet.getInt("score"));
            }
            applicant.setSubjectMarks(subjects);
        } finally {
            if (applicantStatement != null) applicantStatement.close();
            if (facultyStatement != null) facultyStatement.close();
            //disconnect();
        }

        return applicant;
    }

    //@Override
    public Applicant findById(long id) throws SQLException {
        connect();
        Connection connection = ds.getConnection();
        connection.setAutoCommit(false);
        Applicant applicant;
        PreparedStatement applicantStatement = null;
        PreparedStatement facultyStatement = null;
        PreparedStatement subjectStatement = null;
        try {
            applicantStatement = connection.prepareStatement(GET_APPLICANT_BY_ID);
            facultyStatement = connection.prepareStatement(GET_FACULTY_BY_ID);
            subjectStatement = connection.prepareStatement(GET_SUBJECTS_BY_APPLICANT_ID);
            applicantStatement.setInt(1, (int)id);

            ResultSet applicantSet = applicantStatement.executeQuery();
            applicantSet.next();
            applicant = Applicant.newBuilder().
                    setId(applicantSet.getInt("id")).
                    setLogin(applicantSet.getString("login")).
                    setPassword(applicantSet.getString("password")).
                    setName(applicantSet.getString("name")).
                    setSurname(applicantSet.getString("surname")).
                    setSecondName(applicantSet.getString("secondName")).
                    setEmail(applicantSet.getString("email")).
                    setPhoneNumber(applicantSet.getString("phoneNumber")).
                    setCertificateScore(applicantSet.getInt("certificateScore")).
                    setOverallScore(applicantSet.getInt("overallScore")).
                    setSurname(applicantSet.getString("surname")).
                    build();
            facultyStatement.setInt(1, applicantSet.getInt("faculty_id"));
            ResultSet facultySet = facultyStatement.executeQuery();
            Faculty faculty = new Faculty(facultySet.getString("name"),
                    facultySet.getString("shortName"),
                    facultySet.getInt("studentsToAccept"),
                    facultySet.getInt("markToAdmission"));
            applicant.setFaculty(faculty);

            subjectStatement.setInt(1, applicantSet.getInt("id"));
            Map<Subject, Integer> subjects = new HashMap<>();
            ResultSet subjectSet = subjectStatement.executeQuery();
            while (subjectSet.next()) {
                subjects.put(Subject.valueOf(subjectSet.getString("name")) ,subjectSet.getInt("score"));
            }
            applicant.setSubjectMarks(subjects);
        } finally {
            if (applicantStatement != null) applicantStatement.close();
            if (facultyStatement != null) facultyStatement.close();
            disconnect();
        }
        return applicant;
    }

    //@Override
    public List<Applicant> getAllApplicants() throws SQLException {
        List<Applicant> result = new ArrayList<>();
        connect();
        Connection connection = ds.getConnection();
        connection.setAutoCommit(false);

        PreparedStatement applicantStatement = null;
        PreparedStatement facultyStatement = null;
        PreparedStatement subjectStatement = null;
        try {
            applicantStatement = connection.prepareStatement(GET_ALL_APPLICANTS);
            facultyStatement = connection.prepareStatement(GET_FACULTY_BY_ID);
            subjectStatement = connection.prepareStatement(GET_SUBJECTS_BY_APPLICANT_ID);

            ResultSet applicantSet = applicantStatement.executeQuery();
            while (applicantSet.next()) {
                Applicant applicant = Applicant.newBuilder().
                        setId(applicantSet.getInt("id")).
                        setLogin(applicantSet.getString("login")).
                        setPassword(applicantSet.getString("password")).
                        setRole(User_Role.USER).
                        setName(applicantSet.getString("name")).
                        setSurname(applicantSet.getString("surname")).
                        setSecondName(applicantSet.getString("secondName")).
                        setEmail(applicantSet.getString("email")).
                        setPhoneNumber(applicantSet.getString("phoneNumber")).
                        setCertificateScore(applicantSet.getInt("certificateScore")).
                        setOverallScore(applicantSet.getInt("overallScore")).
                        setSurname(applicantSet.getString("surname")).
                        build();

                facultyStatement.setInt(1, applicantSet.getInt("faculty_id"));
                ResultSet facultySet = facultyStatement.executeQuery();
                Faculty faculty = new Faculty(facultySet.getString("name"),
                        facultySet.getString("shortName"),
                        facultySet.getInt("studentsToAccept"),
                        facultySet.getInt("markToAdmission"));
                applicant.setFaculty(faculty);

                subjectStatement.setInt(1, applicantSet.getInt("id"));
                Map<Subject, Integer> subjects = new HashMap<>();
                ResultSet subjectSet = subjectStatement.executeQuery();
                while (subjectSet.next()) {
                    subjects.put(Subject.valueOf(subjectSet.getString("name")) ,subjectSet.getInt("score"));
                }
                applicant.setSubjectMarks(subjects);
                result.add(applicant);
            }
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            if (applicantStatement != null) applicantStatement.close();
            if (facultyStatement != null) facultyStatement.close();
            disconnect();
        }
        return result;
    }

    private static String encodePassword(String password) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest mg;
            mg = MessageDigest.getInstance("MD5");
            mg.update(password.getBytes());
            byte[] bytes = mg.digest();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] &0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error(e);
        }
        return sb.toString();
    }

}
