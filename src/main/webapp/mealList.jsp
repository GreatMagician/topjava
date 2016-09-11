<%@ page import="ru.javawebinar.topjava.util.MealsUtil" %>
<%@ page import="java.time.LocalTime" %>
<%@ page import="ru.javawebinar.topjava.model.MealWithExceed" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Meal list</title>
</head>
<body>
<h2><a href="index.html">Home</a></h2>
<h2>Meal list</h2>

<table border="1">
    <tr>
        <td><h3>Дата</h3></td>
        <td><h3>Название</h3></td>
        <td><h3>Калории</h3></td>
    </tr>
    <c:forEach var="m" items="${requestScope.get('filter')}" >
        <c:if test="${m.isExceed() == true}">
            <tr bgcolor="red">
                <td><h3><c:out value="${m.getDateTime().format(requestScope.get('format'))}"/></h3></td>
                <td><h3><c:out value="${m.getDescription()}"/></h3></td>
                <td><h3><c:out value="${m.getCalories()}"/></h3></td>
            </tr>
        </c:if>
        <c:if test="${m.isExceed() == false}">
            <tr bgcolor="#adff2f">
                <td><h3><c:out value="${m.getDateTime().format(requestScope.get('format'))}"/></h3></td>
                <td><h3><c:out value="${m.getDescription()}"/></h3></td>
                <td><h3><c:out value="${m.getCalories()}"/></h3></td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>