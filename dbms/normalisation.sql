use normalisation;
-- 1nf
create table order1nf(
orderid int primary key auto_increment,
customername varchar(50),
productnames varchar(50)
);

insert into order1nf(customername,productnames) values ('John Doe', 'Product A, Product B'),('Jane Smith','Product C, Product D');
select * from order1nf;

create table orderproducts(
	orderid int,
    productname varchar(50),
    primary key (orderid,productname),
    foreign key (orderid) references order1nf(orderid)
);
drop table orderproducts;
insert into orderproducts(orderid,productname) values (1, 'Product A'),(1,'Product B'),(2,'Product C'),(2,'Product D');
-- 2nf
create table students(
student_id int primary key auto_increment,
student_name varchar(50)
);

create table courses(
course_id int primary key,
course_name varchar(50),
instructor_id int
);

create table student_courses(
student_id int,
course_id int,
primary key (student_id,course_id),
foreign key (student_id) references students(student_id),
foreign key (course_id) references courses(course_id)
);
-- 3nf 
create table sales(
salesid int primary key,
productid int,
saledate date
);

create table products3nf(
productid int primary key,
productname varchar(50),
categoryid int
);

create table categories(
categoryid int primary key,
categoryname varchar(50)
);