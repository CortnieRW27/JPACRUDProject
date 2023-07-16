<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yummy Cupcakes</title>

<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
  <body>
    <div class="container style" id="focus"></div>


    <div class="container">
<h1>Cupcake List</h1>
  <ul>
    <c:forEach var="cupcake" items="${cupcakeList}">
      <li><a href="getCupcake.do?cupcakeId=${cupcake.id}">${cupcake.type}</a></li>
    </c:forEach>
 </ul>
Look up a Cupcake by ID:
<form action="getCupcake.do" method="GET">
  <input type="number" name="cupcakeId" />
  <input type="submit"/>
</form>

<br/>
<a href = "createdCupcake.do">Create A Cupcake</a>
</div>
</body>
</html>