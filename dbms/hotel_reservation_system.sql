use hotel_reservation_system;

create table customers(
	customer_id int primary key,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(50),
    phone_number varchar(50),
    address varchar(100)
);

create table rooms(
	room_id int primary key,
    room_type varchar(50),
    price_per_night decimal(10,2),
    room_availability varchar(50),
    floor_number int 
);

create table reservations(
	reservation_id int primary key,
    customer_id int,
    room_id int,
    reservation_date date,
    check_in_date date,
    check_out_date date,
    reservation_status varchar(50),
    foreign key (customer_id) references customers(customer_id),
	foreign key (room_id) references rooms(room_id)
);

create table payments(
	payment_id int primary key,
    reservation_id int,
    payment_date date,
    amount_paid decimal(10,2),
    payment_method varchar(50),
    foreign key (reservation_id) references reservations(reservation_id)
);

create table staff(
	staff_id int primary key,
    first_name varchar(50),
    last_name varchar(50),
    staff_role varchar(50),
    hire_date date
);

create table roomassignments(
	assignment_id int primary key,
    staff_id int,
    room_id int,
    assignment_date date,
    task_description varchar(50),
    foreign key (staff_id) references staff(staff_id),
    foreign key (room_id) references rooms(room_id)
);

insert into customers(customer_id,first_name,last_name,email,phone_number,address) 
values(001,'John','Doe','johndoe@gmail.com',7768565789,'Mumbai'),
(002,'Jane','Smith','janesmith@gmail.com',6678905678,'Kolkata'),
(003,'Michael','Johnson','michaeljohnson@gmail.com',7756908909,'Kerala'),
(004,'Emily','Brown','emilybrown@gmail.com',9983450967,'Banglore'),
(005,'David','Lee','davidlee@gmail.com',8890780956,'Chennai');

insert into rooms(room_id,room_type,price_per_night,room_availability,floor_number) 
values(101,'Single',50.00,'Occupied',1),
(201,'Double',80.00,'Available',2),
(301,'Suite',150.00,'Occupied',3),
(102,'Single',50.00,'Available',1),
(202,'Double',80.00,'Available',2);

insert into reservations(reservation_id,customer_id,room_id,reservation_date,check_in_date,check_out_date,reservation_status)
values(100,001,101,'2024-11-09','2024-11-13','2024-11-16','confirmed'),
(200,002,201,'2024-10-09','2024-10-10','2024-10-12','completed'),
(300,003,301,'2024-11-10','2024-11-15','2024-11-18','confirmed'),
(400,004,102,'2024-11-15','2024-11-17','2024-11-20','cancelled'),
(500,005,202,'2024-11-19','2024-11-21','2024-11-24','confirmed');

insert into payments(payment_id,reservation_id,payment_date,amount_paid,payment_method)
values(1001,100,'2024-11-09',150.00,'credit card'),
(1002,200,'2024-10-10',240.00,'debit card'),
(1003,300,'2024-11-10',150.00,'cash'),
(1004,400,'2024-11-16',240.00,'credit card'),
(1005,500,'2024-11-19',150.00,'debit card');

insert into staff(staff_id,first_name,last_name,staff_role,hire_date)
values(1,'Alice','Johnson','Receptionist','2023-01-01'),
(2,'Bob','Smith','Manager','2022-09-01'),
(3,'Charlie','Brown','Housekeeping','2023-08-01'),
(4,'David','Lee','Maintenance','2021-10-01'),
(5,'Emily','Wilson','Front Desk','2020-12-01');

insert into roomassignments(assignment_id,staff_id,room_id,assignment_date,task_description)
values(2001,1,101,'2024-11-13','check-in'),
(2002,2,201,'2024-10-10','cleaning'),
(2003,3,301,'2024-11-17','maintenance'),
(2004,4,102,'2024-11-19','check-in'),
(2005,5,202,'2024-11-21','inspection');

SELECT * FROM rooms r
LEFT JOIN reservations res ON r.room_id = res.room_id
WHERE r.room_id LIKE '1%' ;

SELECT r.reservation_id, c.first_name, c.last_name, c.email, r.check_in_date
FROM reservations r, customers c
WHERE r.customer_id = c.customer_id
ORDER BY r.check_in_date ASC;

SELECT c.first_name, c.last_name, c.email, DATEDIFF(r.check_out_date, r.check_in_date) AS DaysStayed
FROM reservations r, customers c
WHERE r.customer_id = c.customer_id AND DATEDIFF(r.check_out_date, r.check_in_date) > 2;

SELECT r.reservation_id, SUM(p.amount_paid) AS TotalPaid
FROM reservations r, payments p
WHERE r.reservation_id = p.reservation_id
GROUP BY r.reservation_id;

SELECT room_type, AVG(price_per_night) AS AveragePrice
FROM rooms
GROUP BY room_type;

select sum(p.amount_paid) as total_revenue
from reservations r
join payments p on r.reservation_id = p.reservation_id
where r.reservation_date >= date_add(current_date,interval -1 month) 
and r.reservation_date < current_date;

select c.*,r.*
from customers c
full outer join reservations r on c.customer_id = r.customer_id;

SELECT c.first_name, c.last_name, r.reservation_id, r.check_in_date
FROM customers c
JOIN reservations r ON c.customer_id = r.customer_id
GROUP BY c.customer_id
HAVING r.check_in_date = MAX(r.check_in_date);


DELETE FROM payments
WHERE reservation_id = 300;

DELETE FROM reservations
WHERE reservation_id = 300;  

select * from reservations;

SELECT r.room_id
FROM rooms r
WHERE NOT EXISTS (
    SELECT 1
    FROM reservations res
    WHERE r.room_id = res.room_id
      AND (res.check_in_date BETWEEN '2024-11-10' AND '2024-11-20'
           OR res.check_out_date BETWEEN '2024-11-14' AND '2024-11-25')
);
