//package dragon.event.controller;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import dragon.authentication.api.MemberSessionApi;
//import dragon.board.dto.BoardArticle;
//import dragon.commons.dto.DisplayDto;
//import dragon.commons.dto.DisplayProductDto;
//import dragon.commons.paging.PageHolder;
//import dragon.commons.utils.LogFrontUtil;
//import dragon.event.dto.Event;
//import dragon.event.dto.EventProduct;
//import dragon.event.dto.EventProductCountByCategory;
//import dragon.event.dto.EventSearchParam;
//import dragon.event.dto.EventWinnerBoard;
//import dragon.event.service.EventService;
///**
// * [Biz]
// * 1. 일반 사용자는 일반 이벤트만 노출, 딜러는 둘다 노출 한다.
// * @file EventController.java
// * @brief 
// * @author 최대열
// * @date 생성 : 생성일(2014. 12. 19.)
// * @date 최종수정 : 최종 수정일(2014. 12. 19.)
// */
//@Controller
//public class EventController {
//	private static final Log logger = LogFactory.getLog(EventController.class);
//	
//	@Inject
//	MemberSessionApi memberSessionApi;
//
//	@Autowired
//	EventService eventService;
//	
//	/**
//	 * 
//	 * @brief 이벤트 메인 view
//	 * @details 
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/event/eventMain")
//	public String eventMainView(Model model){
//		DisplayDto displayParam = new DisplayDto();
//
//		String viewName = "/event/eventMainGerneral";
//		
//		EventSearchParam eventSearchParam = new EventSearchParam();
//		if(!memberSessionApi.isDealer()){
//			displayParam.setDealerFlag("0");
//			eventSearchParam.setEventType("0");
//		}else{
//			displayParam.setDealerFlag("1");
//			eventSearchParam.setEventType("1");
//		}
//		
//		//어텐션 이벤트존(1)
//        List<DisplayProductDto> eventMain021 = eventService.getEventMain021(displayParam);
//        //어텐션 이벤트존(2~4)
//        List<DisplayProductDto> eventMain022 = eventService.getEventMain022(displayParam);
//        
//        
//        
//        List<EventProductCountByCategory> arlEventProductCountByCategories = eventService.getEventProductCountByCategory(eventSearchParam);
//        //이벤트
//        List<BoardArticle> arlBaordEventList = eventService.getBoardEventList(eventSearchParam);
//        
//        model.addAttribute("eventMain021", eventMain021);
//        model.addAttribute("eventMain022", eventMain022);
//        model.addAttribute("arlBaordEventList", arlBaordEventList);
//        model.addAttribute("arlEventProductCountByCategories", arlEventProductCountByCategories);
//        
//		return viewName;
//	}
//	
//	/**
//	 * 
//	 * @brief 이벤트 메인 컨텐츠
//	 * @details 
//	 * @param eventSearchParam
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/event/ajaxEventMainGerneralEventListContent")
//	public String eventMainGerneralEventListContent(EventSearchParam eventSearchParam,Model model){
//		
//		if(!memberSessionApi.isDealer()){
//			eventSearchParam.setEventType("0");
//		}else{
//			eventSearchParam.setEventType("1");
//		}
//		
//	
//        if(eventSearchParam ==null || eventSearchParam.getListSize()==0){
//        	eventSearchParam.setListSize(10);
//		}
//        
//        List<Event> arlEvents = eventService.getEventList(eventSearchParam);
//        Integer pageCnt = eventService.getEventListCount(eventSearchParam);
//
//        
//        model.addAttribute("cntList", pageCnt);
//        model.addAttribute("eventSearchParam", eventSearchParam);
//        model.addAttribute("arlEvents", arlEvents);
//        model.addAttribute("pageHolder", new PageHolder(pageCnt, eventSearchParam.getPage(), eventSearchParam.getListSize()));//product.getListSize()));// list total count, 현제페이지, 페이지에 보여질목록 갯수
//        return "/event/ajaxEventMainGerneralEventListContent";
//	}
//	
//	/**
//	 * 
//	 * @brief 이벤트 상세
//	 * @details 
//	 * @param eventSearchParam
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/event/eventDetail")
//	public String eventDetail(EventSearchParam eventSearchParam, Model model){
//		
//		if(!memberSessionApi.isDealer()){
//			eventSearchParam.setEventType("0");
//		}else{
//			eventSearchParam.setEventType("1");
//		}
//		
//		Event event = eventService.getEventDetail(eventSearchParam);
//		model.addAttribute("event", event);
//		
//		if(event!=null){
//			event.setListSize(10);
//			List<EventProduct> arlProductList = eventService.getEventProductList(event);
//			Integer pageCnt = eventService.getEventProductListCount(event.getEventSeq());
//			
//			model.addAttribute("pageHolder", new PageHolder(pageCnt, eventSearchParam.getPage(), eventSearchParam.getListSize()));//product.getListSize()));// list total count, 현제페이지, 페이지에 보여질목록 갯수
//			model.addAttribute("arlProductList",arlProductList);
//		}else{//이벤트 시작일 종료일 사이 날짜와 딜러여부에 따른 이벤트 타입 검증
//			model.addAttribute("errorMessage","이벤트 기간이 지났거나 유효한 이벤트가 아닙니다.");
//		}
//		
//		return "/event/eventDetail";
//	}
//
//	/**
//	 * 
//	 * @brief 이벤트 당첨자 리스트
//	 * @details 
//	 * @param eventWinnerBoard
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/event/eventWinnerList")
//	public String eventWinnerList(EventWinnerBoard eventWinnerBoard, Model model){
//		return "/event/eventWinnerList";
//	}
//	
//	/**
//	 * 
//	 * @brief 이벤트 당첨자 리스트
//	 * @details 
//	 * @param eventWinnerBoard
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/event/ajaxEventWinnerList")
//	public String ajaxEventWinnerList(EventWinnerBoard eventWinnerBoard, Model model){
//		eventWinnerBoard.setListSize(5);
//		List<EventWinnerBoard> arlBoardEventList = eventService.getBoardEventListForWinner(eventWinnerBoard);
//		Integer pageCnt = eventService.getBoardEventListForWinnerCount(eventWinnerBoard);
//		
//		
//		
//		model.addAttribute("cntList", pageCnt);
//		model.addAttribute("eventSearchParam", eventWinnerBoard);
//		model.addAttribute("pageHolder", new PageHolder(pageCnt, eventWinnerBoard.getPage(), eventWinnerBoard.getListSize()));//product.getListSize()));// list total count, 현제페이지, 페이지에 보여질목록 갯수
//		model.addAttribute("arlBoardEventList", arlBoardEventList);
//		return "/event/ajaxEventWinnerList";
//	}
//
//	
//	/**
//	 * 
//	 * @brief 이벤트 당첨자 상세
//	 * @details 
//	 * @param boardArticleId
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("/event/eventWinnerDetail")
//	public String eventWinnerDetail(@RequestParam Long boardArticleId , Model model){
//		eventService.updateViewCount(boardArticleId);
//		EventWinnerBoard eventWinnerBoard = eventService.getBoardEventWinner(boardArticleId);
//		model.addAttribute("eventWinnerBoard", eventWinnerBoard);
//		
////		if(!memberSessionApi.isDealer()){//private String eventType;//-0 : 일반  1 : 딜러전용 2 : 정대세
////			if(StringUtils.equals(eventWinnerBoard.getEventType(), "1"));
////			model.addAttribute("errorMessage", "딜러 전용 이벤트는 딜러만 접근 가능합니다.");
////		}
//		
//		return "/event/eventWinnerDetail";
//	}
//	
//}
//
