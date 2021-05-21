<%--
  Created by IntelliJ IDEA.
  User: duytr
  Date: 5/10/2021
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Create Student</h3>
<form action="/create" method="post">
    <p>Id: <input type="text" name="id"></p>
    <p>Name: <input type="text" name="name"></p>
    <p>Age: <input type="text" name="age"></p>
    <input type="submit" value="Create">
</form>
</body>
</html>
