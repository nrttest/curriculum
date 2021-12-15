<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<div>
	<%@ include file="header.jsp"%>
</div>
<div>
<table>
	<tr>
		<th>name</th>
		<td><input type="text" name="name" size="15"></td>
	</tr>
	<tr>
		<th>id</th> 
		<td><input type="text" name="id" size="15"></td>
	</tr>
</table>
</div>
<div>
	<%@ include file="footer.jsp"%>
</div>
</body>
</html>