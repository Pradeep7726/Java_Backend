package com.infinite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstExample {
	@RequestMapping("/index")
	public String create() {
		System.out.println("craete was invoked");
		return "index";
	}
	@RequestMapping("/delete")
		public String delete()
		
		{
			System.out.println("delete was invoked");
			return "delete";
		}
		
}