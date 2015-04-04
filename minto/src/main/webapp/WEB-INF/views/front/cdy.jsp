<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/views/front/include/header.jsp"%>

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
<c:forEach items="${arlTop1}" var="top1">
							<img
								src="http://www.laosworld.net/files/attach/images/186/325/053/c6a7ebccca33df7b4fccae509982fdbf.jpg"
								alt="봄 사진" title="#nv_51" />
</c:forEach>				
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

			<c:forEach items="${arlTop1}" var="top1">
					<div id="nv_51" class="nivo-html-caption sld_layout1">
							<div class="nivoinner sld_layout1">
								<h3 class="entry-title">
									<a>${top1.title}</a>
								</h3>
								<p>${top1.content}</p>
							</div>
						</div>
			</c:forEach>
						
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

<c:forEach items="${arlTop2}" var="top2">
								<div class="midrow_block">
									<div class="mid_block_content">
										<div class="block_img">
											<div class="icon_wrap">
												<i class="fa-camera fa-2x"></i>
											</div>
										</div>
										<h3>${top2.title}</h3>
										<p>${top2.content}</p>

									</div>
								</div>
</c:forEach>

								<!--BLOCK1 START-->
<%
for(int i=0 ;i<4;i++){
%>
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

<%	
}
%>

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