<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//sample by : http://startbootstrap.com/template-overviews/sb-admin/
String root = request.getContextPath();
String sampleBootstrapUrl = "http://ironsummitmedia.github.io/startbootstrap-sb-admin/";
%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=root%>/resources/admin/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=root%>/resources/admin/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<%=root%>/resources/admin/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=root%>/resources/admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

	<!-- IE10 반응형 웹 버그 보완 -->
	<!--[if gt IE 9]>
	<link rel="stylesheet" type="text/css" href="/resources/css/ie10.css" />
	<![endif]-->
	
	<!-- 개발 관련 scripts -->
	<script type="text/javascript" src="<%=root%>/resources/3party/js/jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="<%=root%>/resources/3party/js/jquery/jquery-ui-1.11.0.js"></script>
	<script type="text/javascript" src="<%=root%>/resources/3party/js/jquery/jquery.form.js"></script>
	<script type="text/javascript" src="<%=root%>/resources/3party/js/ajax.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=root%>/resources/admin/js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="<%=root%>/resources/admin/js/plugins/morris/raphael.min.js"></script>
	<script src="<%=root%>/resources/admin/js/plugins/morris/morris.min.js"></script>    
    <script src="<%=root%>/resources/admin/js/plugins/morris/morris-data.js"></script>
	

</head>


