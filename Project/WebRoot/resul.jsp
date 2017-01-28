<%@ page language="java" import="java.util.*,Class.User" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'resul.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
    <body bgcolor="green">
    <table border="2">
    <thead align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; STUDENT</thead>
    <tr><th>Name</th><th>ID</th><th>Email</th><th>Password</th><th>Dept</th><th>Cgpa</th></tr>
    <%
    List<User> ml = (List<User>) request.getAttribute("data");
   
    if (ml!=null)
    {
     
      for (int i=0; i<ml.size(); i++)
      {
        User obj = ml.get(i);
        %>
    
    <tr>
    
      <td>  <%=obj.getName() %></td> 
       <td><%=obj.getId() %></td>
      <td><%=obj.getEmail() %></td>
       <td><%=obj.getPass() %></td>
       <td><%=obj.getDept() %></td> 
       <td><%=obj.getCGPA() %></td>  
    </tr>
 
    <%
    }
    } %>
		  </table>
		  
   <%int j=(ml.size()-1);
   
   List<User> l = (List<User>) request.getAttribute("data");
   
   User obj = l.get(j);%><br><br><br><br>&nbsp;NUMBER OF STUDENT OF YOUR DEPT:=<%=obj.getNUM()%>
		  
	
		  
		  	
  </body>
</html>
