package com.dailyx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav= new ModelAndView("Home");
		
		mav.addObject("welcomeMessage","Hi ! This is the dailyX Page");
		mav.addObject("Lakshya","Lakshya.mp4");
		return mav;
	}
	
	
	
	

}
