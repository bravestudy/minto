<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	response.addHeader("Cache-Control","no-store");
	response.addHeader("Pragma", "no-cache");
	String agent = request.getHeader("user-agent");
	
	boolean isIDevice = false;
	
	if (agent.toLowerCase().indexOf("iphone") > -1 || agent.toLowerCase().indexOf("ipad") > -1) isIDevice = true;
	
	request.setAttribute("isIDevice", isIDevice);
%>

	<title>MINTO</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no"/><!--모바일비율조정-->
	<meta http-equiv="X-UA-Cmpatible" content="IE=edge,chrome=1" /><!--IE Google Chrome호환성보기모드 금지-->
	<link rel="stylesheet" type="text/css" href="/resources/3party/css/jquery/jquery-ui-1.11.0.css" />
	<style type="text/css">
	
	.h500{height:500px; overflow:auto;}
	
	</style>
	
	<!-- 모바일 아이콘 link rel="shortcut icon" href="img/icon.png" / -->
	<!-- 반응형 웹을 지원하지 않을 경우 -->
	<!-- <link rel="stylesheet" href="/resources/css/non-responsive.css" /> -->

	<!-- IE8 이하 버전 지원 -->
	<script type="text/javascript" src="/resources/3party/js/html5shiv.js"></script>
	<script type="text/javascript" src="/resources/3party/js/respond.min.js"></script>

	<!-- IE10 반응형 웹 버그 보완 -->
	<!--[if gt IE 9]>
	<link rel="stylesheet" type="text/css" href="/resources/css/ie10.css" />
	<![endif]-->

	<!-- 개발 관련 scripts -->
	<script type="text/javascript" src="/resources/3party/js/jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="/resources/3party/js/jquery/jquery-ui-1.11.0.js"></script>
	<script type="text/javascript" src="/resources/3party/js/jquery/jquery.form.js"></script>
	<script type="text/javascript" src="/resources/3party/js/ajax.js"></script>
	
<!-- bootstrap 라이브러리 added on Jan 08. 2015. YoungRok.Lee -->
<!-- 	<script type="text/javascript" src="/resources/libs/javascript/bootstrap/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="/resources/libs/css/bootstrap/bootstrap.css"/> -->
	<!-- end bootstrap -->	
	
	<script type="text/javascript">
	jQuery.ajaxSetup ({ 
	// Disable caching of AJAX responses */ 
	    cache: false 
	}); 
	
	jQuery(function() {
	});
	
	// ajax나 폼 서빗을  처리할 때 true 변환 시킴
	var inProcessing = false;
	
	function returnFalse() {
		return false;
	}
	</script>
	<!-- // 개발 관련 scripts -->