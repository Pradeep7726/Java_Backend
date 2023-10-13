package com.infinite.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropertiesController {
	@Value("${company.name}")//key
	private String cname;//var

 

	@RequestMapping("create")
	public String create(Model mod) {   //model predefined mod obj
		mod.addAttribute("comp",cname);
		System.out.println("create was invoked");
		return "create";
	}

}
