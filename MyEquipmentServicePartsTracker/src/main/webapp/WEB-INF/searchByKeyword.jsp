<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Matching Equipment</title>
</head>
<body>
 <a href= "home.do" >Home</a>
 <h1>Matching Equipment</h1>
<br></br>
	<c:choose>

		<c:when test="${empty input }">
			<h2>None of your equipment categories, manufacturers or models match your search</h2>
		</c:when>

		<c:otherwise>
		<c:forEach var="input" items="${input}">
			<table>
					<tr>
					<td>
					<h2>${input.equipManf } ${input.equipName } ${input.equipMdl }</h2>
					</td>
					</tr>
					<tr>
					<td>
					<strong>Equipment ID: ${input.id} </strong>
					</td>
					</tr>
					<tr>
					<td>
					<strong>Equipment S/N: ${input.equipSerNum }</strong>
					</td>
					</tr>
					<tr>
						<td><strong> ENGINE MANF: </strong> ${input.engManf }  
						<strong> ENGINE MODEL: </strong>${input.engMdl }
						<strong> ENGINE S/N: </strong>${input.engSerNum }
						</tr>
						<tr>
						<td>
						<strong> OIL MANF: </strong> ${input.engOilManf }
						<strong> OIL TYPE: </strong> ${input.engOilType }
						<strong> OIL VISC / GRADE: </strong> ${input.engOilViscGrd }
						<strong> OIL FILTER MANF: </strong> ${input.engOilFltrManf }
						<strong> OIL S/N: </strong> ${input.engOilFltrPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> AIR FILTER MANF: </strong> ${input.engAirFltrManf }
						<strong> AIR FILTER PART NO.: </strong> ${input.engAirFltrPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> FUEL TYPE REQ: </strong> ${input.engFuelSpec }
						<strong> FUEL FILTER MANF: </strong> ${input.engFuelFltrManf }
						<strong> FUEL FILTER PART NO.: </strong> ${input.engFuelFltrPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> 2-CYCLE ENGINE: </strong> ${input.engFuelOil }
						<strong> FUEL-OIL MANF: </strong> ${input.engFuelOilManf }
						<strong> FUEL-OIL NAME: </strong> ${input.engFuelOilName }
						<strong> FUEL-OIL S/N: </strong> ${input.engFuelOilSerNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> CONSUMABLE PART (CP) 1: </strong> ${input.equipConsName }
						<strong> CP MANF: </strong> ${input.equipConsManf }
						<strong> CP PART NO. or S/N: </strong> ${input.equipConsPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> CONSUMABLE PART (CP) 2: </strong> ${input.equipConsName2 }
						<strong> CP MANF: </strong> ${input.equipConsManf2 }
						<strong> CP PART NO. or S/N: </strong> ${input.equipConsPrtNum2 }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> CONSUMABLE PART (CP) 3: </strong> ${input.equipConsName3 }
						<strong> CP MANF: </strong> ${input.equipConsManf3 }
						<strong> CP PART NO. or S/N: </strong> ${input.equipConsPrtNum3 }
						</td> 
					</tr>
	</table>
	<br></br>
					<h5>NOTES</h5>
						<p>${input.equipNotes }</p>
	
<form action="deleteEquipment.do" method="POST">
<input type="hidden" value="${input.id}" name="DeleteThisEquipment" />
<input type="submit" value="Delete" class="delete"/>
   </form>
<form action="updateEquipment.do" method="GET">
<input type="hidden" value="${input.id}" name="data" />
<input type="submit" value="Update" class="update"/> 
				</form>	
	</c:forEach>
		</c:otherwise>
	</c:choose>
	<p></p>
</body>
</html>