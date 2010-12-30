<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="scripts/jquery.js"></script> -->
<!-- <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/dojo/1.2/dijit/themes/tundra/tundra.css" /> -->


<script src="http://ajax.googleapis.com/ajax/libs/dojo/1.5/dojo/dojo.xd.js" type="text/javascript"></script>



<script type="text/javascript">

	

</script>

</head>
<body>

<form:form method="post" action="user/add" commandName="user">
	<table>
		<tr>
			<td><form:label path="name">Name</form:label> </td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td><form:label path="email">Email</form:label> </td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Add"/>
			</td>
		</tr>
	</table>
</form:form>

<c:if test="${!empty userList }">
	<table class="data">
	<tr>
		<th>Name</th>
		<th>Email</th>
	</tr>
<c:forEach items="${userList }" var="user">
	<tr>
		<td>${user.name }</td>
		<td>${user.email }</td>
	</tr>
</c:forEach>	
	</table>
</c:if>
</body>
</html>