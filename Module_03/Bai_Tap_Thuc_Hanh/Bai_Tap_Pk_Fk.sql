drop database if exists manager_bank;
create database manager_bank;
create table manager_bank.customer(
customer_number int,
fullname varchar(50),
address varchar(50),
email varchar(50),
phone int,
constraint pk_customer primary key(customer_number)
);

create table manager_bank.accounts(
account_number int,
account_type varchar(50),
account_date date,
balance float,
constraint pk_account primary key(account_number),
constraint fk_account foreign key(account_number) references customer(customer_number)
);
create table manager_bank.transactions(
tran_number int,
account_number int,
tran_date date,
amounts float,
descriptions varchar(100),
constraint pk_tran primary key(tran_number),
constraint fk_tran foreign key(tran_number) references accounts(account_number)
);