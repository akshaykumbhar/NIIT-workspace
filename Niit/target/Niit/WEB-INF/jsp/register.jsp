<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<link href="css/common.css" type="text/css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header class="Header-Bar">
<div class="title">Graphito
</div>

<div class="Nav-Bar">
<a href="login"><button class="btn-special"><b>Sign-in</b></button></a>
<a href="product"><button class="btn-normal">Product</button></a>
<a href="home"><button class="btn-normal">Home</button></a>
</div>
</header>
<h1 id="a1"class="alertm">Register Failed</h1>
<div class="login-container" style="height:800px;margin-bottom:30px">
<form action="userregister" method="post" style="padding-top: 7%;padding-left: 7%;font-size: 149%;">
Email<br>
<input type="text" name="email" ><br>
First Name<br>
<input type="text" name="fname" ><br>
Last Name<br>
<input type="text" name="lname" ><br>
Username<br>
<input type="text" name="username" ><br>
Password<br>
<input type="password" name="password"><br>
Phone number<br>
<input type="text" name="phone" ><br>
Address<br>
<input type="text" name="address" ><br>
<input type="submit" class="btn-normal" value="Sign-in" style="border-color:#00ff00;height: 13%;width: 90%;float:left;border-radius:5px;margin-top:20px;background-color:#70df00;">
</form>
<br>

</div>
<script type="text/javascript">
var msg = ${message};
if(msg == 1)
{
	var al1= document.getElementById("a1");
	al1.style.display="block";
}</script>

</body>
</html>