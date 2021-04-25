<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 3/31/2021
  Time: 7:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create student</title>
</head>
<body>
    <h1>Create new Student</h1>
    <form action="save" method="post">
        <table>
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Register</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
