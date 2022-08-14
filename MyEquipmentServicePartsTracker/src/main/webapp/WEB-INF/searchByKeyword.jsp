<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Keyword Search Results</title>
</head>
<body>
 <a href= "home.do" >Home</a>
<h1>Matches Related To Your Search</h1>

<c:choose>

		<c:when test="${empty equipmentMatches }">
			<h2>No film found</h2>
		</c:when>

		<c:otherwise>
			<table>
		<c:forEach var="result" items="${equipmentMatches}">
						<tr>
					<td>
					<strong>FILM ID: </strong> ${equipmentMatches.id }
					</td>
					</tr>
					
					<tr>
						<td><strong> FILM TITLE: </strong> ${equipmentMatches.title }  
						<strong> YEAR: </strong>${equipmentMatches.releaseYear }
						<strong> FILM CATEGORY: </strong> ${equipmentMatches.category }
						<strong> FILM RATING: </strong>${equipmentMatches.rating }  
						<strong> FILM LENGTH: </strong>${equipmentMatches.length } 
						<strong> LANGUAGE: </strong> ${equipmentMatches.language }
						</td> 
					</tr>
					
					<tr>
					<td>
					<strong> FILM DESCRIPTION: </strong>${equipmentMatches.description }
					</td>
					</tr>
					
					<tr>
					<td>
					<strong> FILM ACTORS: </strong>${equipmentMatches.actors }
					</td>
					</tr>
					
					<tr>
					<td>
					<strong> SPECIAL FEATURES: </strong>${equipmentMatches.specialFeatures } 
					</td>
					</tr>
					
					<tr>
					<td>
					<strong>RENTAL DURATION: </strong>${equipmentMatches.rentalDuration } <strong>   RENTAL RATE: </strong>${equipmentMatches.rentalRate } <strong>   REPLACEMENT COST: </strong> ${equipmentMatches.replacementCost }
					</td>
					</tr>
					<tr><td>
					<form action="deleteFilm.do" method="POST">
<input type="hidden" value="${equipmentMatches.id}" name="DeleteThisFilm" />
<input type="submit" value="Delete" class="delete"/>
   </form>
<form action="updateFilm.do" method="GET">
<input type="hidden" value="${equipmentMatches.id}" name="data" />
<input type="submit" value="Update" class="update"/>
</form>
					</td></tr>
					<tr><td></td></tr>					
					<tr><td></td></tr>					
					<tr><td></td></tr>						
	</c:forEach>
			</table>
		</c:otherwise>

	</c:choose>
</body>
</html>