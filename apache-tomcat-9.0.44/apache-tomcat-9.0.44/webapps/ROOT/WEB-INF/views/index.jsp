<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 5/22/2021
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Information</title>
</head>
<body>
<h1>Customer Information</h1>
<h3 style="color: red">${message}</h3>

<form action="validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit" value="Validate">
</form>

</body>
</html>
