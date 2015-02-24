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
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h1>case 1 - 일반 jsp문법 사용 시</h1>
<%
List<HashMap> arlList = (List<HashMap>)request.getAttribute("sampleFor");
for (HashMap mpValue : arlList) {
	out.println(mpValue);
}
%>

<br>
<h1>case 2 - jstl , el 문법 사용</h1>
EL : ${sampleFor}
<br/>

EL , JSTL 

<c:forEach items="${sampleFor}" var="foritem">
${foritem}
</c:forEach>

</body>
</html>
