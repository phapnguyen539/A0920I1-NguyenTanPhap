<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: duytr
  Date: 5/10/2021
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/create">Create Student</a>
<h3>List Student</h3>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
    <tr>
        <td><c:out value="${student.id}"/></td>
        <td><c:out value="${student.name}"/></td>
        <td><c:out value="${student.age}"/></td>
        <td>
            <a href="/delete/<c:out value='${student.id}'/>">Delete</a> |
            <a href="#">Edit</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
