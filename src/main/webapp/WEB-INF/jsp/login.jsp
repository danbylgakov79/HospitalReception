<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Вход</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<body>
<sec:authorize access="isAuthenticated()">
  <% response.sendRedirect("/"); %>
</sec:authorize>
<div>
  <form method="POST" action="/login">
    <h2>Вход в систему</h2>
    <div class="mb-3">
      <label for="UserName" class="form-label">Имя</label>
      <input name="username" type="text" class="form-control" id="UserName" placeholder="Username"
             autofocus="true"/>
    </div>
    <div class="mb-3">
      <label for="Password" class="form-label">Пароль
      <input name="password" type="password"  class="form-control" id="Password" placeholder="Password"/>
      </label>
    </div>
      <button type="submit" class="btn btn-outline-success">Log In</button>
      <h4><a href="/registration" class="btn btn-outline-primary">Зарегистрироваться</a></h4>
  </form>
</div>

</body>
</html>
