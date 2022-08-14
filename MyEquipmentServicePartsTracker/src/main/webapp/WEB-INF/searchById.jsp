<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Equipment By Id</title>
</head>
<body>
 <a href= "home.do" >Home</a>
 <h1>Equipment Matching the Submitted Id</h1>
<br></br>
	<c:choose>

		<c:when test="${empty result }">
			<h2>No equipment listed under that ID number</h2>
		</c:when>

		<c:otherwise>
			<table>
					
					<tr>
					<td>
					<h2>${result.equipManf } ${result.equipName } ${result.equipMdl }</h2>
					</td>
					</tr>
					<tr>
					<td>
					<strong>Equipment ID: ${result.id} </strong>
					</td>
					</tr>
					<tr>
					<td>
					<strong>Equipment S/N: ${result.equipSerNum }</strong>
					</td>
					</tr>
					<tr>
						<td><strong> ENGINE MANF: </strong> ${result.engManf }  
						<strong> ENGINE MODEL: </strong>${result.engMdl }
						<strong> ENGINE S/N: </strong>${result.engSerNum }
						</tr>
						<tr>
						<td>
						<strong> OIL MANF: </strong> ${result.engOilManf }
						<strong> OIL TYPE: </strong> ${result.engOilType }
						<strong> OIL VISC / GRADE: </strong> ${result.engOilViscGrd }
						<strong> OIL FILTER MANF: </strong> ${result.engOilFltrManf }
						<strong> OIL S/N: </strong> ${result.engOilFltrPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> AIR FILTER MANF: </strong> ${result.engAirFltrManf }
						<strong> AIR FILTER PART NO.: </strong> ${result.engAirFltrPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> FUEL TYPE REQ: </strong> ${result.engFuelSpec }
						<strong> FUEL FILTER MANF: </strong> ${result.engFuelFltrManf }
						<strong> FUEL FILTER PART NO.: </strong> ${result.engFuelFltrPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> 2-CYCLE ENGINE: </strong> ${result.engFuelOil }
						<strong> FUEL-OIL MANF: </strong> ${result.engFuelOilManf }
						<strong> FUEL-OIL NAME: </strong> ${result.engFuelOilName }
						<strong> FUEL-OIL S/N: </strong> ${result.engFuelOilSerNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> CONSUMABLE PART (CP) 1: </strong> ${result.equipConsName }
						<strong> CP MANF: </strong> ${result.equipConsManf }
						<strong> CP PART NO. or S/N: </strong> ${result.equipConsPrtNum }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> CONSUMABLE PART (CP) 2: </strong> ${result.equipConsName2 }
						<strong> CP MANF: </strong> ${result.equipConsManf2 }
						<strong> CP PART NO. or S/N: </strong> ${result.equipConsPrtNum2 }
						</td> 
					</tr>
					<tr>
						<td>
						<strong> CONSUMABLE PART (CP) 3: </strong> ${result.equipConsName3 }
						<strong> CP MANF: </strong> ${result.equipConsManf3 }
						<strong> CP PART NO. or S/N: </strong> ${result.equipConsPrtNum3 }
						</td> 
					</tr>
					
			</table>
					<br></br>
					<h5>NOTES</h5>
						<p>${result.equipNotes }</p>
						
		</c:otherwise>
	</c:choose>
	
<form action="deleteEquipment.do" method="POST">
<input type="hidden" value="${result.id}" name="DeleteThisEquipment" />
<input type="submit" value="Delete" class="delete"/>
   </form>
<form action="updateEquipment.do" method="GET">
<!-- the name attribute must match the parameter name of the method it's being passed to -->
<input type="hidden" value="${result.id}" name="id" />
<input type="submit" value="Update" class="update"/> 
</form> 
	<p></p>
</body>
</html>