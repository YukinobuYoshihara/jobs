<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="bbs" scope="application" class="java.util.Vector"/>
<%
  request.setCharacterEncoding("UTF-8");
  if (request.getParameter("userName")!=null) {
    bbs.add(request.getParameter("userName"));
    bbs.add(request.getParameter("body"));
  }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>簡易掲示板</title>
</head>
<body>
<h1>お名前と書き込みをどうぞ。</h1>
<form action="crossSiteScriptingTest.jsp" method="post">
  <p>お名前　　: <input type="text" name="userName"></p>
  <p>本文　　　: <textarea name="body"></textarea></p>
  <input type="submit" value="投稿">
</form>
<% for (int i=0; i < bbs.size(); i+=2) { %>
  <HR>
  <%-- ここで表示する内容にJavaScriptなどが含まれていたときに問題が起こる --%>
  投稿者名：<%= bbs.get(i) %><BR>
  本文：<PRE><%= bbs.get(i+1) %></PRE>
<% } %>

</body>
</html>
