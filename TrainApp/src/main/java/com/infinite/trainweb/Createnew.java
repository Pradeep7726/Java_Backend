package com.infinite.trainweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Createnew {
	@RequestMapping("/create")
	public String create(){
		return "create";
	}
	@RequestMapping("/traindetails")

	public String display1()

	{
		return "traindetails";

	}
	@RequestMapping("/details")
	public String details(){
		return "show";
	}
	@RequestMapping("/out")
	public String out(){
		return "login";
	}
}
