<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Equipment Service Parts Tracker</title>
</head>
<body>
<h1>My Equipment Service Parts</h1>
 <!--DELETE LATER, DEBUG ONLY  ${DELETEME } -->
 
 <h3>Find your equipment by its Id number</h3>
 <form action="searchById.do" method="GET">
     <input type="number" name="eid" /><br />
     <br>
     <input type="submit" value="Submit" class="button"/><br />
     <br></br>
   </form>
   
 <h3>Find your equipment by keyword search</h3>
    <form action="searchByKeyword.do" method="GET">
     <input type="text" name="data" /><br />
     <br>
     <input type="submit" value="Search" class="button"/><br />
      <br></br>
   </form>
   
 <h3>Show a full list of your current equipment inventory</h3>
    <form action="showAllEquipment.do" method="GET">
     <input type="submit" value="Show Full List" class="button"/><br />
      <br></br>
   </form>
 
  <a href="createEquipment.html">Add New Equipment</a>
    <!-- <form action="createEquipment.do" method="GET">
     <input type="submit" value="New Equipment Entry" class="button"/><br />
      <br></br>
   </form> -->
 
</body>
</html>