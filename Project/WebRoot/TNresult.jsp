<%@ page language="java" import="java.util.*,Class.SIR" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Tresult.jsp' starting page</title>
    
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
    <tr><th>Name</th><th>Dept</th><th>PASS</th></tr>
    <%
    List<SIR> ml = (List<SIR>) request.getAttribute("data");
   
    if (ml!=null)
    {
     
      for (int i=0; i<ml.size(); i++)
      {
        SIR obj = ml.get(i);
        %>
    
    <tr>
    
      <td>  <%=obj.getName() %></td> 
       <td><%=obj.getDept() %></td> 
       <td><%=obj.getPass() %></td>
       
    </tr>
 
    <%
    }
    } %>
		  </table>
		  
		  
		  <%int j=(ml.size()-1);
	
		  List<SIR> l = (List<SIR>) request.getAttribute("data");
		  SIR obj = l.get(j);%><br><br><br><br>&nbsp;TOTAL NUMBER OF YOUR COLICS:=<%=obj.getNUM()%>
		  
		  	
		  
		  	
  </body></html>
