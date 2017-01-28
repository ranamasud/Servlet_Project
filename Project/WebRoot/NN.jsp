<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'NN.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    
      <p align="center"><b>&nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<u> STUDENT OF MBSTU</u></b></p><p><b><u><br></u></b></p>
   <div align="center"><form action="LogServlet" method="post">&nbsp;Id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :<input type="text" name="name"><br><br> 
    Password&nbsp; :<input type="password" name="pass"><br><br> 
   
    <input type="submit" value="LOGIN"><br><br> 
    </form> 
    
    <form action="PERFORMANCE2" method="post">
    <input type="submit" value="TOTAL TEACHER NUMBER"><br><br></form>


    <form action="PERFORMANCE" method="post">
    <input type="submit" value="TOTAL STUDENT NUMBER"><br><br></form>

	<form action="PROPORTION" method="post">
    <input type="submit" value="TEACHER NUMBER PROPORTION WITH STUDENT NUMBER"><br><br></form>

<form action="PERDEPT_TEACHER" method="post">
  <input type="submit" value="TEACHER NUMBER OF THE DEPT">
   <select name="dept">
  <option>ICT</option>
  <option>CSE</option>
  <option>FOOD</option>
  <option>TEXTILE</option>
</select>
    
 </form>
 
 
 <form action="PER_DEPT_STUDENT" method="post">
  <input type="submit" value="STUDENT NUMBER OF THE DEPT">
   <select name="dept">
  <option>ICT</option>
  <option>CSE</option>
  <option>FOOD</option>
  <option>TEXTILE</option>
</select>
    
 </form>
 


 <form action="PER_DEPT_PERFORMANCE" method="post">
  <input type="submit" value="CAMPUS PERFORMANCE">
   <select name="dept">
  <option>ICT</option>
  <option>CSE</option>
  <option>FOOD</option>
  <option>TEXTILE</option>
</select>
    
 </form>
  
    <a href="teacher.jsp">TEACHER</a><br><br>
    </div>
    
    
    
  </body>
</html>
