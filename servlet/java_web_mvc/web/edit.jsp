<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/5/2021
  Time: 8:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1>Edit Customer</h1>
<p>
    <c:if test='${requestScope["message"]!=null}'>
<span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/customer">Back to customer list</a>
</p>
<form method="post" action="">
    <fieldset>
        <legend>Customer Information</legend>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name" value="${customer.getName()}"></td>
        </tr>
        <tr>
            <td>Email
            </td>
            <td type="text" name="email" id="email" value="${customer.getEmail()}"></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td type="text" name="address" id="address" value="${customer.getAddress()}"></td>
        </tr>
        <tr>
            <td></td>
            <td typeof="submit" value="Update customer"></td>
        </tr>
    </fieldset>


</form>

</body>
</html>
