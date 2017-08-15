package com.webproject;

import com.webproject.model.dao.ApplicantDAOImpl;
import com.webproject.model.entity.Subject;
import com.webproject.model.entity.Applicant;
import com.webproject.model.entity.Faculty;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

import static com.webproject.model.entity.Subject.*;

public class main {
    private static final Logger LOGGER = Logger.getLogger(main.class);

    public static void main(String[] args) throws SQLException {

        Faculty compScienceFaculty = new Faculty("Faculty of Computer Science", "focs", 10, 610);
        compScienceFaculty.setSubjectsToPass(Arrays.asList(MATH, PHYSICS, ENGLISH_LANGUAGE));

        Faculty humanitarianFaculty = new Faculty("Humanitarian Faculty", "hf", 20, 560);
        humanitarianFaculty.setSubjectsToPass( Arrays.asList(UKRAINIAN_LANGUAGE, UKRAINIAN_HISTORY, GEOGRAPHY));

        Faculty medicalFaculty = new Faculty("Medical Faculty", "mf", 30, 600);
        medicalFaculty.setSubjectsToPass(Arrays.asList(UKRAINIAN_LANGUAGE, CHEMISTRY, BIOLOGY));

        Faculty internationalEconomyFaculty = new Faculty("Faculty of international economy", "foie", 15, 590);
        internationalEconomyFaculty.setSubjectsToPass(Arrays.asList(ENGLISH_LANGUAGE, GEOGRAPHY, UKRAINIAN_HISTORY));

        Faculty engineeringFaculty = new Faculty("Engineering Faculty", "ef", 15, 610);
        engineeringFaculty.setSubjectsToPass( Arrays.asList(MATH, PHYSICS, UKRAINIAN_LANGUAGE));

        Faculty psychologyFaculty = new Faculty("Psychology Faculty", "pf", 20, 570);
        psychologyFaculty.setSubjectsToPass(Arrays.asList(UKRAINIAN_LANGUAGE, UKRAINIAN_HISTORY, BIOLOGY));

        Map<Subject, Integer> marks = new HashMap<>();
        marks.put(PHYSICS, 181);
        marks.put(MATH, 190);
        marks.put(ENGLISH_LANGUAGE, 196);

        Applicant a1 = Applicant.newBuilder().
                                    setLogin("login").
                                    setPassword("pass").
                                    setName("name").
                                    setSurname("surname").
                                    setSecondName("secondName").
                                    setEmail("email@m.m").
                                    setPhoneNumber("38(099)032-66-20").
                                    setSubjectMarks(marks).
                                    setCertificateScore(54).
                                    setAppliedFor(compScienceFaculty).
                                    build();
        compScienceFaculty.addApplicant(a1);

        /*
        System.out.println("Faculty: ");
        System.out.println(compScienceFaculty);
        System.out.println("Applicant: ");
        System.out.println(a1);
        System.out.println(compScienceFaculty.checkApplicantForEligibility(a1));
        */

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web4?autoReconnect=true&useSSL=false", "root", "pass");

        ApplicantDAOImpl appDAO = new ApplicantDAOImpl();
        appDAO.save(conn ,a1);
        LOGGER.info("Saved to db " + a1);

        System.out.println(appDAO.findByLogin(conn, "login"));
        conn.close();

    }
}
