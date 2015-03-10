package org.bravestudy.minto.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/index")
	public String index(){
		return "admin/index";
	}
	
	@RequestMapping("/charts")
	public String charts(){
		return "admin/charts";
	}
	
	@RequestMapping("/tables")
	public String tables(){
		return "admin/tables";
	}
	
	@RequestMapping("/forms")
	public String forms(){
		return "admin/forms";
	}
	
	@RequestMapping("/bootstrap-elements")
	public String bootstrap_elements(){
		return "admin/bootstrap-elements";
	}
	
	@RequestMapping("/bootstrap-grid")
	public String bootstrap_grid(){
		return "admin/bootstrap_grid";
	}
	

	@RequestMapping("/blank-page")
	public String blank_page(){
		return "admin/blank_page";
	}
	
	
	@RequestMapping("/index-rtl")
	public String index_rtl(){
		return "admin/index-rtl";
	}
}
