   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE >
<html>
<head>
<link href="css/common.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
<header class="Header-Bar">
<div class="title">Graphito
</div>
<div class="Nav-Bar">
${slog}
<a href="product"><button class="btn-normal">Product</button></a>
<a href="home"><button class="btn-normal">Home</button></a>
${acc}
${admin}
</div>
</header>
<table border="1" style="background-color:white">
<tr>
<th>ProductID</th>
<th>Name</th>
<th>Seller</th>
<th>Description</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach items="${product}" var="i">
<tr>
<td>${i.getProductId()}</td>
<td>${i.getName()}</td>
<td>${i.getPrice()}</td>
<td>${i.getSeller()}</td>
<td><a href="admineditp?id=${i.getProductId()}">Edit</a></td>
<td><a href="admindelp?id=${i.getProductId()}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
