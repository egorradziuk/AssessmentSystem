<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<form action="/r" method="GET">
    <input type="text" value="${richestUser.fullName()}" readonly>
    <button type="submit">get</button>
</form>


<form action="/s" method="GET">
    <input type="text" value="${sum}" readonly>
    <button type="submit">get</button>
</form>--%>
<form action="/" method="GET">
    <table>
        <tr>
            <td>| Id </td>
            <td>| FirstName </td>
            <td>| MiddleName</td>
            <td>| LastName</td>
            <td>| Role</td>
            <td>|</td>
        </tr>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>| ${u.id}</td>
                <td>| ${u.firstName}</td>
                <td>| ${u.middleName}</td>
                <td>| ${u.lastName}</td>
                <td>| ${u.role}</td>
                <td>|</td>
            </tr>
        </c:forEach>
    </table>
    <table>
        <tr>
            <td>| Id </td>
            <td>| Description </td>
            <td>| Test</td>
            <td>| Answer(correct)</td>
            <td>| Answer(description)</td>
            <td>|</td>
        </tr>
        <c:forEach items="${questions}" var="q">
            <tr>
                <td>| ${q.id}</td>
                <td>| ${q.description}</td>
                <td>| ${q.test}</td>
                <c:forEach items="${q.answer}" var="a">
                    <td>| ${a.correct}</td>
                    <td>| ${a.description}</td>
                </c:forEach>
                <td>|</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
