CREATE DATABASE school;
USE school;

CREATE TABLE students(
ID INT PRIMARY KEY AUTO_INCREMENT,
Name VARCHAR(50),
BEL INT,
English INT,
Math INT,
Informatics INT,
IT INT);

INSERT INTO students (Name, BEL, English, Math, Informatics, IT) VALUES
('Антония Колева', 4, 5, 6, 5, 4),
('Асен Ангелов', 5, 5, 6, 4, 5),
('Борислав Ганев', 4, 4, 5, 5, 6),
('Бояна Тодорова', 5, 6, 6, 6, 6),
('Валери Илиев', 6, 6, 6, 6, 6);

SELECT * FROM students
WHERE id = 4;

SELECT COUNT(*) FROM students
WHERE Math = 6 AND Informatics = 6 AND IT = 6;

SELECT AVG(BEL), AVG(Math) FROM students;

SELECT Name, ((BEL + English + Math + Informatics + IT)/5) FROM students
ORDER BY ((BEL + English + Math + Informatics + IT)/5) DESC, Name ASC;
