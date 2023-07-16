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
<form action="create.do" method="post">

Type: <input type="text" name="type">
</br>
</br>
Cake Flavor: <input type="text" name="cakeFlavor">
</br>
</br>
Icing Flavor: <input type="text" name="icingFlavor">
</br>
</br>
</br>
<button type="submit">Create A Cupcake</button>

</form>
</div>
</body>
</html>