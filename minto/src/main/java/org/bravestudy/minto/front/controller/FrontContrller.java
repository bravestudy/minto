package org.bravestudy.minto.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front")
public class FrontContrller {
	
	@RequestMapping("/index")
	public String index(){
	
		return "/front/index";
	}
	
}
