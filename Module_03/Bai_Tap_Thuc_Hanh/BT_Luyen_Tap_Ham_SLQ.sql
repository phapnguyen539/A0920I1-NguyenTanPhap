drop database bt_luyen_tap_ham_sql;
create database bt_luyen_tap_ham_sql;
use bt_luyen_tap_ham_sql;
create table manager_kh(
id int,
name varchar(50),
age int,
khoahoc varchar(50),
sotien double
);
insert into manager_kh(id,name,age,khoahoc,sotien) value (1,'Hoàng',21,'cntt',400),(2,'Việt',19,'dvvt',320),
(3,'thanh',18,'ktdn',400),(4,'Nhan',19,'ck',450),(5,'Hương',20,'tcnh',500),(5,'Hương',20,'tcnh',200);
-- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong
-- select name from manager_kh
-- where name="Hương"
 
 -- Viết câu lệnh lấy ra tổng số tiền của Huong
 -- select name ,sum(sotien) AS "Tổng số tiền của Hương" from manager_kh
-- where name="Hương"

-- Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp
-- select name from manager_kh
-- group by name 


 
