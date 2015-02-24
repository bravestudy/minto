package org.bravestudy.minto.common.certification;
///**
// * @file CertificationInterceptor.java
// * @brief 인증 및 권한 체크를 하는 인터셉터
// * @author 어드민
// * @date 생성 : 2014-11-12
// * @date 최종수정: 2014-11-12
// */
//package dragon.certification.interceptor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.inject.Inject;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.method.HandlerMethod;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import dragon.admin.environment.dto.MenuDto;
//import dragon.admin.environment.service.impl.MenuServiceImpl;
//import dragon.certification.annotation.IgnoreAccessibleCheck;
//import dragon.certification.annotation.IgnoreLoginCheck;
//import dragon.certification.api.UserSessionApi;
//import dragon.certification.exception.AccessDeniedException;
//import dragon.certification.exception.SessionNotFoundException;
//import dragon.commons.utility.StringUtil;
//
//
//public class CertificationInterceptor extends HandlerInterceptorAdapter {
//	
//	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//	
//    @Inject
//    private UserSessionApi userSessionAPI;
//
//    @Inject
//    private MenuServiceImpl menuService;
//    
//    
//    /*@Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
//        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
//        response.setHeader("Pragma", "no-cache"); // HTTP 1.0
//        response.setDateHeader("Expires", 0); // Proxies
//    };*/
//    
//    
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String requestUrl = request.getRequestURI().toString();
//        String contextPath = request.getContextPath();
//
//        /**
//         * ignore ( resources or "*.json" or "*.jsonp" )
//         */
//        if (handler instanceof HandlerMethod &&
//        		!(requestUrl.endsWith(".json") 
//        				|| requestUrl.endsWith(".jsonp") 
//        				)) {
//            HandlerMethod handlerMethod = (HandlerMethod) handler;
//
//            /**
//             * login check
//             */
//            IgnoreLoginCheck ignoreLoginCheck = handlerMethod.getMethodAnnotation(IgnoreLoginCheck.class);
//            if (ignoreLoginCheck != null) {
//                return super.preHandle(request, response, handler);
//            }
//
//            if (!userSessionAPI.isCertificated()) {
//                throw new SessionNotFoundException("Session not found. <" + request.getRequestURI() + ">");
//            }
//
//            /**
//             * GNB 영역
//             */
//            //if (requestUrl.endsWith(".wmp")) {
//            LOGGER.debug("*********** Request URL : " + requestUrl);
//            if (requestUrl.endsWith(".html")) {
//                this.generateMenuInfo(request);
//            }
//
//            /**
//             * Accessible check
//             */
//            IgnoreAccessibleCheck IgnoreAccessibleCheck = handlerMethod.getMethodAnnotation(IgnoreAccessibleCheck.class);
//            if (IgnoreAccessibleCheck == null) {
//
//                List<String> accessableUrlList = new ArrayList<>();
//                accessableUrlList = userSessionAPI.getAccessibleUrlList();
//
//                boolean isAccessibleURL = false;
//                for (String accessableUrl : accessableUrlList) {
//                    if (requestUrl.indexOf(contextPath + accessableUrl) == 0 ) {
//                        isAccessibleURL = true;
//                    }
//                }
//
//                if (!isAccessibleURL) {
//                    throw new AccessDeniedException("Access denied The requested URL cannot be provided. <" + requestUrl + ">");
//                }
//            }
//
//
//        }
//        return super.preHandle(request, response, handler);
//    }
//
//
//    /**
//     * @brief generateMenuInfo
//     * @details
//     * @param request
//     */
//    private void generateMenuInfo(HttpServletRequest request) throws Exception {
//        //URL
//        String uri = request.getRequestURI();
//        //Gnb 접근가능한 메뉴목록
//        List<MenuDto> menuList = userSessionAPI.getAccessibleMenuList();
//        LOGGER.debug("************************* Parameter gnb is: " + request.getParameter("gnb"));
//        //선택된 메뉴코드
//        String gnb = StringUtil.nvl(request.getParameter("gnb"), "0");
//        //선택된 메뉴Dto
//        MenuDto menuDto = menuService.getSelectedMenu(menuList, request);
//
//        request.setAttribute("userNm", userSessionAPI.getLoginUser().getUserNm());
//        request.setAttribute("menu", "");
//        request.setAttribute("gnb", gnb);
//        request.setAttribute("menuNm", "홈");
//        request.setAttribute("helpDocUrl", "");
//        request.setAttribute("helpDocYn", "n");
//        
//        LOGGER.debug("************************* LOGIN User name: " + userSessionAPI.getLoginUser().getUserNm());
//        
//        
//        if (menuDto != null) {
//            gnb = Integer.toString(menuDto.getMenuCd());
//            LOGGER.debug("************************* MenuDto gnb is: " + gnb);
//            LOGGER.debug("************************* MenuDto gnb is: " + menuDto.getMenuNm());
//            request.setAttribute("gnb", gnb);
//            request.setAttribute("menuNm", menuDto.getMenuNm());
//            request.setAttribute("helpDocUrl", menuDto.getHelpDocUrl());
//            request.setAttribute("helpDocYn", menuDto.getHelpDocYn());
//        }
//
//        //인사평가 분리
//        MenuDto tempMenuDto = new MenuDto();
//        tempMenuDto.setMenuCd(3);
//        tempMenuDto.setpMenuCd(1);
//
//        if (menuList != null && menuList.size() > 0) {
//            if (uri.endsWith(".per")) {
//                List<MenuDto> perMenulist = new ArrayList<MenuDto>();
//                perMenulist.add(tempMenuDto);
//                menuService.createChildMenuList(perMenulist, tempMenuDto, menuList);
//                request.setAttribute("menu", menuService.getMenuListToHTML(perMenulist, Integer.parseInt(gnb)));
//            } else {
//                //인사평가 메뉴 삭제
//                //menuService.removeMenu(menuList, tempMenuDto);
//                request.setAttribute("menu", menuService.getMenuListToHTML(menuList, Integer.parseInt(gnb)));
//            }
//        }
//    }
//
//}
