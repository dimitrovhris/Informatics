CREATE DATABASE courses;
USE courses;

CREATE TABLE courses(
ID INT PRIMARY KEY AUTO_INCREMENT,
Course_Title VARCHAR(100) NOT NULL,
Course_Teacher VARCHAR(100),
Hours INT,
Course_Date DATE);

INSERT INTO courses(Course_Title, Course_Teacher, Hours, Course_Date) VALUES
('Английски език', 'Иван Атанасов', 30, '2022-12-20'),
('Английски език', 'Светлана Стефанова', 60, '2022-12-27'),
('Програмиране на Java', 'Петър Колев', 60, '2023-01-11'),
('Алгоритми', 'Светлин Киров', 30, '2023-01-11'),
('Структури от данни', 'Светлин Киров', 60, '2023-01-20');

SELECT Course_Title, Hours, Course_Teacher FROM courses
WHERE Course_Teacher LIKE '%Киров';

SELECT COUNT(*) FROM courses
WHERE YEAR(Course_date) = 2023;

SELECT Course_Title, Hours FROM courses
WHERE Hours > (SELECT AVG(Hours) FROM courses);

DELETE FROM courses
WHERE Hours < 60;
