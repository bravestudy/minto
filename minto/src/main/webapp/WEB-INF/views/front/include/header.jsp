<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
// copy by : http://asterialite.towfiqi.com/
// GNU licence - http://blog.naver.com/lawcket/220252052693
// 최초에 GNU라이센스를 적용하기로 하고 프로그램을 제작한 주체는 공개와 배포를 목적으로 하였기에 자신의 노력이 무상으로 타인에게 공개되는 것이 아깝지 않겠지만, 그렇지 않은경우라면? GNU규약하에 제작된 공개 코드는 사용하고 싶지만 이것을 수정보완 해서 내가 만들어낸 코드는 공개하고 싶지 않다면?
// MIT 라이센스로 만들어진 2차적 저작물에대한 배포/판매/서브라이센스부여 등을 2차 개발자의 의도대로 결정할 수 있다는 내용이다. 
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=1">


<title>CDY | Study Blog</title>

<!-- 보류 http://help.egloos.com/m/4914
<link rel="pingback" href="http://asterialite.towfiqi.com/xmlrpc.php" />
<link rel="alternate" type="application/rss+xml" title="ASTERIA &raquo; Feed"	href="http://asterialite.towfiqi.com/feed/" />
<link rel="alternate" type="application/rss+xml"	title="ASTERIA &raquo; Comments Feed"	href="http://asterialite.towfiqi.com/comments/feed/" />
<link rel="EditURI" type="application/rsd+xml" title="RSD"	href="http://asterialite.towfiqi.com/xmlrpc.php?rsd" />
<link rel="wlwmanifest" type="application/wlwmanifest+xml"	href="http://asterialite.towfiqi.com/wp-includes/wlwmanifest.xml" />
-->
<link rel='stylesheet' id='fancybox-css'	href='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/css/fancybox.css?ver=4.1.1'	type='text/css' media='all' />
<link rel='stylesheet' id='asteria-style-css'	href='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/style.css?ver=4.1.1'	type='text/css' media='all' />
<link rel='stylesheet' id='asteria-icons-css'	href='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/fonts/font-awesome.css?ver=4.1.1'	type='text/css' media='all' />

<!-- (s) common lib --> 
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-includes/js/jquery/jquery.js?ver=1.11.1'></script>
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-includes/js/jquery/jquery-migrate.min.js?ver=1.2.1'></script>
<!-- http://windowx.tistory.com/372 -->
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/js/fancybox.js?ver=4.1.1'></script>
<!-- http://www.cmsfactory.net/node/10665 -->
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/js/jquery.nivo.js?ver=4.1.1'></script>
<!-- (e) common lib -->

<!-- (s) custom js -->
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/asteria.js?ver=4.1.1'></script>
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/js/other.js?ver=4.1.1'></script>
<script type='text/javascript'	src='http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/js/gallery.js?ver=4.1.1'></script>
<!-- (e) custom js -->

<meta name="generator" content="CDY study" />

<style type="text/css">
body .fixed_site .header .center {
	width: 100% !important;
}

.single #content {
	margin-top: 10px;
}

.header,.header2,.header3,.header4 {
	margin-top: 30px;
}

.widget_corner {
	display: none;
}

.page #content {
	margin-top: 20px;
}

.edit_wrap {
	border-color: transparent;
}

.comments_template {
	margin-bottom: 40px;
}

#sidebar {
	border-left: 1px solid rgba(0, 0, 0, 0.05);
}

#sidebar .widget {
	padding-bottom: 0px !important
}

.page-template-page-leftsidebar-php #sidebar {
	border-right: 1px solid rgba(0, 0, 0, 0.05);
	border-left: none;
}

.page-template-page-leftsidebar-php #sidebar .widget_wrap {
	padding-left: 0 !important;;
}

#sidebar .widget .widgettitle,#home_widgets .widget .widgettitle {
	text-align: right;
	padding-bottom: 15px;
	border-bottom: 1px solid;
	border-color: rgba(0, 0, 0, 0.05);
}

#sidebar .widget {
	background: none !important;
	padding-bottom: 0;
}

#sidebar .widget_wrap {
	width: 88% !important;
	padding: 0 !important;
	padding-left: 12% !important;
}

#sidebar #searchform div {
	border: 1px solid rgba(0, 0, 0, 0.05)
}

.fixed_site {
	width: 80%;
	margin: 0 auto;
}

body .fixed_site .center,body .fixed_site .midrow_wrap,body .fixed_site .header3 .top_head .center
	{
	width: 95% !important;
}

.fixed_wrap {
	width: 100%;
	float: left;
	background: #fff;
}

.fixed_site #footer {
	margin-top: 0;
}

.footefixed {
	margin-bottom: 40px;
}

.single_post {
	background: none;
}

.lay3 .hentry {
	margin-bottom: 15px;
}

.lay4 .hentry,.lay5 .single_post {
	border-bottom: 1px solid rgba(0, 0, 0, 0.07);
	background: none;
}

.lay4 .hentry:last-child,.lay5 .single_post:last-child {
	border: none;
}

.author_posts {
	background: none;
	border-bottom: 1px solid rgba(0, 0, 0, 0.07);
	border-top: 1px solid rgba(0, 0, 0, 0.07);
}

.lay5 .single_post {
	margin-bottom: 0;
}

.more-link,.moretag {
	background: rgba(0, 0, 0, 0.07);
}

.lay2 .hentry,.lay3 .hentry {
	background: rgba(0, 0, 0, 0.03);
}

.author #content {
	margin-top: 0 !important;
}

#ast_nextprev {
	margin-top: 0;
	border-bottom: 1px solid rgba(0, 0, 0, 0.07);
}

.share_this,#ast_related {
	border-bottom: 1px solid rgba(0, 0, 0, 0.07);
	border-top: 1px solid rgba(0, 0, 0, 0.07);
	background: none;
}

.comments_template #comments,#comments_ping,#reply-title {
	border-bottom: 1px solid rgba(0, 0, 0, 0.07);
	padding-bottom: 20px;
	border-top: none;
}

.comment-body {
	border-bottom: 1px solid rgba(0, 0, 0, 0.07);
}

.comment-form-comment textarea,.comm_wrap input {
	background: rgba(0, 0, 0, 0.03);
	border: 1px solid rgba(0, 0, 0, 0.07);
	-webkit-box-shadow: 0 0 5px rgba(0, 0, 0, 0.03) inset;
	-moz-box-shadow: 0 0 5px rgba(0, 0, 0, 0.03) inset;
	box-shadow: 0 0 5px rgba(0, 0, 0, 0.03) inset;
}

.ast_pagenav .current {
	color: #fff;
	background: #30b7e8;
}

.ast_pagenav .pagi_border dt {
	background: rgba(0, 0, 0, 0.1);
}

.home_tabs {
	background: none;
}

#sidebar .widget .widgettitle {
	margin-right: 10%;
}

#accordion img {
	max-width: 940px !important;
}

body .fixed_site .header3 .center {
	width: 100% !important;
}

.comment-form-comment textarea,.comm_wrap input {
	border-top: 1px solid rgba(0, 0, 0, 0.1) !important;
	border-left: 1px solid rgba(0, 0, 0, 0.1) !important;
	border-right: 1px solid rgba(0, 0, 0, 0.1) !important;
}

#sidebar .widget {
	margin-top: 20px;
}

.edit_wrap {
	border-color: transparent;
}

.share_this {
	background-color: transparent !important;
}

.author_posts {
	background: none !important;
}

.ast_map {
	margin-bottom: 0 !important;
}

/*--------------SLIDER HEIGHT---------------*/
#zn_nivo,.slider-wrapper,.slide_wrap,.banner ul li,#accordion,.kwicks li,#accordion
	{
	height: 500px !important;
}

#accordion,.kwicks.horizontal li {
	min-height: 500px !important;
}

/*------------------------------------SITE TITLE------------------------------------------*/
.logo h1,.logo h2 {
	font-size: 42px !important;
}

.logo h1 a,.logo h2 a,.ast_maintanace .logo h1 a {
	font-family: 'Open Sans' !important;
	color: #ffffff;
	font-weight: 400 !important;
}

.nivo-caption h3,#accordion h3,.banner .sld_layout2 h3,.banner .sld_layout3 h3
	{
	font-family: 'Open Sans' !important;
}

.sld_layout2 h3,.sld_layout3 h3,.acc-sld_layout2 h3,.acc-sld_layout3 h3,.wrap-sld_layout2 h3,.wrap-sld_layout3 h3
	{
	font-size: 42px !important;
	line-height: 1.3em;
}

/*------------------------------------ROUNDED CORNERS------------------------------------------*/
/*------------------------------------DROP SHADOW------------------------------------------*/
/*------------------------------------ELEMENTS COLORS------------------------------------------*/
/*SOCIAL SHARE BUTTONS COLOR*/
body .social_buttons div i,body .social_buttons div a {
	color: #CCCCCC !important;
}

/*SECONDARY ELEMENT*/
.header4 #topmenu ul li:hover,.nivo-caption .sld_layout1 p,.banner .sld_layout1 p,.acc-sld_layout2 p,.header4 #topmenu .sub-menu,.acc-sld_layout1 p
	{
	border-color: #30b7e8 !important;
}

#topmenu ul li ul li a:hover,.nivo-caption .sld_layout1 h3 a,.nivo-controlNav a.active,.banner .sld_layout1 h3 a,.acc-sld_layout1 h3 a,.tab.active,.thn_post_wrap .more-link:hover,.moretag:hover,#submit,.page_tt,#searchsubmit,.contact_submit input,.pad_menutitle,.to_top:hover,.page-numbers:hover,.ast_pagenav .current,.progrssn,#simple-menu,.wpcf7-submit
	{
	background-color: #30b7e8 !important;
}

.nivo-caption p a,.banner .sld_layout1 p a,.banner .sld_layout2 p a,.banner .wrap-sld_layout3 p a,.acord_text p a,.lay2 h2 a,.lay3 h2 a,.lay4 h2 a,.lay5 .postitle a,#ast_nextprev .ast-prev:hover .left_arro i,#ast_nextprev .ast-next:hover .right_arro i,.rel_content a,#reply-title small a,.logged-in-as a,.thn_post_wrap a:link,.thn_post_wrap a:visited,.edit_wrap i:hover,.single_post .postitle,#sidebar .widget .widgettitle,#sidebar .widget .widgettitle a,#home_widgets .widget a:link,#home_widgets .widget a:visited,#home_widgets .widget .thn_wgt_tt,#sidebar .widget .thn_wgt_tt,#footer .widget .thn_wgt_tt,.widget_calendar td a,.astwt_iframe a,.ast_countdown li,.ast_biotxt a,.ast_bio .ast_biotxt h3,.search_term h2,.author_right h2,.author_right a,#contact_block .widgettitle,#contact_block a:link,#contact_block a:visited,.copytext a,.ast_maintanace .logo h1 a,#ast_nextprev .ast-prev:hover .left_arro i,#ast_nextprev .ast-next:hover .right_arro i,.post_meta a:hover,.social_buttons div a:hover i,.social_buttons div a:hover,.widgets p a,.tagcloud a,.text_block a:link,.text_block a:visited,.commentmetadata a
	{
	color: #30b7e8 !important;
}

.rel_content .rel_more:hover {
	border-color: transparent transparent #30b7e8 transparent !important;
}

.tab.active .tab_arrow {
	border-color: #30b7e8 transparent transparent transparent !important;
}

.mid_block_content a,.single_post_content a {
	color: #30b7e8 !important;
}

.midrow_block:hover .mid_block_content a,.midrow_block:hover h3 {
	color: #FFFFFF !important;
}

.midrow_block:hover .block_img {
	border-color: #FFFFFF !important;
}

/*Post Icons Color*/
.rel_content .rel_more i,.single_metainfo i,.comm_meta_reply i {
	
}

/*Leave a Reply Text Color*/
.comments_template #comments,#comments_ping,#reply-title,.related_h3 {
	color: #333333 !important;
}

/*Footer Social Color*/
.head_soc a {
	color: #CCCCCC !important;
}

/*------------------------------------TEXT COLORS------------------------------------------*/

/*Body Text Color*/
body,.single_metainfo,.single_post .single_metainfo a,.post_meta a,.midrow_blocks a,.lay4 .single_metainfo a
	{
	color: #888888 !important;
}

/*Text Color on Secondary Element*/
#submit,#searchsubmit,.page_tt,body #topmenu ul li ul li a:hover,.tab a.active,#ast_nextprev .ast-prev:hover .left_arro,#ast_nextprev .ast-next:hover .right_arro,.page-numbers:hover,.more-link,.moretag,#simple-menu,#simple-menu i
	{
	color: #FFFFFF !important;
}

.nivo-caption .sld_layout1 h3 a,.nivo-controlNav a.active,.banner .sld_layout1 h3 a,.acc-sld_layout1 h3 a,.tab.active,.thn_post_wrap .more-link:hover,.moretag:hover,#submit,.page_tt,#searchsubmit,.contact_submit input,.pad_menutitle,.to_top:hover,.page-numbers:hover,.ast_pagenav .current,.progrssn,#simple-menu
	{
	color: #FFFFFF !important;
}

/*Woocommerce*/
.woocommerce div.product .product_title,.woocommerce-page div.product .product_title,.woocommerce #content div.product .product_title,.woocommerce-page #content div.product .product_title,.product_meta a,.woocommerce ul.products li.product h3,.woocommerce-page ul.products li.product h3
	{
	color: #30b7e8 !important;
}

@media screen and (max-width: 1200px) {
	body .fixed_site {
		width: 95% !important;
		margin: 0 auto;
	}
}

/*Others*/
/*Welcome Text Background*/
.text_block {
	background-color: #333333 !important;
}
/*Gallery*/
.gallery {
	float: left;
	margin: 20px auto !important;
	width: 100%;
}

body .gallery-item {
	text-align: center;
	width: 50px !important;
	height: 45px;
	display: inline-block;
	margin: 10px 5px;
	float: none !important;
}

/*HOVER ANIMATIONS (Asteria 1.0)*/
.midrow_block,.nav-box,.ast-prev,.ast-next,#footer .widgets .widget ul li a,#home_widgets .widget li a,#sidebar .widget li a,#footmenu ul li a,.single_metainfo .catag_list a,.auth_meta,.meta_comm a,.post_meta a,.social_buttons div i,.social_buttons div a
	{
	-webkit-transition: all 0.3s ease-out;
	-moz-transition: all 0.3s ease-out;
	-ms-transition: all 0.3s ease-out;
	-o-transition: all 0.3s ease-out;
	transition: all 0.3s ease-out;
}

#home_widgets .widget li a:hover,#sidebar .widget li a:hover,#footmenu ul li a:hover,.single_metainfo .catag_list a:hover,.auth_meta:hover,.meta_comm a:hover,.post_meta a:hover
	{
	color: #30b7e8;
}

.single_metainfo .catag_list a:hover,.auth_meta:hover,.meta_comm a:hover,.post_meta a:hover
	{
	opacity: 1;
}

.midrow_block:hover {
	color: #FFFFFF;
	background-color: #30b7e8;
	padding-top: 0px;
}

.midrow_block:hover .block_img {
	border-color: #FFFFFF;
}

.midrow_block:hover .icon_wrap i {
	color: #FFFFFF;
}

.nav-box:hover {
	color #888888:;
	background-color: #30b7e8;
}

#ast_nextprev .ast-prev:hover a,#ast_nextprev .ast-next:hover a {
	color: #FFFFFF;
}

/*BODY FONT*/
body {
	font-family: Open Sans;
}
/*POST TITLE FONT*/
h1,h2,h3,h4,h5,h6,#topmenu ul li a,.text_block,.lay1_title h3,#sidebar .widget .widgettitle,.left_arro,.right_arro,#submit,.logo h1 a,.logo h2 a,.widget_calendar caption,.rel_content a,#ast_related ul li a,.fourofour a
	{
	font-family: Open Sans;
	font-weight: normal;
}

/** SLIDER BUTTON COLOR**/
a.sld_buttn {
	background: #30b7e8;
	color: #FFFFFF;
}

/*USER'S CUSTOM CSS---------------------------------------------------------*/
/*---------------------------------------------------------*/
.recentcomments a {
	display: inline !important;
	padding: 0 !important;
	margin: 0 !important;
}

</style>

</head>