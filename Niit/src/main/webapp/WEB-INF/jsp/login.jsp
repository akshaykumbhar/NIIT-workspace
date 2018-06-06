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
<div class="login-container">
<form action="" method="post" style="padding-top: 10%;padding-left: 7%;font-size: 149%;">
Username<br>
<input type="text" name="username" ><br>
Password<br>
<input type="password" name="password"><br>
<input type="submit" class="btn-normal" value="Sign-in" style="border-color:#00ff00;height: 13%;width: 90%;float:left;border-radius:5px;margin-top:20px;background-color:#70df00;">
</form>
<br>
<a href="register" style="font-size:130%;float: left;margin:10%;padding-left: 14%;color: black;">New Member? Register Here</a>
</div>
</body>
</html>