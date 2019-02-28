<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View all past games</title>
</head>
<body>
	<form method="post" action="NavigationServlet">
		<table>
			<c:forEach items="${requestScope.allItems}" var="currentitem">
				<tr>
					<!--  I think this will output all the games. Have to add edit, delete, and new game button here as per the teachers requirements-->
					<td><input type="radio" name="gameId" value="${currentitem.gameId}"> </td>
					 <td>  Game ID:  ${currentitem.gameId}</td>
					 <td>  Player Number:  ${currentitem.playerNum}</td>
					<td>${currentitem.datePlayed}</td>
					<!-- <td>$[currentitem.white}</td>
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
					<td>$[currentitem.lounge}</td> -->
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToItem"> <input
			type="submit" value="delete" name="doThisToItem"> <input
			type="submit" value="add" name="doThisToItem">
	</form>

</body>
</html>