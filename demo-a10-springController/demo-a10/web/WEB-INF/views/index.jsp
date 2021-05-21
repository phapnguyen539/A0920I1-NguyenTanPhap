<%--
  Created by IntelliJ IDEA.
  User: duytr
  Date: 5/7/2021
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This is my Home</h1>
<h1>${text}</h1>
<form action="/login" method="post">
    <input type="text" name="username">
    <input type="submit" value="Login">
</form>
</body>
</html>
