<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cupcakes</title>
  <jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>

<div class="container">

  <h3>${cupcake.type }</h3>



<form action="update.do" method="post">
  <input type="hidden" name="id" value="${cupcake.id}">
  <input type="text" name="type" value="${cupcake.type }">
</br>
</br>
  <input type="text" name="cakeFlavor" value="${cupcake.cakeFlavor }">
</br>
</br>
  <input type="text" name="icingFlavor" value="${cupcake.icingFlavor }">
<button type="Update">Update</button>
</form>
<br/>

<form action="delete.do" method="post">
  <p> Eat, I mean delete a cupcake</p>
  <input type="hidden" name="id" value="${cupcake.id}"/>
  <button type="submit"> Delete</button>
</form>
<br/>

<a href="home.do">Home</a>
</div>
</body>
</html>