package com.webproject.model.dao;

import com.webproject.model.entity.Applicant;

import java.sql.SQLException;
import java.util.List;

public interface ApplicantDAO {

    void save(Applicant applicant) throws SQLException;
    void deleteByLogin(String login) throws SQLException;
    Applicant findByLogin(String login) throws SQLException;
    Applicant findById(long id) throws SQLException;
    List<Applicant> getAllApplicants() throws SQLException;
}
