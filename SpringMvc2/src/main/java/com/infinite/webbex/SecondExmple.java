package com.infinite.webbex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondExmple {
	
		@RequestMapping("/infinite")
		public String display() {
			return "index";
		}
}
