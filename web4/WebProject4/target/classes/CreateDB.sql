DROP TABLE IF EXISTS Applicants;
DROP TABLE IF EXISTS ApplicantSubjectsAndMarks;
DROP TABLE IF EXISTS Faculties;
DROP TABLE IF EXISTS Subjects;
DROP TABLE IF EXISTS Faculties_Subjects;

CREATE TABLE Applicants(
    id                  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    login               VARCHAR(30) NOT NULL,
    password            VARCHAR(40) NOT NULL,
    name                VARCHAR(30) NOT NULL,
    surname             VARCHAR(30) NOT NULL,
    secondName          VARCHAR(30) NOT NULL,
    email               VARCHAR(30) NOT NULL,
    phoneNumber         VARCHAR(17) NOT NULL,
    faculty_id          INT,
    certificateScore    INT,
    overallScore        INT
);

CREATE TABLE ApplicantSubjectsAndMarks (
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    score       INT,
    name        ENUM(   'MATH',
                        'UKRAINIAN_HISTORY',
                        'CHEMISTRY',
                        'PHYSICS',
                        'UKRAINIAN_LANGUAGE',
                        'ENGLISH_LANGUAGE',
                        'GEOGRAPHY',
                        'BIOLOGY'),
    user_id     INT,
    subject_id  INT
);

CREATE TABLE Faculties(
    id                  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name                VARCHAR(20) NOT NULL,
    shortName           VARCHAR(20) NOT NULL,
    studentsToAccept    INT NOT NULL,
    markToAdmission     INT NOT NULL
);

CREATE TABLE Subjects (
    id          INT,
    name        VARCHAR(25)
);

CREATE TABLE Faculties_Subjects (
    faculty_id  INT NOT NULL,
    subject_id  INT NOT NULL,
    PRIMARY KEY(faculty_id, subject_id)
);

INSERT INTO Subjects (id, name) VALUES
  (1, 'MATH'),
  (2, 'UKRAINIAN_LANGUAGE'),
  (3, 'CHEMISTRY'),
  (4, 'PHYSICS'),
  (5, 'UKRAINIAN_HISTORY'),
  (6, 'ENGLISH_LANGUAGE'),
  (7, 'GEOGRAPHY'),
  (8, 'BIOLOGY');

INSERT INTO Faculties (name, shortName, studentsToAccept, markToAdmission) VALUES
  ('Faculty of Computer Science', 'focs', 10, 610),
  ('Humanitarian Faculty', 'hf', 20, 560),
  ('Medical Faculty', 'mf', 30, 600),
  ('Faculty of international economy', 'foie', 15, 590),
  ('Engineering Faculty', 'ef', 15, 610),
  ('Psychology Faculty', 'pf', 20, 570);

INSERT INTO Applicants (login, name, password, name, surname, secondName, email,
                        phoneNumber, faculty_id, certificateScore, overallScore) VALUES
  ('Andrukha', 'Andrey', '', 610),