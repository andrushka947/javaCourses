DROP TABLE IF EXISTS Applicants;
DROP TABLE IF EXISTS ApplicantSubjectsAndMarks;
DROP TABLE IF EXISTS Faculties;
DROP TABLE IF EXISTS Subjects;
DROP TABLE IF EXISTS Faculties_Subjects;


CREATE TABLE Faculties(
  id                  INT NOT NULL PRIMARY KEY,
  name                VARCHAR(20) NOT NULL UNIQUE ,
  shortName           VARCHAR(20) NOT NULL,
  studentsToAccept    INT NOT NULL,
  markToAdmission     INT NOT NULL
);

CREATE TABLE Subjects (
  id          INT NOT NULL PRIMARY KEY,
  name        VARCHAR(25) UNIQUE
);

CREATE TABLE Faculties_Subjects (
  faculty_id  INT NOT NULL REFERENCES Faculties(id),
  subject_id  INT NOT NULL REFERENCES Subjects(id),
  PRIMARY KEY(faculty_id, subject_id)
);

CREATE TABLE Applicants(
  id                  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  login               VARCHAR(30) NOT NULL UNIQUE ,
  password            VARCHAR(40) NOT NULL,
  name                VARCHAR(30) NOT NULL,
  surname             VARCHAR(30) NOT NULL,
  secondName          VARCHAR(30) NOT NULL,
  email               VARCHAR(30) NOT NULL UNIQUE,
  phoneNumber         VARCHAR(17) NOT NULL,
  faculty_id          INT,
  certificateScore    INT,
  overallScore        INT,
  FOREIGN KEY (faculty_id) REFERENCES Faculties(id)
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
    applicant_id     INT,
    subject_id  INT,
    FOREIGN KEY (applicant_id) REFERENCES Applicants(id) ON UPDATE NO ACTION,
    FOREIGN KEY (subject_id) REFERENCES Subjects(id) ON UPDATE NO ACTION
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

INSERT INTO Faculties (id, name, shortName, studentsToAccept, markToAdmission) VALUES
  (1, 'Faculty of Computer Science', 'focs', 10, 610),
  (2, 'Humanitarian Faculty', 'hf', 20, 560),
  (3, 'Medical Faculty', 'mf', 30, 600),
  (4, 'Faculty of international economy', 'foie', 15, 590),
  (5, 'Engineering Faculty', 'ef', 15, 610),
  (6, 'Psychology Faculty', 'pf', 20, 570);

INSERT INTO Applicants (login, password, name, surname, secondName, email,
                        phoneNumber, faculty_id, certificateScore, overallScore) VALUES
  ('Andrukha', 'd56b699830e77ba53855679cb1d252da', 'Andrey', 'Andreyev', 'Andreevich', 'andrey@mail.com', '+38(000)000-00-01', 1, 54, 567),
  ('Sanya', 'd56b699830e77ba53855679cb1d252da', 'Aleksandr', 'Aleksandrov', 'Aleksandrovich', 'aleksandr@mail.com', '+38(000)000-00-01', 2, 54, 425),
  ('Olya', 'd56b699830e77ba53855679cb1d252da', 'Olga', 'Olgova', 'Olgovna', 'Olga@mail.com', '+38(000)000-00-02', 3, 51, 569),
  ('Jeka', 'd56b699830e77ba53855679cb1d252da', 'Evgeniy', 'Yevgenov', 'Yevgenyevich', 'Yevgen@mail.com', '+38(000)000-00-03', 4, 30, 501),
  ('Vasyan', 'd56b699830e77ba53855679cb1d252da', 'Vasiliy', 'Vasilyev', 'Vasilyevich', 'Vasiliy@mail.com', '+38(000)000-00-04', 5, 44, 487),
  ('Varukha', 'd56b699830e77ba53855679cb1d252da', 'Varvara', 'VAravarova', 'Varvarovna', 'Varvara@mail.com', '+38(000)000-00-05', 6, 60, 470),
  ('Seryoga', 'd56b699830e77ba53855679cb1d252da', 'Sergey', 'Sergeev', 'Sergeevich', 'Sergey@mail.com', '+38(000)000-00-06', 1, 40, 515),
  ('Anka', 'd56b699830e77ba53855679cb1d252da', 'Anna', 'Annina', 'Annovna', 'Anna@mail.com', '+38(000)000-00-07', 2, 34, 539),
  ('Afonya', 'd56b699830e77ba53855679cb1d252da', 'Afanasiy', 'Afanasiev', 'Afanasievich', 'Afanasiy@mail.com', '+38(000)000-00-08', 3, 44, 505),
  ('Yulyan', 'd56b699830e77ba53855679cb1d252da', 'Yulia', 'Yulieva', 'Yulievna', 'Yulia@mail.com', '+38(000)000-00-09', 4, 20, 452),
  ('Vladyan', 'd56b699830e77ba53855679cb1d252da', 'Vladislav', 'Vladov', 'Vladislavovich', 'Vladislav@mail.com', '+38(000)000-00-10', 5, 49, 490),
  ('Efrosya', 'd56b699830e77ba53855679cb1d252da', 'Efrosiniya', 'Efrosieva', 'Efrosineva', 'Efrosineva@mail.com', '+38(000)000-00-11', 6, 54, 545),
  ('Garry', 'd56b699830e77ba53855679cb1d252da', 'Gennadiy', 'Genov', 'Genadiyovich', 'Gennadiy@mail.com', '+38(000)000-00-11', 6, 47, 518);

INSERT INTO Faculties_Subjects (faculty_id, subject_id) VALUES
  (1, 1),
  (1, 4),
  (1, 6),
  (2, 2),
  (2, 5),
  (2, 7),
  (3, 2),
  (3, 3),
  (3, 8),
  (4, 6),
  (4, 7),
  (4, 5),
  (5, 1),
  (5, 4),
  (5, 2),
  (6, 2),
  (6, 5),
  (6, 8);

INSERT INTO ApplicantSubjectsAndMarks (applicant_id, name, score, subject_id) VALUES
  (1, 'MATH', 190, 1),
  (1, 'PHYSICS', 181, 4),
  (1, 'ENGLISH_LANGUAGE', 170, 6),
  (2, 'UKRAINIAN_LANGUAGE', 200, 2),
  (2, 'UKRAINIAN_HISTORY', 140, 5),
  (2, 'GEOGRAPHY', 160, 7),
  (3, 'UKRAINIAN_LANGUAGE', 150, 2),
  (3, 'CHEMISTRY', 187, 3),
  (3, 'BIOLOGY', 160, 8),
  (4, 'ENGLISH_LANGUAGE', 149, 6),
  (4, 'GEOGRAPHY', 188, 7),
  (4, 'UKRAINIAN_HISTORY', 178, 5),
  (5, 'MATH', 180, 1),
  (5, 'PHYSICS', 190, 4),
  (5, 'UKRAINIAN_LANGUAGE', 168, 2),
  (6, 'UKRAINIAN_LANGUAGE', 180, 2),
  (6, 'UKRAINIAN_HISTORY', 170, 5),
  (6, 'BIOLOGY', 178, 8),
  (7, 'MATH', 182, 1),
  (7, 'PHYSICS', 177, 4),
  (7, 'ENGLISH_LANGUAGE', 184, 6),
  (8, 'UKRAINIAN_LANGUAGE', 174, 2),
  (8, 'UKRAINIAN_HISTORY', 195, 5),
  (8, 'GEOGRAPHY', 144, 7),
  (9, 'UKRAINIAN_LANGUAGE', 170, 2),
  (9, 'CHEMISTRY', 165, 3),
  (9, 'BIOLOGY', 190, 8),
  (10, 'ENGLISH_LANGUAGE', 164, 6),
  (10, 'GEOGRAPHY', 190, 7),
  (10, 'UKRAINIAN_HISTORY', 187, 5),
  (11, 'MATH', 177, 1),
  (11, 'PHYSICS', 184, 4),
  (11, 'UKRAINIAN_LANGUAGE', 150, 2),
  (12, 'UKRAINIAN_LANGUAGE', 164, 2),
  (12, 'UKRAINIAN_HISTORY', 177, 5),
  (12, 'MATH', 164, 8),
  (13, 'UKRAINIAN_LANGUAGE', 175, 2),
  (13, 'UKRAINIAN_HISTORY', 170, 5),
  (13, 'BIOLOGY', 165, 8);