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
<table border="1" style="margin-left:0.5%;width: 99%;font-size: 116%;">
<tr>
<th>Username</th>
<th>password</th>
<th>Email</th>
<th>Firstname</th>
<th>lastname</th>
<th>PhoneNo.</th>
<th>Address</th>

<th>Delete</th>
</tr>
<c:forEach items="${user}" var="i">
<tr>
<td>${i.getUsername()}</td>
<td>${i.getPassword()}</td>
<td>${i.getEmail()}</td>
<td>${i.getFname()}</td>
<td>${i.getLname()}</td>
<td>${i.getPhone()}</td>
<td>${i.getAddress()}</td>

<td><a href="admindel?user=${i.getUsername()}">Delete</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>
