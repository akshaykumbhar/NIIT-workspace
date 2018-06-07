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

<div  style="margin-top:-10px;width=100%">

<c:forEach items="${product}" var="i">
<div class="product">
<h1>${i.getName()}</h1>
<h2>Price:${i.getPrice()}</h2>
<h3>Decription:${i.getDescription()}</h3></div>
</c:forEach>

</div>

</body>
</html>
