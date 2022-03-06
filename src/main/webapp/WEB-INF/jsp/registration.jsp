<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Регистрация</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>

<body>
<a href="/" class="btn btn-outline-primary">Главная</a>
<div>
  <%--@elvariable id="userForm" type=""--%>
  <form:form method="POST" modelAttribute="userForm">
    <h2>Регистрация</h2>
      <div class="mb-3">
        <label for="UserName" class="form-label">Имя</label>
      <form:input type="text" path="username"   class="form-control" id="UserName" placeholder="Username"
                  autofocus="true"></form:input>
      <form:errors path="username"></form:errors>
        ${usernameError}
    </div>
    <div class="mb-3" >
      <label for="passWord" class="form-label">Пароль</label>
      <form:input type="password" path="password"   class="form-control" id="passWord" placeholder="Password"></form:input>
    </div>
    <div class="mb-3" >
      <label for="ConfirmPassWord" class="form-label">Подтвердите пароль</label>
      <form:input type="password" path="passwordConfirm"  class="form-control" id="ConfirmPassWord"
                  placeholder="Confirm your password"></form:input>
      <form:errors path="password"></form:errors>
        ${passwordError}
    </div>
    <button type="submit" class="btn btn-outline-success">Зарегистрироваться</button>
  </form:form>

</div>
</body>
</html>