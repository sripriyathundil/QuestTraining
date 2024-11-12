CREATE TABLE Books(
	Book_Id INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(50),
    Author_Id INT,
	FOREIGN KEY (Author_Id) REFERENCES Authors(Author_Id),
	Publication_Year YEAR,
    Price DECIMAL(10,2)
);

CREATE TABLE Authors(
	Author_Id INT PRIMARY KEY AUTO_INCREMENT,
    First_Name VARCHAR(50),
    Last_Name VARCHAR(50)
);

CREATE TABLE Borrowers(
	Borrower_Id INT PRIMARY KEY AUTO_INCREMENT,
    First_Name VARCHAR(50),
    Last_Name VARCHAR(50),
    Email VARCHAR(50) UNIQUE,
    DOB DATE
);

CREATE TABLE Loans(
	Loan_Id INT PRIMARY KEY AUTO_INCREMENT,
    Borrower_Id INT,
	FOREIGN KEY (Borrower_Id) REFERENCES Borrowers(Borrower_Id),
    Book_Id INT,
	FOREIGN KEY (Book_Id) REFERENCES Books(Book_Id),
    Loan_Date DATE,
    Return_Date DATE
);


INSERT INTO Books (Book_Id,Title,Author_id,Publication_Year,Price) 
VALUES(001,'Wuthering Heights',101,1947,120.00),
(002,'Great Expectations',102,1960,118.00),
(003,'Pride and Prejudice',103,1913,125.00),
(004,'David Copperfield',102,1949,120.00),
(005,'Alice In Wonderland',104,1965,125.00);


INSERT INTO Authors (Author_id,First_Name,Last_Name) 
VALUES(101,'Emily','Bronte'),
(102,'Charles','Dickens'),
(103,'Jane','Austen'),
(104,'Lewis','Carol'),
(105,'Roald','Dalh');

SELECT * FROM Authors;

INSERT INTO Borrowers(Borrower_Id,First_Name,Last_Name,Email,DOB)
VALUES(1001,'Alice','Johnson','alicejohnson@gmail.com','1989-09-19'),
(1002,'Bob','Smith','bobsmith@gmail.com','1999-07-06'),
(1003,'Charlie','Brown','charliebrown@gmail.com','2000-10-09'),
(1004,'David','Lee','davidlee@gmail.com','1973-12-05'),
(1005,'Emily','Davis','emilydavis@gmail.com','1979-04-17');

SELECT * FROM Borrowers;

SELECT * FROM Loans;

INSERT INTO Loans(Loan_Id,Borrower_Id,Book_Id,Loan_Date,Return_Date)
VALUES(2401,1001,003,'2024-01-10','2024-01-24'),
(2402,1004,001,'2024-02-01','2024-02-14'),
(2403,1003,005,'2024-03-07','2024-03-21'),
(2404,1005,002,'2024-03-14','2024-03-28'),
(2405,1002,004,'2024-04-08','2024-04-22');

SELECT * FROM Books;
SELECT Title,Price,Publication_Year FROM Books WHERE Price>=120;
SELECT First_Name,Last_Name,Email FROM Borrowers WHERE Borrower_Id IN (SELECT Borrower_Id FROM Loans WHERE Loan_Date>'1902-03-01');

UPDATE Books SET Price = 125.00 WHERE Title = 'Wuthering Heights';

DELETE FROM Loans WHERE book_id = (SELECT book_id FROM Books WHERE title = "David Copperfield");

DELETE FROM Books WHERE Title = 'David Copperfield';

ALTER TABLE Books ADD COLUMN Genere VARCHAR(50);

SELECT COUNT(*) AS TotalBorrowers FROM Borrowers;
SELECT SUM(Price) AS TotalPrice FROM Books;
SELECT AVG(Price) AS AveragePrice FROM Books;

select * from Books where Book_id 
in (select Book_id from loans where Borrower_Id 
in (select Borrower_Id from borrowers where timestampdiff(year, DOB, CURDATE())>30));