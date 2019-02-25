<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="ClueGameServelet">
		<table>
			<c:forEach items="${requestScope.allItems}" var="currentitem">
				<tr>
					<!--  have to change to clue id -->
					<td><input type="text" name="fieldID" value="${currentitem.fieldID}"> </td>
					<td>${currentitem.clueGameId}</td>
					<td>${currentitem.scarlet}</td>
					<td>$[currentitem.mustard}</td>
					<td>$[currentitem.white}</td>
					<td>$[currentitem.green}</td>
					<td>$[currentitem.peacock}</td>
					<td>$[currentitem.plum}</td>
					<td>$[currentitem.knife}</td>
					<td>$[currentitem.candlestick}</td>
					<td>$[currentitem.pipe}</td>
					<td>$[currentitem.revolver}</td>
					<td>$[currentitem.rope}</td>
					<td>$[currentitem.wrench}</td>
					<td>$[currentitem.ballroom}</td>
					<td>$[currentitem.kitchen}</td>
					<td>$[currentitem.conservatory}</td>
					<td>$[currentitem.billard}</td>
					<td>$[currentitem.dining}</td>
					<td>$[currentitem.library}</td>
					<td>$[currentitem.hall}</td>
					<td>$[currentitem.study}</td>
					<td>$[currentitem.lounge}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToItem"> <input
			type="submit" value="delete" name="doThisToItem"> <input
			type="submit" value="add" name="doThisToItem">
	</form>

</body>
</html>