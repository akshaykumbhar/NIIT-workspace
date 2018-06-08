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
<h1 class="alertm" style="display:block;margin-bottom:4%;font-size:330%;">Welcome admin</h1>
<a href="adminep"><button class="btn-normal" style="border-color:#00ff00;height: 6%;width: 84%;float:left;border-radius:5px;margin-top:20px;margin-bottom:20px;margin-left:7%;background-color:#70df00;">Product Details</button></a>
<a href="admineu"><button class="btn-normal" style="border-color:#00ff00;height: 6%;width: 84%;float:left;border-radius:5px;margin-top:20px;margin-bottom:20px;margin-left:7%;background-color:#70df00;">User Details</button></a>

</body>
</html>
