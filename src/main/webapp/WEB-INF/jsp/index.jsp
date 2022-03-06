<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE HTML>
<html>
<head>
  <title>Главная</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<div>
  <h3>${pageContext.request.userPrincipal.name}</h3>
  <sec:authorize access="!isAuthenticated()">
    <h4><a href="/login" class="btn btn-outline-primary">Войти</a></h4>
    <h4><a href="/registration" class="btn btn-outline-primary">Зарегистрироваться</a></h4>
    <!--form action="page/login">
    <button type="button" class="btn btn-outline-primary" >Войти</button>
    </form>
    <form action="/registration">
    <button type="button" class="btn btn-outline-primary" >Регистрация</button>
    </form>-->
  </sec:authorize>
  <sec:authorize access="isAuthenticated()">
    <h4><a href="/logout" class="btn btn-outline-primary">Выйти</a></h4>
  </sec:authorize>
  <button type="button" class="btn btn-outline-primary" onclick="window.open('chat.html','_blank')"  >Чат</button>
 <h4><a href="/userAppoint" class="btn btn-outline-primary">Записи (только пользователь)</a></h4>
  <h4><a href="/admin" class="btn btn-outline-primary">Регистратура (только админ)</a></h4>


</div>
</body>
</html>