<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Yahor
  Date: 10.07.2020
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>


    <form action="/goTest" >
        <select id="themes" name="themes">
            <c:forEach items="${topics}" var="topic">
                <option value="" selected disabled hidden>Choose topic</option>
                <option>${topic.name}</option>
            </c:forEach>
        </select>
        <br>
        <select id="tests" name="testName">
            <option>...some thing...</option>
        </select>
        <br>
        <input type="submit" value="пройти тестирование">
    </form>

    <script>
        $().ready(
            function () {
                $("#themes").change(function (event) {
                    $.ajax({
                        url: "/userChoose",
                        type: "GET",
                        dataType: "json",
                        data: {topic: $(event.target).val()},
                    })
                    .done(function(data) {
                        setTests(data)
                    })
                    .fail(function(xhr, status, error) {
                        alert(xhr.responseText + '|\n' + status + '|\n'
                            +error);
                    });
                });
            });
            var setTests = function (data) {
                $('#tests').find('option').remove();
                $.each(data, function (index, value) {
                    $('#tests').append(new Option(value, value));
                });
            };
    </script>

</body>
</html>
