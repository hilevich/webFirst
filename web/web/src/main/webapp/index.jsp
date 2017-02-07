<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1> Library</h1>

<table>
	<tr>
		<td>
			<p>Save Book </p>
			<form action="saveBook" method="post">
				<lable for="bookNameSave">Name Book</lable>
				<br>
				<input name="bookNameSave">
				<br>
				<lable for="numberPegeSave">Enter number of Book</lable>
				<br>
				<input name="numberPegeSave">
				<br>
				<lable for="autorNameSave">Name Autor</lable>
				<br>
				<input name="autorNameSave">
				<br>
					<button>save Book</button>
			</form>
		</td>
		<td>
		<p>Edit Book by ID </p>
		<form action="editUser" method="post">
				<lable for="bookIdEdit">Book ID</lable>
				<br>
				<input name="bookIdEdit">
				<br/>
				<lable for="bookNameEdit">Name Book(null = do not edit)</lable>
				<br>
				<input name="bookNameEdit">
				<br>
				<lable for="numberPegeEdit">Enter number of Book( 0 = do not edit)</lable>
				<br>
				<input name="numberPegeEdit">
				<br>
				<lable for="autorNameEdit">Name Autor(null = do not edit)</lable>
				<br>
				<input name="autorNameEdit">
				<br>
					<button>edit Book</button>
			</form>
		</td>
		<td>
		<p>Find Book by ID </p>
		<form action="findByID" method="post">
				<lable for="bookIdFind">Book ID</lable>
				<br>
				<input name="bookIdFind">
				<button>find Book</button>
		</form>
		</td>
	</tr>
	<tr>
		<td>
		<p>Find book by name </p>
		<form action="findBookByName" method="post">
				<lable for="bookNameDelete">Book Name</lable>
				<br>
				<input name="bookNameDelete">
				<button>Delete Book</button>
		</form>
		</td>
		<td>
		<p>Delete book by id </p>
		<form action="deleteBook" method="post">
				<lable for="bookIdDelete">Book ID</lable>
				<br>
				<input name="bookIdDelete">
				<button>Delete Book</button>
		</form>
		</td>
		<td>
		
		</td>
	</tr>
</table>
</body>
</html>