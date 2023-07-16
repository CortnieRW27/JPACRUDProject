<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>

<div class="container">
  <p>You have a new cupcake!</p>
  <p>${updated.type }</p>
  <a href="home.do">Home</a>
</div>

</body>
</html>