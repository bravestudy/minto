<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"
    contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
MVC
</h1>

<c:forEach items="${sampleFor}" var="foritem">
${foritem}<br>
</c:forEach>

<h1>
MVC
</h1>
<c:forEach items="${sampleFor}" var="foritem">
name : ${foritem.name}<br>
</c:forEach>


</body>
</html>
