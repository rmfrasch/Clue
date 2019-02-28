<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clue Sheet</title>
</head>
<body>
<form action="ClueGameServlet" method="post">
	<h1>Suspects</h1>
	<table>
		<tr>
			<!--  check-boxes for suspects -->
			<td><input type="checkbox" name="scarlet" value="x"><span>Miss Scarlet</span></td>
			<td><input type="checkbox" name="mustard" value="x"><span>Col. Mustard</span></td>
			<td><input type="checkbox" name="white" value="x"><span>Mrs. White</span></td>
			<td><input type="checkbox" name="green" value="x"><span>Mr. Green</span></td>
			<td><input type="checkbox" name="peacock" value="x"><span>Ms. Peacock</span></td>
			<td><input type="checkbox" name="plum" value="x"><span>Prof. Plum</span></td>
		</tr>
	</table>
	<h1>Rooms</h1>
	<table>
		<tr>
			<!--  check-boxes for rooms -->
			<td><input type="checkbox" name="ballroom" value="x"><span>Ballroom</span></td>
			<td><input type="checkbox" name="kitchen" value="x"><span>Kitchen</span></td>
			<td><input type="checkbox" name="conservatory"
				value="x"><span>Conservatory</span></td>
			<td><input type="checkbox" name="billard" value="x"><span>Billiard Room</span></td>
			<td><input type="checkbox" name="dining" value="x"><span>Dining Room</span></td>
			<td><input type="checkbox" name="library" value="x"><span>Library</span></td>
			<td><input type="checkbox" name="hall" value="x"><span>Hall</span></td>
			<td><input type="checkbox" name="study" value="x"><span>Study</span></td>
			<td><input type="checkbox" name="lounge" value="x"><span>Lounge</span></td>
		</tr>
	</table>
	<h1>Weapons</h1>
	<table>
		<tr>
			<!--  check-boxes for weapons -->
			<td><input type="checkbox" name="knife" value="x"><span>Knife</span></td>
			<td><input type="checkbox" name="candlestick"
				value="x"><span>Candlestick</span></td>
			<td><input type="checkbox" name="pipe" value="x"><span>Lead Pipe</span></td>
			<td><input type="checkbox" name="revolver" value="x"><span>Revolver</span></td>
			<td><input type="checkbox" name="rope" value="x"><span>Rope</span></td>
			<td><input type="checkbox" name="wrench" value="x"><span>Wrench</span></td>
		</tr>
	</table>
	<br>
	<input type="submit" name="thisClicked" value="Submit">
	<input type="submit" name="thisClicked" value="Back">
	</form>
</body>
</html>