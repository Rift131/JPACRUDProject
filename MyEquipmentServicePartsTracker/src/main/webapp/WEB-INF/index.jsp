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
 <form>
 
 <form action="searchById.do" method="GET">
     <input type="text" name="data" /><br />
     <br>
     <input type="submit" value="Submit" class="button"/><br />
   </form>
   
    <form action="searchByKeyword.do" method="GET">
     <input type="text" name="data" /><br />
     <br>
     <input type="submit" value="Submit" class="button"/><br />
   </form>
   
    <form action="showAllEquipment.do" method="GET">
     <input type="text" name="data" /><br />
     <br>
     <input type="submit" value="Submit" class="button"/><br />
   </form>
 
 </form>
</body>
</html>