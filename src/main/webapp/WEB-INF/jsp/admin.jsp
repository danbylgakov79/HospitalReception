<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Log in with your account</title>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <style>

    table {
      font-family: arial, sans-serif;
      border-collapse: collapse;
      width: 100%;
    }

    td, th {
      border: 1px solid #dddddd;
      text-align: left;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
  </style>
</head>

<body>
<div>

  <button type="button" class="btn btn-outline-primary" onclick="document.location='http://localhost:8080/ind.html'">Регистратура</button>
  <button type="button" class="btn btn-outline-primary" onclick="document.location='http://localhost:8080/doctor.html'">Врачи</button>
  <button type="button" class="btn btn-outline-primary" onclick="document.location='http://localhost:8080/patient.html'">Пациенты</button>
  <button type="button" class="btn btn-outline-primary" onclick="document.location='http://localhost:8080/laboratory.html'">Лаборатории</button>
  <button type="button" class="btn btn-outline-primary" onclick="document.location='http://localhost:8080/chat.html'">Чат</button>
  <a href="/" class="btn btn-outline-primary">Главная</a>
  <table class="table table-borderless" >
    <thead>
    <th>ID</th>
    <th>UserName</th>
    <th>Password</th>
    <th>Roles</th>
    </thead>
    <c:forEach items="${allUsers}" var="user">
      <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>
          <c:forEach items="${user.roles}" var="role">${role.name}; </c:forEach>
        </td>
        <td>
          <form action="${pageContext.request.contextPath}/admin" method="post">
            <input type="hidden" name="userId" value="${user.id}"/>
            <input type="hidden" name="action" value="delete"/>
            <button type="submit" class="btn btn-outline-danger">Удалить</button>

          </form>
        </td>
      </tr>
    </c:forEach>
  </table>

</div>
</body>
</html>