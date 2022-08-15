<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Equipment</title>
</head>
<body>
 <a href= "home.do" >Home</a>
 <main class="container-fluid">
 <h1>Delete Equipment</h1>
 
 <c:choose>

		<c:when test="${empty result }">
			<h2>No equipment listed under that ID number</h2>
		</c:when>

		<c:otherwise>
 
			<h2>The equipment has been removed</h2>
		</c:otherwise>
	</c:choose>
<!-- </form> 
 -->	</main>
</body>
</html>