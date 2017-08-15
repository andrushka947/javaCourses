package com.webproject.model.entity;

import com.webproject.model.Entity;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Entity {

    private int id;
    private String name;
    private String shortName;
    private int studentsToAccept;
    private List<Applicant> applicants;
    private List<Subject> subjectsToPass;
    private int markToAdmission;

    public Faculty(String name, String shortName, int studentsToAccept, int markToAdmission) {
        this.name = name;
        this.shortName = shortName;
        this.studentsToAccept = studentsToAccept;
        applicants = new ArrayList<>();
        this.markToAdmission = markToAdmission;
    }

    public void addApplicant(Applicant applicant) {
        this.applicants.add(applicant);
    }

    public boolean checkApplicantForEligibility(Applicant applicant) {
        return applicant.getSubjectMarks().keySet().containsAll(subjectsToPass);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getStudentsToAccept() {
        return studentsToAccept;
    }
    public void setStudentsToAccept(int studentsToAccept) {
        this.studentsToAccept = studentsToAccept;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }
    public void setApplicants(List<Applicant> applicants) {
        this.applicants = applicants;
    }

    public List<Subject> getSubjectsToPass() {
        return subjectsToPass;
    }
    public void setSubjectsToPass(List<Subject> subjectsToPass) {
        this.subjectsToPass = subjectsToPass;
    }

    public int getMarkToAdmission() {
        return markToAdmission;
    }
    public void setMarkToAdmission(int markToAdmission) {
        this.markToAdmission = markToAdmission;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", studentsToAccept=" + studentsToAccept +
                ", applicants=" + applicants +
                ", subjectsToPass=" + subjectsToPass +
                '}';
    }
}