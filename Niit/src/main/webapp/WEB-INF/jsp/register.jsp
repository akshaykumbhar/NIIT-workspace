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
<a href="#"><button class="btn-normal">Home</button></a>
</div>
</header>
<div class="login-container">
<form action="" method="post">
<table>
<tr>
<td><b>Username</b></td>
<td><input type="text" name="username" placeholder="Username">
</tr>
<tr>
<td><b>Password</b></td>
<td><input type="password" name="passowrd" placeholder="password">
</td>
</tr>
</table>
<input type="submit" value="Log-in">
</form>
<a href="register">Alreadt Member? Login Here</a>
</div>
</body>
</html>