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
<a href="login"><button class="btn-special"><b>Sign-in</b></button></a>
<a href="product"><button class="btn-normal">Product</button></a>
<a href="#"><button class="btn-normal">Home</button></a>
</div>
</header>
<div class="slider">
<div class="left-arrow" onclick='left()'><b>&#60;</b></div>
<div class="right-arrow" onclick='right()'><b>&#62;</b></div>
<div style="width:100%;height:100%;"><img id="image_slider"src="image/image1.jpg" id="slider" width="100%" height="100%"style="margin-top:-527px;"></div>
</div>
<div class="slider" style="margin-top:-10px;height: 224px;">
<div class="left-arrow" style="height: 150px;padding-top: 5.8%;padding-left: 0px;"onclick='left()'><b>&#60;</b></div>
<div class="right-arrow" style="height: 150px;padding-top: 5.8%;padding-right: 0px;" onclick='right()'><b>&#62;</b></div>
<div class="products"></div>
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
