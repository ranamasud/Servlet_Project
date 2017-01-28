<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'Want_to_b_Admitted.jsp' starting page</title>
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
 <form action="NewMember" method="post">
 NAME:<input type="Text" name="name"><br>
 PASS:<input type="password" name="pass"><br>
 EMAIL:<input type="text" name="email"><br>
 DEPT:<select name="dept">
  <option>ICT</option>
  <option>CSE</option>
  <option>FOOD</option>
  <option>TEXTILE</option>
 </select><br>
 <input type="submit" value="MEMBERSHIP">
 </form>
  </body>
</html>
