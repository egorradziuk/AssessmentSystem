<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<%--<form action="/r" method="GET">
    <input type="text" value="${richestUser.fullName()}" readonly>
    <button type="submit">get</button>
</form>


<form action="/s" method="GET">
    <input type="text" value="${sum}" readonly>
    <button type="submit">get</button>
</form>--%>
<<%--form action="/" method="GET">
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
    <table>
        <tr>
            <td>| Id </td>
            <td>| Date </td>
            <td>| Correct</td>
            <td>| Question</td>
            <td>| User</td>
            <td>|</td>
        </tr>
        <c:forEach items="${statistics}" var="s">
            <tr>
                <td>| ${s.id}</td>
                <td>| ${s.date}</td>
                <td>| ${s.correct}</td>
                <td>| ${s.question}</td>
                <td>| ${s.user}</td>
                &lt;%&ndash;<c:forEach items="${s.question}" var="q">
                    <td>| ${q.id}</td>
                </c:forEach>
                <c:forEach items="${s.user}" var="u">
                    <td>| ${u.id}</td>
                </c:forEach>&ndash;%&gt;
                <td>|</td>
            </tr>
        </c:forEach>
    </table>--%>
    <button type="button" class="btn btn-dark">Dark</button>
    <div class="dropdown">
        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            something
        </button>
        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
            <c:forEach items="${users}" var="u">
                <tr>
                    <a class="dropdown-item" href="#">
                            <%--${u.firstName} ${u.middleName} ${u.lastName}--%>
                        ${u}
                    </a>
                </tr>
            </c:forEach>


        </div>
</div>
</form>
</body>
</html>
