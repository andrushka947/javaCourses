package com.webproject.model.entity;

import com.webproject.model.Entity;

import java.util.Map;

public class Applicant extends Entity {

    private int id;
    private String login;
    private String password;
    private User_Role role;
    private String name;
    private String surname;
    private String secondName;

    private String email;
    private String phoneNumber;
    private Faculty faculty;
    private Map<Subject,Integer> subjectMarks;
    private int certificateScore;
    private int overallScore;

    private Applicant() {}

    public class Builder {
        private Builder() {}

        public Builder setId(int id) {
            Applicant.this.id = id;
            return this;
        }
        public Builder setLogin(String login) {
            Applicant.this.login = login;
            return this;
        }
        public Builder setPassword(String pass) {
            Applicant.this.password = pass;
            return this;
        }
        public Builder setRole(User_Role role) {
            Applicant.this.role = role;
            return this;
        }
        public Builder setName(String name) {
            Applicant.this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            Applicant.this.surname = surname;
            return this;
        }
        public Builder setSecondName(String secondName) {
            Applicant.this.secondName = secondName;
            return this;
        }
        public Builder setEmail(String email) {
            Applicant.this.email = email;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber) {
            Applicant.this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setAppliedFor(Faculty appliedFor) {
            Applicant.this.faculty = appliedFor;
            return this;
        }
        public Builder setSubjectMarks(Map<Subject, Integer> subjectsAndMarks) {
            Applicant.this.subjectMarks = subjectsAndMarks;
            int overallScore = 0;
            for (Integer score : subjectsAndMarks.values())
                overallScore+= score;
            Applicant.this.overallScore += overallScore;
            return this;
        }
        public Builder setCertificateScore(int certificateScore) {
            Applicant.this.certificateScore = certificateScore;
            Applicant.this.overallScore += certificateScore;
            return this;
        }
        public Builder setOverallScore(int overallScore) {
            Applicant.this.overallScore = overallScore;
            return this;
        }
        public Applicant build() {
            return Applicant.this;
        }

    }

    public static Builder newBuilder() {
        return new Applicant().new Builder();
    }

    private String facultyPrint() {
        return "{" + "Name:" + faculty.getName() + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User_Role getRole() {
        return role;
    }

    public void setRole(User_Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Map<Subject, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public int getCertificateScore() {
        return certificateScore;
    }

    public void setCertificateScore(int certificateScore) {
        this.certificateScore = certificateScore;
        this.overallScore += certificateScore;
    }

    public int getOverallScore() {
        return overallScore;
    }

    public void setSubjectMarks(Map<Subject, Integer> subjectMarks) {
        this.subjectMarks = subjectMarks;
        int overallScore = 0;
        for (Map.Entry pair : subjectMarks.entrySet()) {
            if (faculty.getSubjectsToPass().contains(pair.getKey())) {
                overallScore += (Integer) pair.getValue();
            }
        }
        this.overallScore += overallScore;
    }

    public void setOverallScore(int overallScore) {
        this.overallScore = overallScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Applicant applicant = (Applicant) o;

        if (id != applicant.id) return false;
        if (!login.equals(applicant.login)) return false;
        if (!password.equals(applicant.password)) return false;
        if (!name.equals(applicant.name)) return false;
        if (!surname.equals(applicant.surname)) return false;
        if (!secondName.equals(applicant.secondName)) return false;
        if (!email.equals(applicant.email)) return false;
        if (!phoneNumber.equals(applicant.phoneNumber)) return false;
        if (faculty != null ? !faculty.equals(applicant.faculty) : applicant.faculty != null) return false;
        return subjectMarks != null ? subjectMarks.equals(applicant.subjectMarks) : applicant.subjectMarks == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + (subjectMarks != null ? subjectMarks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty=" + facultyPrint() +
                ", subjectMarks=" + subjectMarks +
                ", certificateScore=" + certificateScore +
                ", overallScore=" + overallScore +
                '}';
    }
}