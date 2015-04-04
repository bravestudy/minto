package org.bravestudy.minto.front.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front")
public class FrontContrller {
	
	//step1-3 DB연결 방법
	@Autowired
	private SqlSession sql;
	
	@RequestMapping("/index")
	public String index(Model model){
//		List<Map> arlTop2 = new ArrayList<Map>();
//		
//		Map mp1 = new HashMap();
//		mp1.put("content", "모집어 넣을 까요?");
//		mp1.put("title", "모집어 넣을 까요?");
//		
//		arlTop2.add(mp1);
//		
//		
//		Map mp2 = new HashMap();
//		mp2.put("content", "모집어 넣을 까요?2222");
//		mp2.put("title", "모집어 넣을 까요?");
//		
//		arlTop2.add(mp2);
//		
//		
//		Map mp3 = new HashMap();
//		mp3.put("content", "모집어 넣을 까요?333333");
//		mp3.put("title", "모집어 넣을 까요?");
//		
//		arlTop2.add(mp3);
//		
//		Map mp4 = new HashMap();
//		mp4.put("content", "모집어 넣을 까요?444444");
//		mp4.put("title", "모집어 넣을 까요?");
//		
//		arlTop2.add(mp4);
//		

		List<Map> arlTop1 = sql.selectList("sample.selectTop1");
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("arlTop1", arlTop1);

		
		List<Map> arlTop2 = sql.selectList("sample.selectTop2");
		//model에 데이터를 넣어서 화면에 출력 함 
		model.addAttribute("arlTop2", arlTop2);
		
		
		return "/front/index";
	}
	
}
