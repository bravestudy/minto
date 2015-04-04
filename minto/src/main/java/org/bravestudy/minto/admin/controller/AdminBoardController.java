package org.bravestudy.minto.admin.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminBoardController {

	@RequestMapping("/board/index")
	public String index(){
		return "admin/board/index";
	}
	//step1-3 DB연결 방법
	@Autowired
	private SqlSession sql;
	
	@RequestMapping("/board/registBoard")
	public String registBoard(@RequestParam Map<String, String> params,HttpServletRequest request){
		System.out.println(params.get("content"));
		System.out.println(request.getAttribute("content"));
		//DB
		int result= sql.insert("sample.insertTop1",params);	
		
		return "admin/board/index";
	}
	
	
}
