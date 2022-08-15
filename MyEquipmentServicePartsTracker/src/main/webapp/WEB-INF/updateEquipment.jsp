<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Equipment</title>
</head>
<body>
 <a href= "home.do" >Home</a>
 <main class="container-fluid">
 <h1>Update Equipment</h1>
 
 <c:choose>

		<c:when test="${empty result }">
			<h2>No equipment listed under that ID number</h2>
		</c:when>

		<c:otherwise>
 
 
 
 	<form action="updatedEquipment.do" method="POST">
		<strong>MANF:</strong> <input type="text" name="equipManf" value="<c:out value="${result.equipManf}"/>"> <br /> 
		<strong>CATEGORY:</strong> <input type="text" name="equipName" value="<c:out value="${result.equipName }"/>"><br />
		<label for="equipName"><em> Category Examples: Lawn mower. Chainsaw, Weed Trimmer</em></label> <br /> 
		<strong>Model:</strong> <input type="text" name="equipMdl" value="<c:out value="${result.equipMdl}"/>"> <br /> 
		<strong>S/N:</strong> <input type="text" name="equipSerNum" /> <br /> 
		<br></br>
		<strong>ENGINE MANF:</strong> <input type="text" name="engManf" value="<c:out value="${result.engManf}"/>"> <br /> 
		<strong>ENGINE MODEL:</strong> <input type="text" name="engMdl" value="<c:out value="${result.engMdl}"/>"> <br /> 
		<strong>ENGINE S/N:</strong> <input type="text" name="engSerNum" value="<c:out value="${result.engSerNum}"/>"> <br /> 
		<br></br>
		<strong>OIL MANF:</strong> <input type="text" name="engOilManf" value="<c:out value="${result.engOilManf}"/>"> <br /> 
		<strong>OIL TYPE:</strong> <input type="text" name="engOilType" value="<c:out value="${result.engOilType}"/>"> <br /> 
		<strong>OIL VISC / GRADE:</strong> <input type="text" name="engOilViscGrd" value="<c:out value="${result.engOilViscGrd}"/>"> <br /> 
		<strong>OIL FILTER MANF:</strong> <input type="text" name="engOilFltrManf" value="<c:out value="${result.engOilFltrManf}"/>"> <br /> 
		<strong>OIL S/N:</strong> <input type="text" name="engOilFltrPrtNum" value="<c:out value="${result.engOilFltrPrtNum}"/>"> <br /> 
		<br></br>
	    <strong>AIR FILTER MANF:</strong> <input type="text" name="engAirFltrManf" value="<c:out value="${result.engAirFltrManf}"/>"> <br /> 
		<strong>AIR FILTER PART NO.:</strong> <input type="text" name="engAirFltrPrtNum" value="<c:out value="${result.engAirFltrPrtNum}"/>"> <br /> 
		<br></br>
		<strong>FUEL TYPE REQ:</strong> <input type="text" name="engFuelSpec" value="<c:out value="${result.engFuelSpec}"/>"> <br /> 
		<strong>FUEL TYPE FILTER MANF:</strong> <input type="text" name="engFuelFltrManf" value="<c:out value="${result.engFuelFltrManf}"/>"> <br /> 
		<strong>FUEL TYPE FILTER PART NO.:</strong> <input type="text" name="engFuelFltrPrtNum" value="<c:out value="${result.engFuelFltrPrtNum}"/>"> <br /> 
		<br></br>
		<strong>2-Cycle Engine:</strong> <input type="checkbox" name="engFuelOil" value="<c:out value="${result.engFuelOil}"/>"> <br /> 
		<strong>FUEL-OIL MANF:</strong> <input type="text" name="engFuelOilManf" value="<c:out value="${result.engFuelOilManf}"/>"> <br /> 
		<strong>FUEL-OIL NAME:</strong> <input type="text" name="engFuelOilName" value="<c:out value="${result.engFuelOilName}"/>"> <br /> 
		<strong>FUEL-OIL S/N:</strong> <input type="text" name="engFuelOilSerNum" value="<c:out value="${result.engFuelOilSerNum}"/>"> <br /> 
		<br></br>
		<strong>CONSUMABLE PART (CP) 1:</strong> <input type="text" name="equipConsName" value="<c:out value="${result.equipConsName}"/>"> <br /> 
		<label for="equipConsName"><em> CP Examples: Battery, Chainsaw bar-oil, Lawn mower blade</em></label><br /> 
		<strong>CP MANF:</strong> <input type="text" name="equipConsManf" value="<c:out value="${result.equipConsManf}"/>"> <br /> 
		<strong>CP PART NO. or S/N:</strong> <input type="text" name="equipConsPrtNum" value="<c:out value="${result.equipConsPrtNum}"/>"> <br /> 
		<br></br>
		<strong>CONSUMABLE PART (CP) 2:</strong> <input type="text" name="equipConsName2" value="<c:out value="${result.equipConsName2}"/>"> <br /> 
		<label for="equipConsName"><em> CP Examples: Weed Trimmer Line, Chain, Lubricant</em></label><br /> 
		<strong>CP MANF:</strong> <input type="text" name="equipConsManf2" value="<c:out value="${result.equipConsManf2}"/>"> <br /> 
		<strong>CP PART NO. or S/N:</strong> <input type="text" name="equipConsPrtNum2" value="<c:out value="${result.equipConsPrtNum2}"/>"> <br /> 
		<br></br>
		<strong>CONSUMABLE PART (CP) 3:</strong> <input type="text" name="equipConsName3" value="<c:out value="${result.equipConsName3}"/>"> <br /> 
		<label for="equipConsName"><em> CP Examples: O-Ring, Hydraulic Fluid, Hardware</em></label><br />
		<strong>CP MANF:</strong> <input type="text" name="equipConsManf3" value="<c:out value="${result.equipConsManf3}"/>"> <br /> 
		<strong>CP PART NO. or S/N:</strong> <input type="text" name="equipConsPrtNum3" value="<c:out value="${result.equipConsPrtNum3}"/>"> <br /> 
		<br></br>
        <label for="equipNotes">NOTES</label>
        <input TYPE="text" class="equipNotes" name ="equipNotes" value="${result.equipNotes}"/>
		<br></br>
<!-- the name attribute must match the parameter name of the method it's being passed to -->
<input type="hidden" value="${result.id} " name="id" /> 
<input type="submit" value="Update" class="update"/> 
	</form>
		</c:otherwise>
	</c:choose>
<!-- </form> 
 -->	</main>
</body>
</html>