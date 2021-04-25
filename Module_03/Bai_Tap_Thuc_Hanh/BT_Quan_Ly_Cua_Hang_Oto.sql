drop database if exists bt_cuahangoto;
create database bt_cuahangoto;
use bt_cuahangoto;
create table bt_cuahangoto.customers(
customer_number int,
customer_name varchar(50),
phone int,
address varchar(50),
constraint pk_customer primary key(customer_number)
);
create table bt_cuahangoto.orders(
order_number int,
order_date date not null,
required_date date not null,
shipped_date date not null,
amount int,
price float,
order1_number int,
constraint pk_order primary key(order_number),
constraint fk_order foreign key (order1_number) references customers (customer_number)
);

create table bt_cuahangoto.products(
product_number int,
product_name varchar(50),
 supplier varchar(50),
 amount int,
 import_price float,
 price float,
 product1_number int,
 constraint pk_product primary key(product_number),
 constraint fk_product foreign key(product1_number) references orders(order_number)
);
create table bt_cuahangoto.productsline(
productline_number int,
descriptions varchar(100),
productline1_number int,
constraint pk_productline primary key(productline_number),
constraint fk_productline foreign key(productline1_number) references products(product_number)
);


create table bt_cuahangoto.payments(
payment_number int,
payment_date date,
money float,
payment1_number int,
constraint pk_payment primary key (payment_number),
constraint fk_payment foreign key(payment1_number) references customers(customer_number)
);

create table bt_cuahangoto.employees(
employee_number int ,
employee_name varchar(50),
email varchar(50),
work_name varchar(50),
employee1_number int,
constraint pk_employee primary key (employee_number),
constraint fk_employee foreign key (employee1_number) references customers(customer_number)
);
create table bt_cuahangoto.offices(
office_number int,
address varchar(50),
phone int,
country varchar(50),
office1_number int,
constraint pk_office primary key (office_number),
constraint fk_office foreign key(office1_number) references employees(employee_number)
);

insert into customers (customer_number,customer_name,phone,address) value (1,'nguyen van a',0909,'da nang');

select * from customers
where phone>90 and custome_number=1

