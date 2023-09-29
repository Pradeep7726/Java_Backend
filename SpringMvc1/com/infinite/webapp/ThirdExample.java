package com.infinite.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ThirdExample
	{
		@RequestMapping("/infinite")
		public String display() {
			return "index";
		}
	}
