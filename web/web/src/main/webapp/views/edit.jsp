<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit</h1><br/>

<table>
	<tr>
		<td>
			Name book  old= ${bookOldIn.nameBook}
		</td>
		<td>
			Name book new = ${bookNewIn.nameBook}
		</td>
	</tr>
	
	<tr>
		<td>
			Page  book = ${bookOldIn.numberPage}
		</td>
		<td>
			Page  book = ${bookNewIn.numberPage}
		</td>
	</tr>
	
	<tr>
		<td>
			Autor name old = ${bookOldIn.nameAutor}
		</td>
		<td>
			Autor name new  = ${bookNewIn.nameAutor}
		</td>
	</tr>
	
</table>




<a href="index.jsp"> <--Back </a>	
</body>
</html>