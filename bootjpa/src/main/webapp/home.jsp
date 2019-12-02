<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Welocome to Home page</h1>

	<h1> Save Alien Details</h1>
	<form action="addAlien">
	<label>Name</label>
	<input type="text" name="aname">
	<label>language</label>
	<input type="text" name="alang">
	<input type="submit" value="submit">
	</form>
	
	
	<hr>
	<h1> Get Aline by Id </h1>
	<form action="getAlienById">
	<label>id</label>
	<input type="text" name="aid">
	
	<input type="submit" value="submit">
	</form>
	
</body>
</html>