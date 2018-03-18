<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
<header class="jumbotron text-center">
<h1 class="center">Update</h1>
</header>
<form action="updatemet" method="post">
<h3>RollNo:</h3><input type="text" name="rollno" class="form-control"><br>
<h3>Name:</h3><input type="text" name="fname" class="form-control"><br>
<h3>Department</h3><input type="text" name="department" class="form-control"><br>
<input type="submit" value="Update" class="btn btn-primary btn-block">

</form>
</div>
</body>
</html>