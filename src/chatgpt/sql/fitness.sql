CREATE DATABASE sport_centre;
USE sport_centre;

CREATE TABLE clients(
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
email VARCHAR(50) NOT NULL,
CHECK(email LIKE '%@%' AND email LIKE '%.%'),
gender VARCHAR(6) NOT NULL,
birth_year YEAR NOT NULL,
CHECK(birth_year BETWEEN 1940 AND 2015),
phone_number VARCHAR(10) NOT NULL,
CHECK(LENGTH(phone_number) = 10));

CREATE TABLE trainers(
id INT PRIMARY KEY AUTO_INCREMENT,
full_name VARCHAR(50) NOT NULL,
speciality VARCHAR(30) NOT NULL,
experience_years INT NOT NULL,
CHECK (experience_years <= 50),
rating DECIMAL (2, 1),
CHECK(rating BETWEEN 1 AND 5));

CREATE TABLE workouts(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(40) NOT NULL,
category VARCHAR(20) NOT NULL,
difficulty_level VARCHAR(15) NOT NULL,
duration_minutes INT NOT NULL,
CHECK(duration_minutes BETWEEN 30 AND 180),
trainer_id INT NOT NULL,
FOREIGN KEY (trainer_id) REFERENCES trainers(id));

CREATE TABLE subscriptions(
id INT PRIMARY KEY AUTO_INCREMENT,
client_id INT NOT NULL,
FOREIGN KEY (client_id) REFERENCES clients(id),
start_date DATE NOT NULL,
end_date DATE,
price DECIMAL(5, 2) NOT NULL,
type VARCHAR(20) NOT NULL);

CREATE TABLE attendance(
id INT PRIMARY KEY AUTO_INCREMENT,
client_id INT NOT NULL,
FOREIGN KEY (client_id) REFERENCES clients(id),
workout_id INT NOT NULL,
FOREIGN KEY (workout_id) REFERENCES workouts(id),
attendance_date DATE NOT NULL,
feedback VARCHAR(200),
score INT,
CHECK (score BETWEEN 1 AND 10));

INSERT INTO clients (first_name, last_name, email, gender, birth_year, phone_number) VALUES
('Ivan', 'Petrov', 'ivan@abv.bg', 'male', 1955, '0888123456'),
('Maria', 'Georgieva', 'maria@gmail.com', 'female', 1988, '0888999111'),
('Georgi', 'Ivanov', 'georgi@abv.bg', 'male', 1990, '0888777666'),
('Elitsa', 'Marinova', 'elica@yahoo.com', 'female', 2000, '0888444333'),
('Nikolay', 'Stefanov', 'nikolay@outlook.com', 'male', 1985, '0888111222');

INSERT INTO trainers (full_name, speciality, experience_years, rating) VALUES
('Todor Todorov', 'cardio', 10, 4.5),
('Milena Vasileva', 'yoga', 7, 4.7),
('Росен Костов', 'boxing', 15, 4.2);

INSERT INTO workouts(name, category, difficulty_level, duration_minutes, trainer_id) VALUES
('Yoga for beginners', 'group', 'beginner', 60, 2),
('Intensive cardio mix', 'group', 'mid', 45, 1),
('Advanced boxing', 'individual', 'advanced', 90, 3),
('Online yoga session', 'online', 'beginner', 40, 2);

INSERT INTO subscriptions (client_id, start_date, end_date, price, type) VALUES
(1, '2025-01-01', '2025-03-31', 150, 'three-month'),
(2, '2025-02-01', '2025-02-28', 60, 'one-month'),
(3, '2025-01-15', '2025-04-15', 180, 'three-month'),
(4, '2025-03-01', '2025-03-31', 60, 'one-month'),
(5, '2025-01-10', '2025-12-31', 500, 'one-year');

INSERT INTO attendance (client_id, workout_id, attendance_date, feedback, score) VALUES
(1, 1, '2025-03-10', 'Very relaxing!', 9),
(2, 2, '2025-03-11', NULL, 8),
(3, 3, '2025-03-12', 'Amazing workout', 10),
(4, 4, '2025-03-13', 'Comfortable for home', 7),
(5, 2, '2025-03-14', NULL, 6);

/*1*/
SELECT first_name, last_name, birth_year FROM clients
WHERE birth_year > 1990;

/*2*/
SELECT name, duration_minutes FROM workouts
WHERE duration_minutes > 60;

/*3*/
SELECT full_name, speciality FROM trainers
WHERE speciality LIKE '%o%';

/*4*/
SELECT name, difficulty_level
FROM workouts
WHERE difficulty_level = 'mid';

/*5*/
SELECT first_name, last_name, email
FROM clients
WHERE email LIKE '%gmail%';

/*6*/
SELECT w.name AS workout, t.full_name AS trainer
FROM workouts AS w
JOIN trainers AS t ON w.trainer_id = t.id;

/*7*/
SELECT c.first_name, c.last_name, w.name AS workout
FROM attendance AS a
JOIN clients AS c ON a.client_id = c.id
JOIN workouts AS w ON a.workout_id = w.id;

/*8*/
SELECT w.name AS workout, t.full_name AS trainer
FROM workouts AS w
JOIN trainers AS t ON w.trainer_id = t.id
WHERE w.category = 'individual';

/*9*/
SELECT CONCAT(c.first_name, " ", c.last_name) AS client_name, a.attendance_date
FROM attendance AS a
JOIN clients AS c ON a.client_id = c.id;

/*10*/
SELECT w.name AS workout, a. feedback FROM attendance AS a
JOIN workouts AS w ON w.id = a.workout_id;

/*11*/
SELECT gender, COUNT(id) FROM clients
GROUP by gender;

/*12*/
SELECT difficulty_level, FORMAT(AVG(duration_minutes), 2) AS average_duration
FROM workouts
GROUP BY difficulty_level;

/*13*/
SELECT w.name AS workout, COUNT(w.id) AS attendance_count
FROM attendance AS a
JOIN workouts AS w ON a.workout_id = w.id
GROUP BY w.name;

/*14*/
SELECT w.category AS workout_category, AVG(a.score) AS average_score
FROM attendance AS a JOIN workouts AS w ON a.workout_id = w.id
GROUP BY w.category;
