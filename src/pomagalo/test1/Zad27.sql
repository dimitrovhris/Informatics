CREATE DATABASE bookstore;
USE bookstore;

CREATE TABLE authors(
author_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30),
last_name VARCHAR(30),
country VARCHAR(30));

CREATE TABLE books(
book_id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50),
genre VARCHAR(30),
author_id INT,
FOREIGN KEY(author_id) REFERENCES authors(author_id));

INSERT INTO authors (first_name, last_name, country) VALUES
('John', 'Green', 'USA'),
('J.K.', 'Rowling', 'UK'),
('Gabriel', 'Garcia', 'Colombia'),
('Jane', 'Austen', 'UK');

INSERT INTO books (title, genre, author_id) VALUES
('The Fault in Our Stars', 'Young Adult', 1),
('Looking for Alaska', 'Young Adult', 1),
('Harry Potter and the Sorcerer\' Stone', 'Fantasy', 2),
('Harry Potter and the Chamber of Secrets', 'Fantasy', 2),
('Love in the time of Cholera', 'Romance', 3),
('One Hundred Years of Solitude', 'Magical Realism', 3),
('Pride and Prejudice', 'Romance', 4);

SELECT first_name, last_name, country, title, genre
FROM books JOIN authors ON books.author_id = authors.author_id
WHERE first_name = 'John';
