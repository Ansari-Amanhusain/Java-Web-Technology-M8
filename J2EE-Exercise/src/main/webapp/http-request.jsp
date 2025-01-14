<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  method ="get" action="HttpServlet">
		<table>
			<tr>
				<td>
					<label>FirstName :</label>
					<input type="text" name="firstname">
				</td>
			</tr>
			<tr>
				<td>
					<label>LastName :</label>
					<input type="text" name="lastname">
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>