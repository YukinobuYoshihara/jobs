<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="dao.FruitDao" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>リクルート青果店</title>
</head>
<body>
<%
	FruitDao dao = new FruitDao();
	ArrayList<String> fruitList = dao.getFruitList();
%>
<table>
<tr>
<th>フルーツ名</th>
</tr>
<%
	for(String name:fruitList){
%>
<tr>
<td>
<%
	out.print(name);
%>
</td>
</tr>
<%
	}
%>
</table>
</body>
</html>