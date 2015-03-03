package org.bravestudy.minto.warmup.cdy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CDYBoardController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/board/cdy212")
	public String boardList(){
		
		return "/warmup/cdy/sample_user_inert";
	}
}
