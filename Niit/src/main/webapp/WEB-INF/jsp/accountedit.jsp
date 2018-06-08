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
<div>
<form action="accounteditsub" method="post" style="padding-top: 2%;padding-left: 7%;font-size: 149%; margin-bottom:30px;color:white;">
Email<br>
<input type="text" name="email" value="${user.getEmail()}"><br>
First Name<br>
<input type="text" name="fname" value="${user.getFname()}"><br>
Last Name<br>
<input type="text" name="lname" value="${user.getLname()}" ><br>
Username<br>
<input type="text" name="username" value="${user.getUsername()}"><br>
Phone number<br>
<input type="text" name="phone" value="${user.getPhone()}"><br>
Address<br>
<input type="text" name="address" value="${user.getAddress()}"><br>
<input type="submit" class="btn-normal" value="Edit" style="border-color:#00ff00;height: 6%;width: 90%;float:left;border-radius:5px;margin-top:20px;margin-bottom:20px;background-color:#70df00;">
</form>
</div>

</body>
</html>
