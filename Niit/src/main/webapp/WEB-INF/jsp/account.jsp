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
<div style="padding-top: 2%;padding-left: 7%;font-size: 123%; margin-bottom:30px;color:white;">
<h1 style="color:white;">Username: ${user.getUsername()}</h1>
<h2 style="color:white;">Password: ${user.getPassword()}</h2>
<h2 style="color:white;">FirstName: ${user.getFname()}</h2>
<h2 style="color:white;">Last Name: ${user.getLname()}</h2>
<h2 style="color:white;">PhoneNo.: ${user.getPhone()}</h2>
<h2 style="color:white;">Address: ${user.getAddress()}</h2>

</div>

<a href="accountedit" ><button class="btn-normal" style="border-color:#00ff00;height: 6%;width: 84%;float:left;border-radius:5px;margin-top:20px;margin-bottom:20px;margin-left:7%;background-color:#70df00;">Edit</button></a>

</body>
</html>
