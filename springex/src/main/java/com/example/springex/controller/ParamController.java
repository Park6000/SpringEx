package com.example.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamController {
	@RequestMapping("/id")
	public ModelAndView hello(@RequestParam("id") int id, @RequestParam("password") String password) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("hello", "Hello " + id + "/" + password);
		mav.setViewName("/WEB-INF/views/index.jsp");
		return mav;
	}
}