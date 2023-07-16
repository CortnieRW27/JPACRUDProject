<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="bootstrapHead.jsp"></jsp:include>
</head>
<body>
<div class="container">
	<h1></h1>
	<a href="home.do">Home</a>
	<br>


	<c:choose>
		<c:when test="${cupcake == true}">
		</c:when>
		<c:otherwise>
			<p>The Cupcake has been Eaten!</p>
		</c:otherwise>

	</c:choose>
</div>
</body>
</html>