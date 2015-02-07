package org.bravestudy.minto.warmup.jaden.controller;

import org.bravestudy.minto.warmup.common.model.SampleUserForm;
import org.bravestudy.minto.warmup.common.model.SampleUserView;
import org.bravestudy.minto.warmup.jaden.service.WarmupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 	Jaden.Lee
 * @file 			WarmupController.java
 * @since		February 04, 2015.
 * @version	1.0.0
 */
@Controller("jadenWarmupController")
public class WarmupController {
	
	@Autowired
	@Qualifier("jadenWarmupServiceImpl")
	private WarmupService service;
	
	@RequestMapping(value="/warmup/jaden/sampleuser", method=RequestMethod.GET)
	public ModelAndView getForm(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("warmup/jaden/sample_user_insert");
		return mav;
	}
	
	@RequestMapping(value="/warmup/jaden/sampleuser", method=RequestMethod.POST)
	public ModelAndView postForm(@ModelAttribute SampleUserForm form){
		SampleUserView viewModel = service.insertSampleUser(form);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("warmup/jaden/sample_user_result");
		mav.addObject("viewModel", viewModel);
		return mav;
	}

}
