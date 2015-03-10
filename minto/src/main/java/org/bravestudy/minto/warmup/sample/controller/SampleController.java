package org.bravestudy.minto.warmup.sample.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.bravestudy.minto.warmup.common.model.SampleUserForm;
import org.bravestudy.minto.warmup.common.model.SampleUserView;
import org.bravestudy.minto.warmup.common.vo.SampleUserVo;
import org.bravestudy.minto.warmup.jaden.service.WarmupService;
import org.bravestudy.minto.warmup.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	//step1-1 화면 맵핑
	
	@RequestMapping(value = "/step1_1", method = RequestMethod.GET)
	public String step1_1(Model model) {
		//view(jsp) page 이름
		return "sample/home";
	}

	//step1-2 데이터 값 출력 방법
	
	//@RequestMapping '/test' 라는 주소값을 찾았을때 해당 메소드가 실행됨 (단 GET방식 호출 시 에만 )
	@RequestMapping(value = "/step1_2", method = RequestMethod.GET)
	public String step1_2(HttpServletRequest request,Model model) {//spring 내에서 해당 타입(Model)에 맵핑되는 객체를 DI(new)해서 바로 사용할 수 있게 해줌
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("serverTime", "화면에 출력될 입력 값 입력" );
		//리턴 되는 값에 맵핑되는 뷰(JSP) 를 찾아줌
		return "sample/home";
	}

	
	//step1-3 DB연결 방법
	@Autowired
	private SqlSession sql;
	
	@RequestMapping(value = "/step1_3", method = RequestMethod.GET)
	public String step1_3(Model model) {//spring 내에서 해당 타입(Model)에 맵핑되는 객체를 DI(new)해서 바로 사용할 수 있게 해줌
		//DB 쿼리 실행
		List<?> arlList = sql.selectList("sample.selectAll");
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("serverTime", arlList.toString());
		//리턴 되는 값에 맵핑되는 뷰(JSP) 를 찾아줌
		return "sample/home";
	}
	
	
	//step1-4 화면단 뿌리는 방법 (for 문사용 법)
	
	@RequestMapping(value = "/step1_4", method = RequestMethod.GET)
	public String step1_4(Model model) {//spring 내에서 해당 타입(Model)에 맵핑되는 객체를 DI(new)해서 바로 사용할 수 있게 해줌
		//DB 쿼리 실행
		List<Map> arlList = sql.selectList("sample.selectAll");
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("sampleFor", arlList);
		
		//리턴 되는 값에 맵핑되는 뷰(JSP) 를 찾아줌
		return "sample/step1_4_for";
	}
	
	//step1-5 화면단 뿌리는 방법 - mapping class 사용법 (for 문사용 법)
	@RequestMapping(value = "/step1_5", method = RequestMethod.GET)
	public String step1_5(Model model) {//spring 내에서 해당 타입(Model)에 맵핑되는 객체를 DI(new)해서 바로 사용할 수 있게 해줌
		
		//TODO : DB 쿼리 실행 - 변경 부분
		List<SampleUserVo> arlList = sql.selectList("sample.selectAll");
		
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("sampleFor", arlList);
		
		//리턴 되는 값에 맵핑되는 뷰(JSP) 를 찾아줌
		return "sample/step1_4_for";
	}
	
	
	
	@Autowired
	SampleService sampleService;
	
	//step1-6 MVC 패턴 적용
	@RequestMapping(value = "/step1_6", method = RequestMethod.GET)
	public String step1_6(Model model) {//spring 내에서 해당 타입(Model)에 맵핑되는 객체를 DI(new)해서 바로 사용할 수 있게 해줌
		
		//TODO : service , repository로 이동
		List<SampleUserVo> arlList = sampleService.getAllUser(); //sql.selectList("sample.selectAll");
		
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("sampleFor", arlList);
		
		//리턴 되는 값에 맵핑되는 뷰(JSP) 를 찾아줌
		return "sample/step1_6_mvc";
	}
	
	
	@Autowired
	@Qualifier("jadenWarmupServiceImpl")
	private WarmupService service;
	
	
	@RequestMapping(value="/step1_7", method=RequestMethod.GET)
	public ModelAndView getForm(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sample/step1_7");
		return mav;
	}
	
	@RequestMapping(value="/step1_7", method=RequestMethod.POST)
	public ModelAndView postForm(@ModelAttribute SampleUserForm form){
		SampleUserView viewModel = service.insertSampleUser(form);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("warmup/jaden/sample_user_result");
		mav.addObject("viewModel", viewModel);
		return mav;
	}
	
	
	@RequestMapping(value="/step1_8", method=RequestMethod.GET)
	public String sample(@ModelAttribute SampleUserForm form){

		return "sample/Sample";
	}
	
	
	@RequestMapping(value="/cdy", method=RequestMethod.GET)
	public String cdy(@ModelAttribute SampleUserForm form){

		return "sample/cdy";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String admin(SampleUserForm form){

		return "admin/index";
	}
	
}
