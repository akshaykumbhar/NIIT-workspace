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

<div  style="margin-top:-68px;width=100%;color:white;" >
<Form action="addp" method="post" style="padding-top: 7%;padding-left: 7%;font-size: 149%;margin-bottom:30px;">
Product Name:<br>
<input type="text" value="${product.getName()}" name="name"><br>
Product Brand:<br>
<input type="text" value="${product.getBrand()}" name="brand"><br>
Product Seller:<br>
<input type="text" value="${product.getSeller()}" name="seller"><br>
Product Price:<br>
<input type="text" value="${product.getPrice()}" name="price"><br>
Product Description:<br>
<input type="text" value="${product.getDescription()}" name="name"><br>

<input type="submit" class="btn-normal" value="Add" style="border-color:#00ff00;height: 6%;width: 90%;float:left;border-radius:5px;margin-top:20px;background-color:#70df00;">
</Form>
</div>

</body>
</html>
