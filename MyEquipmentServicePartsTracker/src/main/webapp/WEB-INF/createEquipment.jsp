<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Equipment</title>
</head>
<body>
 <a href= "home.do" >Home</a>
 <main class="container-fluid">
 <h1>Add New Equipment</h1>
 	<form action="createEquipmentResult.do" method="GET">
		<strong>MANF:</strong> <input type="text" name="equipManf" Required="Required"/> <br /> 
		<strong>CATEGORY:</strong> <input type="text" name="equipName" Required="Required"/><br />
		<label for="equipName"><em> Category Examples: Lawn mower. Chainsaw, Weed Trimmer</em></label> <br /> 
		<strong>Model:</strong> <input type="text" name="equipMdl" Required="Required"/> <br /> 
		<strong>S/N:</strong> <input type="text" name="equipSerNum" /> <br /> 
		<br></br>
		<strong>ENGINE MANF:</strong> <input type="text" name="engManf" /> <br /> 
		<strong>ENGINE MODEL:</strong> <input type="text" name="engMdl" /> <br /> 
		<strong>ENGINE S/N:</strong> <input type="text" name="engSerNum" /> <br /> 
		<br></br>
		<strong>OIL MANF:</strong> <input type="text" name="engOilManf" /> <br /> 
		<strong>OIL TYPE:</strong> <input type="text" name="engOilType" /> <br /> 
		<strong>OIL VISC / GRADE:</strong> <input type="text" name="engOilViscGrd" /> <br /> 
		<strong>OIL FILTER MANF:</strong> <input type="text" name="engOilFltrManf" /> <br /> 
		<strong>OIL S/N:</strong> <input type="text" name="engOilFltrPrtNum" /> <br /> 
		<br></br>
	    <strong>AIR FILTER MANF:</strong> <input type="text" name="engAirFltrManf" /> <br /> 
		<strong>AIR FILTER PART NO.:</strong> <input type="text" name="engAirFltrPrtNum" /> <br /> 
		<br></br>
		<strong>FUEL TYPE REQ:</strong> <input type="text" name="engFuelSpec" /> <br /> 
		<strong>FUEL TYPE FILTER MANF:</strong> <input type="text" name="engFuelFltrManf" /> <br /> 
		<strong>FUEL TYPE FILTER PART NO.:</strong> <input type="text" name="engFuelFltrPrtNum" /> <br /> 
		<br></br>
		<strong>2-Cycle Engine:</strong> <input type="checkbox" name="engFuelOil" /> <br /> 
		<strong>FUEL-OIL MANF:</strong> <input type="text" name="engFuelOilManf" /> <br /> 
		<strong>FUEL-OIL NAME:</strong> <input type="text" name="engFuelOilName" /> <br /> 
		<strong>FUEL-OIL S/N:</strong> <input type="text" name="engFuelOilSerNum" /> <br /> 
		<br></br>
		<strong>CONSUMABLE PART (CP) 1:</strong> <input type="text" name="equipConsName" /> <br /> 
		<label for="equipConsName"><em> CP Examples: Battery, Chainsaw bar-oil, Lawn mower blade</em></label><br /> 
		<strong>CP MANF:</strong> <input type="text" name="equipConsManf" /> <br /> 
		<strong>CP PART NO. or S/N:</strong> <input type="text" name="equipConsPrtNum" /> <br /> 
		<br></br>
		<strong>CONSUMABLE PART (CP) 2:</strong> <input type="text" name="equipConsName2" /> <br /> 
		<label for="equipConsName"><em> CP Examples: Weed Trimmer Line, Chain, Lubricant</em></label><br /> 
		<strong>CP MANF:</strong> <input type="text" name="equipConsManf2" /> <br /> 
		<strong>CP PART NO. or S/N:</strong> <input type="text" name="equipConsPrtNum2" /> <br /> 
		<br></br>
		<strong>CONSUMABLE PART (CP) 3:</strong> <input type="text" name="equipConsName3" /> <br /> 
		<label for="equipConsName"><em> CP Examples: O-Ring, Hydraulic Fluid, Hardware</em></label><br />
		<strong>CP MANF:</strong> <input type="text" name="equipConsManf3" /> <br /> 
		<strong>CP PART NO. or S/N:</strong> <input type="text" name="equipConsPrtNum3" /> <br /> 
		<br></br>
        <label for="equipNotes">NOTES</label>
        <textarea rows="12" cols="50" class="equipNotes"></textarea>
		<br></br>
  
		<a href="createEquipment.do"><input type="submit" value="Submit" class="button" /></a><br /> 

	</form>
	</main>
</body>
</html>