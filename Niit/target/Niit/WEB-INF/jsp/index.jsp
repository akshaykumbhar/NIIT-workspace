   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCType>
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
<div class="slider">
<div class="left-arrow" onclick='left()'><b>&#60;</b></div>
<div class="right-arrow" onclick='right()'><b>&#62;</b></div>
<div style="width:100%;height:100%;"><img id="image_slider"src="image/image1.jpg" id="slider" width="100%" height="100%"style="margin-top:-331px;"></div>
</div>
<div  style="margin-top:-10px;width:100%;hight:10px">
</div>
<div class="productcont">
<c:forEach items="${product}" var="i"  end="3">

<div class="product">
<h1><a href="productpage?id=${i.getProductId()}">${i.getName()}</a></h1>
<h2>Price: &#8377 ${i.getPrice()}</h2>
<h3>Brand:${i.getBrand()}</h3></div>

</c:forEach>

</div>
<script type="text/javascript">
var i=1;
var img=document.getElementById('image_slider');
function left() {
	if(i==1)
	{
		i=2;
		img.src="image/image"+i+".jpg";	
	}
	else
	{
		i=i-1;
		img.src="image/image"+i+".jpg";
	}
}
function right() {
	if(i==2)
	{
		i=1;
		img.src="image/image"+i+".jpg";
	}
	else
	{

		i=i+1;
		img.src="image/image"+i+".jpg";
	}
}
</script>
</body>
</html>
