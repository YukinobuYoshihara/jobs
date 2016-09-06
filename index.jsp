<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="dao.FruitDao" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>リクルート青果店</title>
<style type="text/css">
body {
  margin: 0;
  color: white;
}
#container {
  width: 900px;
  margin: 0 auto;
  padding: 0px; border: 0px;
}
#header{width: 900px; height:100px; background: gray;}
#pagebody{width:900px; height:300px; margin: 0px; padding: 0px; border: 0px;}
#side { width:300px; height:300px; float:left; background: #0066cc; margin: 0px; padding: 0px; border: 0px;}
#contents { width:600px; height:300px; float:left; background: #ffcc00; margin: 0px; padding: 0px; border: 0px;}
.box { width:580px; height:30px; margin:10px; border:0; padding:0; background: green;}
#footer{ width: 900px; height:100px; clear:both; background: #009900; }
.child {
    display: none;
}
</style>
</head>
<body>
<div id="container">
  <div id="header">header</div>
  <div id="pagebody">
    <div id="side">


    </div>
    <div id="contents">

	<div class="box">

    </div>


    </div><!-- contents end -->
  </div><!-- pagebody end -->
  <div id="footer">footer</div>
</div><!-- container end -->

</body>
</html>