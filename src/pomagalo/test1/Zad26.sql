/*MySQL*/

CREATE DATABASE Test1;
USE Test1;

CREATE TABLE Courses(
Cid INT PRIMARY KEY AUTO_INCREMENT,
CTitle VARCHAR(255),
StartDate DATE,
EndDate DATE,
Instructor VARCHAR(255),
NumberParticipants INT);

INSERT INTO Courses(CTitle, StartDate, EndDate, Instructor, NumberParticipants) VALUES 
('Роботика', '2022-10-01', '2022-12-22', 'Петров', 10),
('Математика', '2023-11-15', '2024-03-31', 'Колева', 22),
('Изкуства', '2022-09-20', '2023-01-01', 'Анастасов', 8),
('Музика', '2023-10-01', '2023-11-30', 'Николова', 15),
('Танци', '2023-10-15', '2023-12-22', 'Иванова', 20);

UPDATE Courses
SET NumberParticipants = 13
WHERE Cid = 3;

SELECT * FROM Courses
WHERE NumberParticipants > 15;

SELECT COUNT(*) FROM Courses
WHERE YEAR(EndDate) = 2023;

SELECT CTitle, NumberParticipants
FROM Courses
WHERE EndDate < CURDATE()
ORDER BY CTitle;
