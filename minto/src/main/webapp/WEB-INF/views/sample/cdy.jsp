<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
<%
String root = request.getContextPath();
%>
<body class="home blog">
	<!--Header-->
	<div class="fixed_site">
		<!--Maintenance Mode Message-->
		<!--Get Header Type-->
		<div class="header4">
			<div class="center">
				<!--LOGO START-->
				<div class="logo">
					<h1>
						<a href="<%=root%>/cdy">CDY</a>
					</h1>
				</div>
				<!--LOGO END-->

				<!--MENU START-->
				<!--MOBILE MENU START-->
				<a id="simple-menu" href="#sidr"><i class="fa-align-justify"></i>Menu</a>
				<!--MOBILE MENU END-->
				<!-- menu 9개 이상은 하지 말자. -->
				<div id="topmenu">
					<div class="menu-header">
						<ul id="menu-headmenu" class="menu">
							<li id="menu-item-57"
								class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-57">
								
								<a href="http://asterialite.towfiqi.com/">Home</a>
							</li>
							
							<li id="menu-item-58"
								class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-58">
								
								<a	href="http://asterialite.towfiqi.com/blog/">Blog</a>
								
								<ul class="sub-menu">
									<li id="menu-item-66"
										class="menu-item menu-item-type-custom menu-item-object-custom menu-item-66">
										<a	href="http://asterialite.towfiqi.com/?author=1">Author Page</a></li>
								</ul>
							</li>
							
							<li id="menu-item-65"
								class="menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-65"><a
								href="#">Pages</a>
								<ul class="sub-menu">
									<li id="menu-item-64"
										class="menu-item menu-item-type-post_type menu-item-object-page menu-item-64">
										<a href="http://asterialite.towfiqi.com/sample-page/">Page	with Right Sidebar</a></li>
									<li id="menu-item-60"
										class="menu-item menu-item-type-post_type menu-item-object-page menu-item-60"><a
										href="http://asterialite.towfiqi.com/page-with-left-sidebar/">Page
											With Left Sidebar</a></li>
									<li id="menu-item-61"
										class="menu-item menu-item-type-post_type menu-item-object-page menu-item-61"><a
										href="http://asterialite.towfiqi.com/page-with-no-sidebar/">Page
											With No Sidebar</a></li>
								</ul>
							</li>

							<li id="menu-item-59" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-59">
								<a	href="http://asterialite.towfiqi.com/gallery/">Gallery</a>
							</li>

							<li id="menu-item-59" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-59">
								<a	href="http://asterialite.towfiqi.com/gallery/">기타 메뉴</a>
							</li>
							<li id="menu-item-59" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-59">
								<a	href="http://asterialite.towfiqi.com/gallery/">기타 메뉴</a>
							</li>
							
							<li id="menu-item-59" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-59">
								<a	href="http://asterialite.towfiqi.com/gallery/">기타 메뉴</a>
							</li>
							
							<li id="menu-item-59" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-59">
								<a	href="http://asterialite.towfiqi.com/gallery/">기타 메뉴</a>
							</li>
							
							<li id="menu-item-59" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-59">
								<a	href="http://asterialite.towfiqi.com/gallery/">기타 메뉴</a>
							</li>
							
						</ul>
					</div>
				</div>
				<!--MENU END-->

			</div>

		</div>
	</div>

	<div class="fixed_site">
		<div class="fixed_wrap fixindex">
			<!--Slider Area-->
			<div id="slidera">

				<div class="slide_wrap">
					<div class="slider-wrapper theme-default">
						<div class="pbar_wrap">
							<div class="prog_wrap">
								<div class="progrssn" style="width: 10%;"></div>
							</div>
							<div class="pbar" id='astbar'>0%</div>
						</div>
						<div id="zn_nivo" class="zn_nivo">
							<img
								src="http://www.laosworld.net/files/attach/images/186/325/053/c6a7ebccca33df7b4fccae509982fdbf.jpg"
								alt="봄 사진" title="#nv_51" />
							
							<img
								src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/46456454-5_mini.jpg"
								alt="Lorem Ipsum Dolor Sit Amet" title="#nv_52" />
							<img
								src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/shutterstock_111389261_mini.jpg"
								alt="Slide with Link" title="#nv_53" /> 
							<img
								src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/46430454_Subscription_XXL-4_mini.jpg"
								alt="The Third Slide" title="#nv_54" />
						</div>

						<div id="nv_51" class="nivo-html-caption sld_layout1">
							<div class="nivoinner sld_layout1">
								<h3 class="entry-title">
									<a>봄 나무 나드의리</a>
								</h3>
								<p>나드의리 가야죠 다들.</p>
							</div>
						</div>
						
						<div id="nv_52" class="nivo-html-caption sld_layout2">
							<div class="nivoinner sld_layout2">
								<h3 class="entry-title">
									<a>Lorem Ipsum Dolor Sit Amet</a>
								</h3>
								<p>You can create unlimited slides in Asteria Lite.</p>
							</div>
						</div>

						<div id="nv_53" class="nivo-html-caption sld_layout3">
							<div class="nivoinner sld_layout3">
								<h3 class="entry-title">
									<a>Slide with Link</a>
								</h3>
								<p>This Slide has a link attached to it. Click the slide
									image to go that link.</p>
							</div>
						</div>

						<div id="nv_54" class="nivo-html-caption sld_layout1">
							<div class="nivoinner sld_layout1">
								<h3 class="entry-title">
									<a>The Third Slide</a>
								</h3>
								<p>This is the third slide with text layout set to "Layout1"</p>
							</div>
						</div>

					</div>
				</div>

			</div>

			<div class="home_blocks ast_blocks">
				<!--Blocks-->
				<div class="midrow">
					<div class="midrow_wrap">
						<div class="midrow_blocks">
							<div class="midrow_blocks_wrap">

								<!--BLOCK1 START-->

								<div class="midrow_block">
									<div class="mid_block_content">
										<div class="block_img">
											<div class="icon_wrap">
												<i class="fa-camera fa-2x"></i>
											</div>
										</div>
										<h3>PART1</h3>
										<p>영어로 몰할지 써야 있어 보이긴 하지만 그냥 한글로 적는다. 여긴 각 파트 마다 할걸 적으면 어떨까 하는 생각이 든다.</p>

									</div>
								</div>

								<!--BLOCK1 END-->

								<!--BLOCK2 START-->

								<div class="midrow_block">
									<div class="mid_block_content">
										<div class="block_img">
											<div class="icon_wrap">
												<i class="fa-rocket fa-2x"></i>
											</div>
										</div>
										<h3>Lorem Ipsum</h3>
										<p>Lorem ipsum dolor sit amet, consectetur dol adipiscing
											elit. Nam nec rhoncus risus. In ultrices lacinia ipsum,
											posuere faucibus velit bibe.</p>

									</div>
								</div>
								<!--BLOCK2 END-->

								<!--BLOCK3 START-->


								<div class="midrow_block">
									<div class="mid_block_content">
										<div class="block_img">
											<div class="icon_wrap">
												<i class="fa-signal fa-2x"></i>
											</div>
										</div>
										<h3>Lorem Ipsum</h3>
										<p>Lorem ipsum dolor sit amet, consectetur dol adipiscing
											elit. Nam nec rhoncus risus. In ultrices lacinia ipsum,
											posuere faucibus velit bibe.</p>

									</div>
								</div>
								<!--BLOCK3 END-->

								<!--BLOCK4 START-->

								<div class="midrow_block">
									<div class="mid_block_content">
										<div class="block_img">
											<div class="icon_wrap">
												<i class="fa-cogs fa-2x"></i>
											</div>
										</div>
										<h3>Lorem Ipsum</h3>
										<p>Lorem ipsum dolor sit amet, consectetur dol adipiscing
											elit. Nam nec rhoncus risus. In ultrices lacinia ipsum,
											posuere faucibus velit bibe.</p>

									</div>
								</div>
								<!--BLOCK4 END-->
							</div>
						</div>

					</div>

				</div>


				<!--Blocks END-->
			</div>
			<div class="home_blocks">
				<!--Text Block START-->
				<div class="text_block">
					<div class="text_block_wrap">
						<div class="center">
							<table border="0">
								<tbody>
									<tr>
										<td>
											<h2>Lorem ipsum dolor sit amet, consectetur dol
												adipiscing elit. Nam nec rhoncus risus. In ultrices lacinia
												ipsum, posuere faucibus velit bibe.</h2>
										</td>
										<td>
											<h3>
												<span style="color: #ffffff;"><a
													style="background: #30b7e8; padding: 15px 25px; border-radius: 5px;"
													href="http://www.towfiqi.com/asteria-lite-free-wordpress-theme.html"><span
														style="color: #ffffff;">Download</span></a></span>
											</h3>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<!--Text Block END-->
			</div>

			<div class="home_blocks">
				<!--Latest Posts-->
				<div class="lay1">
					<div class="center">
					
						<div class="homeposts_title">
							<h2 style="text-align: center;">
								<span style="color: #30b7e8;">Check Out Our Portfolio ( 포폴 체크 아웃 )</span>
							</h2>
							<p style="text-align: center;">The Very recent work for our clients ( 매우 최신 일한 것 들임 )</p>
						</div>

						<div class="lay1_wrap">
							
							<div
								class="post-50 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-50">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a
													href="http://asterialite.towfiqi.com/asteria-latest-post/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a href="http://asterialite.towfiqi.com/asteria-latest-post/"><img
											width="387" height="260"
											src="http://cfile8.uf.tistory.com/image/153D99454F4B1A0B024894"
											class="attachment-asteriathumb wp-post-image"
											alt="5461908494_fbd34cfd89_small" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a href="http://asterialite.towfiqi.com/asteria-latest-post/"
												title="Asteria Latest Post">봄이 왔 의리</a>
										</h2>
									</div>

								</div>
							</div>
							
							<div
								class="post-48 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-48">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a
													href="http://asterialite.towfiqi.com/asteria-theme-features/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a
											href="http://asterialite.towfiqi.com/asteria-theme-features/"><img
											width="387" height="260"
											src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/8628618360_c087a1a37b_z-387x260.jpg"
											class="attachment-asteriathumb wp-post-image"
											alt="8628618360_c087a1a37b_z" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a
												href="http://asterialite.towfiqi.com/asteria-theme-features/"
												title="Asteria Theme Features">Asteria Theme Features</a>
										</h2>
									</div>

								</div>
							</div>
							
							<div
								class="post-46 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-46">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a
													href="http://asterialite.towfiqi.com/if-you-say-it-loud-enough-youll-always-sound-precocious/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a
											href="http://asterialite.towfiqi.com/if-you-say-it-loud-enough-youll-always-sound-precocious/"><img
											width="387" height="260"
											src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/5486406319_ff35726f6d_z-387x260.jpg"
											class="attachment-asteriathumb wp-post-image"
											alt="5486406319_ff35726f6d_z" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a
												href="http://asterialite.towfiqi.com/if-you-say-it-loud-enough-youll-always-sound-precocious/"
												title="If you say it loud enough, you’ll always sound precocious">If
												you say it loud enough, you’ll always sound precocious</a>
										</h2>
									</div>

								</div>
							</div>
							
							<div
								class="post-44 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-44">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a href="http://asterialite.towfiqi.com/comment-test/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a href="http://asterialite.towfiqi.com/comment-test/"><img
											width="387" height="260"
											src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/rodneysmith0-387x260.jpg"
											class="attachment-asteriathumb wp-post-image"
											alt="rodneysmith0" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a href="http://asterialite.towfiqi.com/comment-test/"
												title="Comment Test">Comment Test</a>
										</h2>
									</div>

								</div>
							</div>
							
							<div
								class="post-42 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-42">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a
													href="http://asterialite.towfiqi.com/this-post-has-no-body/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a
											href="http://asterialite.towfiqi.com/this-post-has-no-body/"><img
											width="387" height="260"
											src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/4609083615_4b3bb5f9d3_z-387x260.jpg"
											class="attachment-asteriathumb wp-post-image"
											alt="4609083615_4b3bb5f9d3_z" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a
												href="http://asterialite.towfiqi.com/this-post-has-no-body/"
												title="This post has no body">This post has no body</a>
										</h2>
									</div>

								</div>
							</div>
							
							<div
								class="post-40 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-40">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a href="http://asterialite.towfiqi.com/readability-test/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a href="http://asterialite.towfiqi.com/readability-test/"><img
											width="387" height="260"
											src="http://asterialite.towfiqi.com/wp-content/uploads/2013/11/Shoot-2-00451-1024x876-387x260.jpg"
											class="attachment-asteriathumb wp-post-image"
											alt="Shoot-2-00451-1024x876" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a href="http://asterialite.towfiqi.com/readability-test/"
												title="Readability Test">Readability Test</a>
										</h2>
									</div>

								</div>
							</div>


							<div
								class="post-100 post type-post status-publish format-standard has-post-thumbnail hentry category-uncategorized"
								id="post-100">

								<div class="post_image">
									<div class="img_hover">
										<div class="icon_wrap">
											<div class="icon_round">
												<a href="http://asterialite.towfiqi.com/readability-test/"><i
													class="fa-link fa-2x"></i></a>
											</div>
										</div>
									</div>
									<!--CALL POST IMAGE-->

									<div class="imgwrap">
										<a href="http://asterialite.towfiqi.com/readability-test/"><img
											width="387" height="260"
											src="http://cfile2.uf.tistory.com/image/132CDF3C4F66305D1F33D4"
											class="attachment-asteriathumb wp-post-image"
											alt="Shoot-2-00451-1024x876" /></a>
									</div>

									<!--POST CONTENT-->
									<div class="post_content">
										<h2 class="postitle">
											<a href="http://asterialite.towfiqi.com/readability-test/"
												title="Readability Test">Readability Test</a>
										</h2>
									</div>

								</div>
							</div>
							
						</div>



						<!--PAGINATION START-->
						<div class="ast_pagenav">
							<span class='page-numbers current'>1</span> <a
								class='page-numbers'
								href='http://asterialite.towfiqi.com/page/2/'>2</a>
						</div>
						<!--PAGINATION END-->

					</div>
				</div>
				<!--Latest Posts END-->
			</div>



		</div>
	</div>
	<!--To Top Button-->
	<a class="to_top"><i class="fa-angle-up fa-2x"></i></a>
	<!--To Top Button END-->


	<!--Footer Start-->
	<div class="fixed_site">
		<div class="fixed_wrap footefixed">

			<div id="footer">
				<div class="center">
					<!--Footer Widgets START-->
					<div class="widgets">
						<ul></ul>
					</div>
					<!--Footer Widgets END-->
				</div>
			</div>
			<!--Footer END-->

			<!--Copyright Footer START-->
			<div id="copyright">
				<div class="center">
					<!--Site Copyright Text START-->
					<div class="copytext">
						Theme by <a class="towfiq" target="_blank"
							href="http://www.towfiqi.com/">Towfiq I.</a>
					</div>
					<!--Site Copyright Text END-->

					<!--SOCIAL ICONS START-->
					<div class="head_soc"></div>
					<!--SOCIAL ICONS END-->
				</div>
			</div>
			<!--Copyright Footer Start-->
		</div>
	</div>

	<script type="text/javascript">

// .nivoSlider()
// http://choe.gkctv.com/index.php?mid=jquery&sort_index=readed_count&order_type=asc&document_srl=317
		
	jQuery(window)
				.ready(
						function() {

							// nivoslider init
							jQuery('#zn_nivo')
									.nivoSlider(
											{
												effect : 'random',
												animSpeed : 700,
												pauseTime : 4000,
												startSlide : 0,
												slices : 10,
												directionNav : true,
												directionNavHide : true,
												controlNav : true,
												controlNavThumbs : false,
												keyboardNav : true,
												manualAdvance : false,
												pauseOnHover : true,
												captionOpacity : 0.8,
												afterLoad : function() {
													if (jQuery(window).width() < 480) {
														jQuery(".nivo-caption")
																.animate(
																		{
																			"opacity" : "1",
																			"right" : "0"
																		},
																		{
																			easing : "easeOutBack",
																			duration : 500
																		});
													} else {
														jQuery(".nivo-caption")
																.animate(
																		{
																			"opacity" : "1",
																			"right" : "11%"
																		},
																		{
																			easing : "easeOutBack",
																			duration : 500
																		});
														jQuery(
																"#zn_nivo, .nivo-controlNav, #slide_acord, .nivoinner")
																.css(
																		{
																			"display" : "block"
																		});
														jQuery(".nivo-caption")
																.addClass(
																		'sld3wrap');
													}
												},
												beforeChange : function() {
													jQuery(".nivo-caption")
															.animate(
																	{
																		right : "-500px"
																	},
																	{
																		easing : "easeInBack",
																		duration : 500
																	});
													//jQuery(".nivo-caption").delay(400).removeClass('sld3wrap');
													jQuery('.nivo-caption')
															.animate({
																"opacity" : "0"
															}, 100);
													jQuery('.nivo-caption')
															.delay(500)
															.queue(
																	function(
																			next) {
																		jQuery(
																				this)
																				.removeClass(
																						"sld3wrap");
																		next();
																	});

												},
												afterChange : function() {
													if (jQuery(window).width() < 480) {
														jQuery(".nivo-caption")
																.animate(
																		{
																			"opacity" : "1",
																			"right" : "0"
																		},
																		{
																			easing : "easeOutBack",
																			duration : 500
																		});
													} else {
														jQuery(".nivo-caption")
																.animate(
																		{
																			"opacity" : "1",
																			"right" : "11%"
																		},
																		{
																			easing : "easeOutBack",
																			duration : 500
																		});
														jQuery(".nivo-caption")
																.has(
																		'.sld_layout3')
																.addClass(
																		'sld3wrap');
													}
												}
											});

						});
	</script>


	<script type="text/javascript">
		//Sidebar List style type
		jQuery('#sidebar .widgets .widget li').prepend(
				'<i class="fa-angle-double-right"></i> ');

		//Header4 Fix
		jQuery(window).bind("load", function() {
			var headheight = (jQuery(".logo").outerHeight());
			var logowidth = (jQuery(".logo").outerWidth());
			var menuwidth = (jQuery("#topmenu").outerWidth());
			if (logowidth + menuwidth < 1100) {
				//var headheight = (jQuery(".header4").outerHeight());

				jQuery(".header4 #topmenu").css({
					"minHeight" : headheight
				});
				jQuery(".header4 #topmenu ul li ul, .header4 .head_soc").css({
					"top" : headheight + 'px'
				});
				jQuery(".header4 #topmenu ul li").css({
					"paddingTop" : "0px",
					"paddingBottom" : "0px",
					"height" : headheight - 3 + 'px',
					"line-height" : headheight - 3 + 'px'
				});
				jQuery(".header4 #topmenu ul li ul li ul").css({
					"marginTop" : '-' + headheight + 'px'
				});
			} else {
				jQuery(".header4 #topmenu").addClass('bigmenu');
			}
		});

		//Hide Slider until its loaded
		jQuery('#zn_nivo, .nivo-controlNav').css({
			"display" : "none"
		});
		var galleryloadergif = "http://asterialite.towfiqi.com/wp-content/themes/asteria_lite/images/newloader.gif";
		//The Colors-------------------------------------------
		var primarytext = "#888888";
		var sechovertext = "#FFFFFF";
		var menutext = "#FFFFFF";
		var footwidget = "#999999";
		var footwidgethover = "#ffffff";

		var primarycolor = "#30b7e8";
		var primardefault = "#ffffff";
		var sechover = "#30b7e8";
		var socialbuttons = "#cccccc";

		//Midrow Blocks Equal Width
		if (jQuery('.midrow_block').length == 4) {
			jQuery('.midrow_blocks').addClass('fourblocks');
		}
		if (jQuery('.midrow_block').length == 3) {
			jQuery('.midrow_blocks').addClass('threeblocks');
		}
		if (jQuery('.midrow_block').length == 2) {
			jQuery('.midrow_blocks').addClass('twoblocks');
		}
		if (jQuery('.midrow_block').length == 1) {
			jQuery('.midrow_blocks').addClass('oneblock');
		}

		//AJAX PAGINATION
		jQuery(document)
				.ready(
						function() {

							jQuery('.ast_pagenav span')
									.replaceWith(
											function() {
												var pathname = window.location.pathname;
												var url = (jQuery(this).text());
												if (jQuery("span.page-numbers")
														.prev().length === 0) {
													return '<a class="page-numbers current" href="http://asterialite.towfiqi.com/?paged=1" target="_blank">'
															+ url + '</a>';
												} else {
													return '<a class="page-numbers current" href="http://asterialite.towfiqi.com/" target="_blank">'
															+ url + '</a>';
												}
											});

							jQuery('.ast_pagenav span.page-numbers')
									.each(
											function() {
												var pathname = window.location.pathname;

												var href = jQuery(this).attr(
														'href');
												jQuery(this).attr('href',
														href + '?paged=1');

											});

							jQuery('.ast_pagenav a').each(
									function() {

										this.href = this.href.replace('/page/',
												'?paged=');
									});
							jQuery('.ast_pagenav a')
									.on(
											'click',
											function(e) {
												jQuery(
														'.ast_pagenav a, span.page-numbers')
														.removeClass('current'); // remove if already existant
												jQuery(this)
														.addClass('current');

												e.preventDefault();

												//Layout 1 Ajax
												var link = jQuery(this).attr(
														'href');
												jQuery('.lay1_wrap')
														.html(
																'<div class="ast_ajaxwrap"><div class="sk-spinner sk-spinner-wave"><div class="sk-rect1"></div><div class="sk-rect2"></div><div class="sk-rect3"></div><div class="sk-rect4"></div><div class="sk-rect5"></div></div></div>')
														.load(
																link
																		+ '.lay1_wrap .hentry',
																function() {

																	if (jQuery(
																			window)
																			.width() < 360) {
																		var divs = jQuery(".lay1 .hentry");
																		for (var i = 0; i < divs.length; i += 1) {
																			divs
																					.slice(
																							i,
																							i + 1)
																					.wrapAll(
																							"<div class='ast_row'></div>");
																		}
																	} else if (jQuery(
																			window)
																			.width() < 480) {
																		var divs = jQuery(".lay1 .hentry");
																		for (var i = 0; i < divs.length; i += 2) {
																			divs
																					.slice(
																							i,
																							i + 2)
																					.wrapAll(
																							"<div class='ast_row'></div>");
																		}
																	} else {
																		var divs = jQuery(".lay1 .hentry");
																		for (var i = 0; i < divs.length; i += 3) {
																			divs
																					.slice(
																							i,
																							i + 3)
																					.wrapAll(
																							"<div class='ast_row'></div>");
																		}
																	}

																	if (jQuery(
																			window)
																			.width() > 360) {
																		jQuery(
																				'.lay1_wrap')
																				.fadeIn(
																						500);
																		jQuery(
																				".hentry")
																				.hide()
																				.each(
																						function() {
																							jQuery(
																									this)
																									.fadeIn(
																											500,
																											"easeInSine");
																						});
																		var divheight = jQuery(
																				'.lay1 .ast_row .hentry:eq(0)')
																				.outerHeight();
																		//jQuery(".ast_row").height(divheight);
																		jQuery(
																				window)
																				.resize(
																						function() {
																							var divheight = jQuery(
																									'.lay1 .ast_row .hentry:eq(0)')
																									.outerHeight();
																							jQuery(
																									".ast_row")
																									.height(
																											divheight);
																						});
																	}
																	//Layout 1 Ajax END

																});

											});

						}); // end ready function
	</script>
</body>
</html>