<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/26/2021
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount</title>
  </head>
  <body>
  <form action="/sanpham" method="post">
    <label>Mo ta san pham:</label> <br/>
    <input type="text" name="sanpham" placeholder="mo ta"/> <br/>
    <label>Gia san pham:</label> <br/>
    <input type="text" name="gia" placeholder="tien"/> <br/>
    <label>Ti le chiet khau</label><br/>
    <input type="submit" id="id" value="submit">
  </form>
  </body>
</html>
