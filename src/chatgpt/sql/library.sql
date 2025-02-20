CREATE DATABASE library;
USE library;

CREATE TABLE books(
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      title VARCHAR(100) NOT NULL,
                      author VARCHAR(100) NOT NULL,
                      genre VARCHAR(50),
                      price DECIMAL(5, 2),
                      CHECK(price > 0));

CREATE TABLE borrowers(
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          phone_number VARCHAR(15),
                          email VARCHAR(100) NOT NULL UNIQUE,
                          CHECK(email LIKE '%@%' AND email LIKE '%.%'));

CREATE TABLE borrowed_books(
                               id INT PRIMARY KEY AUTO_INCREMENT,
                               book_id INT,
                               FOREIGN KEY(book_id) REFERENCES books(id),
                               borrower_id INT,
                               FOREIGN KEY(borrower_id) REFERENCES borrowers(id),
                               borrow_date DATE NOT NULL UNIQUE,
                               return_date DATE);

INSERT INTO books (title, author, genre, price) VALUES
                                                    ('The Great Gatsby', 'F.Scott', 'Fiction', 12.99),
                                                    ('To Kill a Mockingbird', 'Harper Lee', 'Fiction', 15.50),
                                                    ('The Catcher in the Rye', 'J.D.Salinger', 'Fiction', 10.99),
                                                    ('1984', 'George Orwell', 'Dystopian', 18.00),
                                                    ('Brave New World', 'Aldous Huxely', 'Dystopian', 20.00),
                                                    ('Moby Dick', 'Herman Melville', 'Adventure', 8.50),
                                                    ('War and Peace', 'Leo Tolstoy', 'Historical', 25.00),
                                                    ('Crime and Punishment', 'Fyodor Dostoevsky', 'Historical', 22.00),
                                                    ('The Hobit', 'J.R.R Tolkien', 'Fantasy', 13.99),
                                                    ('Harry Potter', 'J.K.Rowling', 'Fantasy', 30.00);

INSERT INTO borrowers (name, phone_number, email) VALUES
                                                      ('John Doe', '0888123456', 'john.doe@gmail.com'),
                                                      ('Jane Smith', '0888765432', 'jane.smith@yahoo.com'),
                                                      ('Alice Brown', '0888987654', 'alice.b@abv.bg'),
                                                      ('Bob Johnson', '0888456789', 'bob.j@gmail.com'),
                                                      ('Charlie Wilson', '0888123123', 'charlie.w@hotmail.com'),
                                                      ('Emma Davis', '0888678901', 'emma.d@outlook.com'),
                                                      ('Michael Taylor', '0888123245', 'michael.t@gmail.com'),
                                                      ('Sophia Miller', '	0888234567', 'sophia.m@abv.bg'),
                                                      ('Liam Anderson', '0888345678', 'liam.a@yahoo.com'),
                                                      ('Olivia Martinez', '0888456780', 'olivia.m@gmail.com');

INSERT INTO borrowed_books (book_id, borrower_id, borrow_date, return_date) VALUES
                                                                                (1, 1, '2025-01-01', '2025-01-15'),
                                                                                (2, 2, '2025-01-02', '2025-01-18'),
                                                                                (3, 3, '2025-01-03', '2025-01-19'),
                                                                                (4, 4, '2025-01-04', NULL),
                                                                                (5, 5, '2025-01-05', '2025-01-20'),
                                                                                (6, 6, '2025-01-06', NULL),
                                                                                (7, 7, '2025-01-07', '2025-01-22'),
                                                                                (8, 8, '2025-01-08', '2025-01-23'),
                                                                                (9, 9, '2025-01-09', '2025-01-24'),
                                                                                (10, 10, '2025-01-10', NULL);

/*1*/
SELECT * FROM books
WHERE title LIKE '%The%';

/*2*/
SELECT name, title, genre FROM borrowed_books
                                   JOIN books ON borrowed_books.book_id = books.id
                                   JOIN borrowers ON borrowed_books.borrower_id = borrowers.id
WHERE genre = 'Fiction';

/*3*/
SELECT name, title, return_date FROM borrowed_books
                                         JOIN books ON borrowed_books.book_id = books.id
                                         JOIN borrowers ON borrowed_books.borrower_id = borrowers.id
WHERE YEAR(return_date) = 2025 AND MONTH(return_date) = 1;

/*4*/
SELECT genre, SUM(price) as total_price FROM books
GROUP BY genre
ORDER BY total_price DESC;

/*5*/
SELECT title FROM borrowed_books
                      JOIN books ON books.id = borrowed_books.book_id
                      JOIN borrowers ON borrowers.id = borrowed_books.borrower_id
WHERE return_date IS NULL;

/*6*/
SELECT name, COUNT(book_id) AS count FROM borrowed_books
    JOIN borrowers on borrowed_books.borrower_id = borrowers.id
GROUP BY name
HAVING count > 1;

/*7*/
SELECT name, email FROM borrowers
WHERE name LIKE 'J%';

/*8*/
SELECT title, price FROM books
WHERE price > 15;

/*9*/
SELECT name, COUNT(book_id) FROM borrowed_books
                                     JOIN borrowers ON borrowed_books.borrower_id = borrowers.id
WHERE return_date IS NOT NULL
GROUP BY name;

/*10*/
SELECT genre, AVG(price) AS avg_price
FROM borrowed_books
         JOIN books ON borrowed_books.book_id = books.id
GROUP BY genre;

/*11*/
SELECT name, title, phone_number
FROM borrowed_books
         JOIN borrowers ON borrowed_books.borrower_id = borrowers.id
         JOIN books ON borrowed_books.book_id = books.id
WHERE phone_number LIKE '%56';

/*12*/
SELECT title, return_date
FROM borrowed_books
         JOIN books ON borrowed_books.book_id = books.id
WHERE return_date > '2025-01-20';

/*13*/
SELECT title, borrow_date, return_date
FROM borrowed_books
         JOIN books ON borrowed_books.book_id = books.id
WHERE return_date IS NOT NULL
ORDER BY return_date;

/*14*/
SELECT genre, COUNT(book_id) AS count
FROM borrowed_books
    JOIN books ON borrowed_books.book_id = books.id
GROUP BY genre
HAVING count >= 2;

/*15*/
SELECT SUM(price) AS total_sum
FROM books;

/*16*/
SELECT name, return_date
FROM borrowed_books
         JOIN borrowers ON borrowed_books.borrower_id = borrowers.id
         JOIN books ON borrowed_books.book_id = books.id
WHERE return_date IS NULL;

/*17*/
SELECT title, name, email
FROM borrowed_books
         JOIN borrowers ON borrowed_books.borrower_id = borrowers.id
         JOIN books ON borrowed_books.book_id = books.id
WHERE email LIKE '%gmail%';