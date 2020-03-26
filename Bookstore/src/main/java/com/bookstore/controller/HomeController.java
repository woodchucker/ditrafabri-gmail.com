package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
    
    public String home(){
        return "Hello World!";
    }
	/*
	@RequestMapping("/error")
	public String error()
	{		
	return "error";
	}
	*/
	/*
	public String index() {
		return "index";
	}
	*/
}
