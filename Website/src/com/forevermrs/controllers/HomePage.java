package com.forevermrs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {
	
	HomePage(){
		
		super();
	}
	@RequestMapping
	public String goToHome(){
		
		return "index";
	}
}
