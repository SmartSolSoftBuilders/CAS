<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%
String redirect = request.getContextPath() + "/jsp/portadaPOJO.jsp";
String ticket = request.getParameter("ticket");
if(ticket !=null ){
	ticket = "?ticket=" + ticket;
	redirect= redirect + ticket;
}
%>
<meta http-equiv="refresh" content="0;url=<%=redirect%>"/>
<title>Home</title>
</head>
<body>
</body>
</html>