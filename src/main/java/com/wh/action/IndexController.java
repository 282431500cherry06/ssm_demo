package com.wh.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

	@RequestMapping("/index")
	public String list(HttpServletRequest request){
		
		return "index";
	}
}
