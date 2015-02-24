//package dragon.api.admin.controller;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.inject.Inject;
//import javax.validation.Valid;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import dragon.api.admin.dto.AssemblePcPriceDto;
//import dragon.api.admin.dto.AssembleProductDto;
//import dragon.api.admin.dto.CouponApplyPriceDto;
//import dragon.api.admin.dto.CouponDto;
//import dragon.api.admin.dto.CouponParamDto;
//import dragon.api.admin.dto.ParamDto;
//import dragon.api.admin.dto.ProductInfo2Dto;
//import dragon.api.admin.dto.ProductPriceDto;
//import dragon.api.admin.service.RESTfulApiService;
//
//@Controller
//public class RESTfulApiController {
//		
//	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//	
//	@Inject
//	private RESTfulApiService restfulApiService;
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getProductPrice
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 17.
//	 * @param memberId (회원아이디)
//	 * @param productId (상품ID)
//	 * @return
//	 */
//	@RequestMapping(value = "/productPrice/{memberId}/{productId}", 
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<ProductPriceDto> getProductPrice(@PathVariable String memberId, 
//															@PathVariable Integer productId) {
//		ParamDto paramDTO = new ParamDto();
//
//		if (memberId == null || memberId.trim().equals("")) {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST); //http status code 400 return
//		}
//
//		if (productId == null || productId == 0) {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST); //http status code 400 return
//		}
//		
//		paramDTO.setMemberId(memberId);
//		paramDTO.setProductId(productId);
//		
//		System.out.println("Member Id : " + memberId + ", Product Id : " + productId);
//		
//		ProductPriceDto returnProductPrice = this.restfulApiService.getProductPrice(paramDTO);
//
//		if (returnProductPrice == null) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT); //http status code 204 return
//		}
//
//		return new ResponseEntity<>(returnProductPrice, HttpStatus.OK);
//	}
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getAssembleProductPrice
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 17.
//	 * @param memberId (회원아이디)
//	 * @param assemblePcId (조립PC 아이디)
//	 * @param categoryId (카테고리 아이디)
//	 * @return
//	 */
//	@RequestMapping(value = "/assembleProductPrice/{memberId}/{assemblePcId}/{categoryId}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<List<AssembleProductDto>> getAssembleProductPrice(@PathVariable String memberId , 
//																  @PathVariable Integer assemblePcId, 
//																  @PathVariable String categoryId) {
//		ParamDto paramDTO = new ParamDto();
//		
//		String substringCategoryId = null;
//		
//		if(memberId == null || memberId.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		if(assemblePcId == null || assemblePcId == 0){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		if(categoryId == null || categoryId.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		substringCategoryId = categoryId.substring(0, 4);
//		paramDTO.setMemberId(memberId);
//		paramDTO.setAssemblePcId(assemblePcId);
//		paramDTO.setCategoryId(substringCategoryId);
//		
//		LOGGER.debug("Member Id : " + memberId 
//				+ ", Assemble Pc Id : " + assemblePcId 
//				+ ", Category Id : " + paramDTO.getCategoryId());
//		
//		List<AssembleProductDto> assembleProduct = this.restfulApiService.getAssembleProductPrice(paramDTO);
//		
//		if(assembleProduct.isEmpty()) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//		
//		return new ResponseEntity<>(assembleProduct, HttpStatus.OK);
//	}
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getPriceInfo
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 17.
//	 * @param memberId (회원아이디)
//	 * @param productPriceHistoryId 
//	 * @return
//	 */
//	@RequestMapping(value = "/priceInfo/{memberId}/{productPriceHistoryId}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> getPriceInfo(@PathVariable String memberId, 
//												 @PathVariable Integer productPriceHistoryId) {
//
//		ParamDto paramDTO = new ParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		int productPrice = 0;
//		
//		if(memberId == null || memberId.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		if(productPriceHistoryId == null || productPriceHistoryId == 0){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		paramDTO.setMemberId(memberId);
//		paramDTO.setProductPriceHistoryId(productPriceHistoryId);
//
//		LOGGER.debug("Member Id : " + memberId + ", Product Price History Id : " + productPriceHistoryId);
//		
//		productPrice = this.restfulApiService.getPriceInfo(paramDTO);
//		
//		System.out.println("productPrice : " + productPrice);
//		
//		returnMap.put("productPrice", productPrice);
//		
//
//		if (productPrice == -100) {
//			System.out.println("No result");
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT); //http status code 204 return
//		}
//
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//		
//	}
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getCouponApplyPriceInfo
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 17.
//	 * @param productId (상품ID)
//	 * @return
//	 */
//	@RequestMapping(value = "/couponApplyPriceInfo/{productId}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<CouponApplyPriceDto> getCouponApplyPriceInfo(@PathVariable Integer productId) {
//		
//		ParamDto paramDTO = new ParamDto();
//		
//		if(productId == null || productId == 0){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		paramDTO.setProductId(productId);
//		
//		LOGGER.debug("Product Id : " + productId);
//		
//		CouponApplyPriceDto returnCouponApplyPrice = this.restfulApiService.getCouponApplyPriceInfo(paramDTO);
//		
//		if(returnCouponApplyPrice == null) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//		
//		return new ResponseEntity<>(returnCouponApplyPrice, HttpStatus.OK);
//	}
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getAssemblePcPrice
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 18.
//	 * @param productId (상품ID), memberId, associatiedProductIds
//	 * #06. 조립피씨정보 
//	 * @return
//	 */
//	@RequestMapping(value = "/assemblePcPriceInfo/{memberId}/{productId}/{associatiedProductIds}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<AssemblePcPriceDto> getAssemblePcPrice(@PathVariable String memberId, 
//																  @PathVariable Integer productId, 
//															  	  @PathVariable String associatiedProductIds) {
//		
//		ParamDto paramDTO = new ParamDto();
//		if(memberId == null || memberId == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		if(productId == null || productId == 0){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		if(associatiedProductIds == null || associatiedProductIds == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		paramDTO.setMemberId(memberId);
//		paramDTO.setProductId(productId);
//		paramDTO.setAssociatiedProductIds(associatiedProductIds);
//		
//		AssemblePcPriceDto returnAssemblePcPrice = this.restfulApiService.getAssemblePcPrice(paramDTO);
//		
//		if(returnAssemblePcPrice == null) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//		
//		return new ResponseEntity<>(returnAssemblePcPrice, HttpStatus.OK);
//	}
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getAvailableCouponProductList
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 18.
//	 * @param productId (상품ID), memberId, associatiedProductIds
//	 * #20. 상품쿠폰 사용가능 여부 리스트 조회
//	 * @return
//	 */
//	@RequestMapping(value = "/availableCouponProductList/{memberId}/{productIds}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> getAvailableCouponProductList(@PathVariable String memberId, 
//																	@PathVariable String productIds) {
//		
//		CouponParamDto paramDTO = new CouponParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(memberId == null || memberId == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		if(productIds == null || productIds == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//							
//		paramDTO.setMemberId(memberId);
//		paramDTO.setProductIds(productIds);
//		
//		List<CouponDto> returnCouponInfo = this.restfulApiService.getAvailableCouponProductList(paramDTO);
//		returnMap.put("availableCouponProductList", returnCouponInfo);
//		
//		if(returnCouponInfo == null) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//		
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//	}
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getAvailableCouponInfo
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 19.
//	 * @param productId (상품ID), memberId, associatiedProductIds
//	 * #21. 조립피씨정보 
//	 * @return
//	 */
//	@RequestMapping(value = "/availableCouponInfo/{couponType}/{memberId}/{productId}/{orderTotalAmount}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> getAvailableCouponInfo(@PathVariable String couponType, 
//															       @PathVariable String memberId, 
//															       @PathVariable Integer productId, 
//															       @PathVariable Long orderTotalAmount) {
//		
//		CouponParamDto paramDTO = new CouponParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(couponType == null || couponType == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		if(memberId == null || memberId == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//						
//		paramDTO.setCouponType(couponType);
//		paramDTO.setMemberId(memberId);
//		paramDTO.setProductId(productId);
//		paramDTO.setOrderTotalAmount(orderTotalAmount);
//				
//		List<CouponDto> returnCouponInfo = this.restfulApiService.getAvailableCouponInfo(paramDTO);
//		
//		returnMap.put("availableCouponList", returnCouponInfo);
//		
//		if(returnCouponInfo == null) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//		
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//	}
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getCouponApplyPriceList
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 23.
//	 * @param couponInfo
//	 * #22. 상품쿠폰 적용금액 리스트 조회
//	 * @return
//	 */
//	@RequestMapping(value = "/couponApplyPriceList/{couponInfo}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody ResponseEntity<Map<String, Object>> getCouponApplyPriceList(@PathVariable String couponInfo) {
//		
//		ParamDto paramDTO = new ParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(couponInfo == null || couponInfo == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//							
//		paramDTO.setCouponInfo(couponInfo);
//				
//		List<ProductPriceDto> returnCouponInfo = this.restfulApiService.getCouponApplyPriceList(paramDTO);
//		
//		returnMap.put("couponApplyPriceList", returnCouponInfo);
//				
//		/*for(ProductPriceDto dto : returnCouponInfo){
//			returnMap = new HashMap<String, Object>();
//			returnMap.put("productId", dto.getProductId());
//			returnMap.put("couponApplyPrice", dto.getCouponApplyPrice());
//			convertMap.add(returnMap);
//		}
//		
//		Map<String,Object> couponApplyList = new HashMap<String,Object>();
//		
//		couponApplyList.put("couponApplyPriceList", convertMap);
//		
//		if(couponApplyList == null) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//		*/
//		
//		//return new ResponseEntity<>(returnProductInfo, HttpStatus.OK);
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//	}
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getAvailableCouponInfo
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 19.
//	 * @param productId (상품ID), memberId, associatiedProductIds
//	 * #28. 상품 정보 리스트 조회
//	 * @return
//	 */
//	@RequestMapping(value = "/productInfo2/{memberId}/{productIds}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody ResponseEntity<Map<String, Object>> getProductInfoList(@PathVariable String memberId,  @PathVariable String productIds) {
//		
//		ParamDto paramDTO = new ParamDto();
//		Map<String,Object> returnMap = null;
//		
//		
//		if(memberId == null || memberId == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		if(productIds == null || productIds == ""){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//							
//		paramDTO.setMemberId(memberId);
//		paramDTO.setProductIds(productIds);
//				
//		List<ProductInfo2Dto> returnProductInfo = this.restfulApiService.getProductInfoList(paramDTO);
//		List<Map<String,Object>> convertMap = new ArrayList<Map<String,Object>>();//받아온 데이터 HashMap변경요청 .
//		
//		for(ProductInfo2Dto dto : returnProductInfo){
//			returnMap = new HashMap<String, Object>();
//			returnMap.put("productAssembleFlag", dto.getProductAssembleFlag()); 
//			returnMap.put("productId", dto.getProductId());
//			returnMap.put("imageUrl", dto.getImageUrl());
//			returnMap.put("categoryId", dto.getCategoryId());
//			returnMap.put("categoryName", dto.getCategoryName());
//			returnMap.put("productName", dto.getProductName());
//			returnMap.put("productPriceHistoryId", dto.getProductPriceHistoryId());
//			returnMap.put("productPrice", dto.getProductPrice());
//			returnMap.put("limitMaxCount", dto.getLimitMaxCount());
//			returnMap.put("deliveryType", dto.getDeliveryType());
//			returnMap.put("deliveryFreeType", dto.getDeliveryFreeType());
//			returnMap.put("deliveryPrice", dto.getDeliveryPrice());
//			returnMap.put("eventFlag", dto.getEventFlag());
//			returnMap.put("savingPoint", dto.getSavingPoint());
//			convertMap.add(returnMap);
//		}
//		
//		Map<String,Object> productList = new HashMap<String,Object>();
//		productList.put("productList", convertMap);
//		
//		if(returnProductInfo == null) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
//		
//		//return new ResponseEntity<>(returnProductInfo, HttpStatus.OK);
//		return new ResponseEntity<>(productList, HttpStatus.OK);
//	}
//	
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getPriceInfo
//	 * @author: 어드민/윤주빈
//	 * @date: 2014. 12. 17.
//	 * @param productInfo
//	 * @return
//	 */
//	@RequestMapping(value = "/boxCount/{productInfo}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> getBoxInfo(@PathVariable String productInfo) {
//
//		ParamDto paramDTO = new ParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(productInfo == null || productInfo.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		paramDTO.setProductInfo(productInfo);
//		System.out.println("productInfo Id : " + productInfo);
//		
//		int boxCount = this.restfulApiService.getBoxCount(paramDTO);
//		
//		returnMap.put("boxCount", boxCount);
//		
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//		
//	}
//	
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getPriceInfo
//	 * @author: 어드민/윤주빈
//	 * @suf : 어드민/유창근
//	 * @date: 2014. 12. 31.
//	 * @param basketId (회원아이디)
//	 * @param productIdList 
//	 * @return
//	 */
//	@RequestMapping(value = "/assemblePcProductPriceInfo",
//					method = {RequestMethod.GET , RequestMethod.POST},
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> getAssamblePcProductPriceInfo(@RequestBody Map<String,Object> paramMap) {
//		
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(!paramMap.containsKey("basketId")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		if(!paramMap.containsKey("productIdList")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		returnMap = this.restfulApiService.getAssemblePcPrice2(paramMap);
//		
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);		
//	}
//	
//
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: getPriceInfo
//	 * @author: 어드민/윤주빈
//	 * @date: 2015. 1. 2.
//	 * @param couponType
//	 * @param issueCode
//	 * @param orderTotalAmount 
//	 * @return
//	 */
//	@RequestMapping(value = "/deliveryDiscountPrice/{couponType}/{issueCode}/{orderTotalAmount}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> getDeliveryDcPrice(@PathVariable String couponType, 
//																@PathVariable String issueCode, 
//																@PathVariable Long orderTotalAmount) {
//
//		CouponParamDto paramDTO = new CouponParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(couponType == null || couponType.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		if(issueCode == null || issueCode.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		paramDTO.setCouponType(couponType);
//		paramDTO.setIssueCode(issueCode);
//		paramDTO.setOrderTotalAmount(orderTotalAmount);
//		
//		long discountPrice = this.restfulApiService.getDeliveryDiscountPrice(paramDTO);
//		
//		returnMap.put("deliveryDCPrice", discountPrice);
//		
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//		
//	}
//	
//	/**
//	 * 
//	 * @brief
//	 * @Method Name: updateProductStock
//	 * @author: 어드민/윤주빈
//	 * @date: 2015. 1. 2.
//	 * @param productInfo
//	 * @return
//	 */
//	@RequestMapping(value = "/productStockUpdate/{productInfo}",
//					method = RequestMethod.GET,
//					produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody 
//			ResponseEntity<Map<String, Object>> updateProductStock(@PathVariable String productInfo) {
//
//		ParamDto paramDTO = new ParamDto();
//		Map<String,Object> returnMap = new HashMap<String, Object>();
//		
//		if(productInfo == null || productInfo.trim().equals("")){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		paramDTO.setProductInfo(productInfo);
//		
//		int updateResult = this.restfulApiService.updateProductStock(paramDTO);
//		
//		returnMap.put("result", updateResult);
//		
//		return new ResponseEntity<>(returnMap, HttpStatus.OK);
//		
//	}
//}