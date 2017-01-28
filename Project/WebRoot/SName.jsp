<%@ page language="java" import="java.util.*,Class.SIR" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SName.jsp' starting page</title>
    
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
  <p><b><br>DEAR SIR YOUR INFO IS GIVEN BELLOW<br><br></b></p>
   <p><% 
    SIR uj=new SIR();  
    uj=(SIR)request.getAttribute("tab"); 
    %></p>
    <form action='S2' method="post"><div align="left">&nbsp;</div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Name : <input type="text" name="name" value="<%=uj.getName()%>"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Pass &nbsp;&nbsp; : <input type="text" name="pass" value="<%=uj.getPass()%>"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; Dept&nbsp;&nbsp;&nbsp; : <input type="text" name="dept" value="<%=uj.getDept()%>"><br>
     <div align="center"><input type="submit" value="READ YOUR DEPT STU AND THEIR TOTAL NUMBER"> 
     </div></form>
     
     
         <div align="center"><form action="ReadServlet" method="post"> 
    <input type="submit" name="id" value="READ ALL STU AND TOTAL NUMBER OF STUDENT OF MBSTU"> 
    </form></div>

         <div align="center"><form action="READSR" method="post"> 
    <input type="submit" name="id" value="READ ALL TEACHER AND THEIR TOTAL NUMBER"> 
    </form></div>

     <form action='COLICS' method="post"><div align="left">&nbsp;</div>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="hidden" name="name" value="<%=uj.getName()%>"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; <input type="hidden" name="pass" value="<%=uj.getPass()%>"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;<input type="hidden" name="dept" value="<%=uj.getDept()%>">
     <div align="center"><input type="submit" value="READ YOUR COLICS AND THEIR NUMBER"> 
     </div></form>
    
    
    <a href="New.jsp">ADMIT A STUDENT &nbsp;</a><br><br>
     
       <a href="DELETE.jsp">DELETE A STU</a><br><br>
       
       <a href="UPDATE.jsp">UPDATE A STU</a><br><br><br><br>
       <a href="Create_Teacher.jsp">CREATE TEACHER ACCOUNT</a>
     
  </body>
</html>
