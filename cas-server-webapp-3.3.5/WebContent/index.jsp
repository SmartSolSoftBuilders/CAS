<%@ page language="java"  session="false" %>
<%
final String queryString = request.getQueryString();
System.out.println("<OTIKA>Paso1:"+request.getQueryString());
final String url = request.getContextPath() + "/login" + (queryString != null ? "?" + queryString : "");
response.sendRedirect(response.encodeURL(url));%>