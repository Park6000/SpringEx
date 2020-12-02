package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello", "Hello " + "add_1");
		mav.setViewName("/WEB-INF/views/index.jsp");
		return mav;
	}

	@RequestMapping("/del")
	public ModelAndView del() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello", "Hello " + "del_1");
		mav.setViewName("/WEB-INF/views/index.jsp");
		return mav;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(@RequestParam String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello", "Hello " + "select_1");
		mav.setViewName("/WEB-INF/views/index.jsp");
		return mav;
	}
}