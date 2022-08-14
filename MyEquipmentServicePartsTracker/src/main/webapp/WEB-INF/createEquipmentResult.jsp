<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your New Equipment</title>
</head>
<body>
 <a href= "home.do" >Home</a>
 <br></br>
 <h1>Your New Equipment</h1>
 	<c:choose>
 		<c:when test="${empty result }">
			<h2>Equipment was unable to be added.</h2>
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
					<strong>${result.equipSerNum }</strong>
					</td>
					</tr>
					
					<tr>
						<td><strong> ENGINE MANF: </strong> ${result.engManf }  
						<strong> ENGINE MODEL: </strong>${result.engMdl }
						<strong> ENGINE S/N: </strong>${result.engMdl }
						<strong> ENGINE MODEL: </strong>${result.engMdl }
						</tr>
						<tr>
						<td>
						<strong> OIL MANF: </strong> ${result.engOilManf }
						<strong> OIL TYPE: </strong> ${result.engOilManf }
						<strong> OIL VISC / GRADE: </strong> ${result.engOilManf }
						<strong> OIL FILTER MANF: </strong> ${result.engOilManf }
						<strong> OIL S/N: </strong> ${result.engOilManf }
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
	</c:otherwise>
</c:choose>
</body>
</html>