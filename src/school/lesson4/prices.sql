/*MySQL*/

/*1*/
CREATE DATABASE foodsdb;
USE foodsdb;

CREATE TABLE types(
ID INT PRIMARY KEY AUTO_INCREMENT,
type VARCHAR(20) NOT NULL);

CREATE TABLE foods(
ID INT PRIMARY KEY AUTO_INCREMENT,
type_id INT NOT NULL,
FOREIGN KEY (type_id) REFERENCES types(ID)
ON UPDATE CASCADE,
food VARCHAR(30) NOT NULL,
quantity INT NOT NULL,
price DECIMAL(5, 2) NOT NULL);

/*2*/
INSERT INTO types (type) VALUES
('Fruits'),
('Vegetables'),
('Grains'), 
('Dairy'), 
('Meats'), 
('Nuts'), 
('Seeds'),
('Legumes');

INSERT INTO foods (type_id, food, quantity, price) VALUES
(1, 'APPLES', 1000, 8.45),
(1, 'bananas', 1000, 9.7),
(1, 'oranges', 1000, 9.71),
(1, 'strawberries', 100, 11.55),
(1, 'blueberries', 100, 11.69),
(2, 'broccoli', 250, 7.75),
(2, 'spinach', 100, 4.14),
(2, 'carrots', 1000, 7.04),
(2, 'tomatoes', 1000, 4.25),
(2, 'potatoes', 1000, 3.08),
(3, 'oranges', 1000, 4.95),
(3, 'rice', 1000, 4.48),
(3, 'wheat', 1000, 8.2),
(3, 'oats', 1000, 6.23),
(3, 'barley', 1000, 4.39),
(3, 'quinoa', 1000, 10.43),
(4, 'milk', 1000, 5.17),
(4, 'cheese', 1000, 4.87),
(4, 'yogurt', 1000, 9.27),
(4, 'butter', 1000, 8.58),
(5, 'beef', 1000, 11.31),
(5, 'chicken', 1000, 6.04),
(5, 'pork', 1000, 5.58),
(5, 'lamb', 1000, 10.49),
(5, 'fish', 1000, 11.09),
(6, 'almonds', 200, 3.33),
(6, 'walnuts', 200, 3.32),
(6, 'pistachios', 200, 6.85),
(6, 'cashews', 200, 6.38),
(7, 'almonds', 200, 9.72),
(7, 'walnuts', 200, 10.52),
(7, 'pistachois', 200, 10.21),
(7, 'cashews', 200, 3.78),
(8, 'beans', 1000, 9.18),
(8, 'lentils', 1000, 5.43),
(8, 'peas', 1000, 7.09),
(8, 'chickpeas', 1000, 11.01),
(8, 'soybeans', 250, 10.32);

/*3*/
SELECT f.food, t.type FROM foods AS f
JOIN types AS t ON f.type_id = t.id
WHERE f.food LIKE '_a%'
ORDER BY price / quantity;

/*4*/
UPDATE types
SET id = 10
WHERE id = 5;

SELECT * FROM foods
WHERE type_id = 10
ORDER BY food DESC;

/*5*/
SELECT t.type, COUNT(*) AS cnt , SUM(price) AS price_sum
FROM types AS t
JOIN foods AS f ON t.id = f.type_id
GROUP BY t.type
HAVING price_sum > 30
ORDER BY price_sum DESC;

/*6*/
SELECT food,
ROUND(CEIL(price/1.95583 * 10) / 10, 2) AS in_euro,
ROUND((CEIL(price/1.95583 * 10) / 10 * 1.95583 - price), 2) AS increase 
FROM foods
ORDER BY increase DESC, food;

/*7*/


