 use classicmodels;
-- select productcode,productname,buyprice,quantityinstock from products
-- where buyprice>56.57 and quantityinstock>10productlinesproductlinesproducts

--  select productcode,productname,buyprice,textdescription from products 
--  inner join productlines on products.productline = productlines.productline 
--  where buyprice>56.76 and buyprice<95.59
--  
-- lấy từ hai bảng customers và payments

-- select customers.customerNumber, customerName, phone, paymentDate, amount from customers
-- inner join payments
-- on customers.customerNumber = payments.customerNumber
-- where city = 'Las Vegas'

-- Bài toán đặt ra muốn biết có bao nhiêu đơn đặt hàng trong mỗi trạng thái, chúng ta có thể sử dụng hàm COUNT với mệnh đề GROUP BY như:
-- select status, COUNT(*) as 'So luong status'
-- from orders
-- group by status
-- thực hiện tính tổng số tiền của các đơn hàng theo trạng thái đặt hàng. Ta sẽ sử dụng lệnh inner join để kết nối 2 bảng
-- và sử dụng hàm sum để tính tổng số tiền, nhóm theo trường status. Lệnh truy vấn được như sau:

-- select status, sum(quantityOrdered * priceEach) as amount
-- from orders 
-- inner join orderdetails on orders.ordernumber = orderdetails.ordernumber
-- group by status

 -- Một yêu cầu khác là tính tổng tiền của từng đơn hàng, thực hiện lệnh truy vấn sau:

-- select orderNumber, sum(quantityOrdered * priceEach) as total
-- from orderdetails
-- group by orderNumber;

/*Để lọc các nhóm được trả về bởi mệnh đề GROUP BY, chúng ta sử dụng mệnh đề HAVING.
 Truy vấn sau đây sử dụng mệnh đề HAVING để bao gồm tổng doanh thu của những năm lớn hơn năm 2003.

select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from orders 
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003  */

