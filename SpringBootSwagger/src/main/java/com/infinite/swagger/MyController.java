package com.infinite.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {
	@RequestMapping(method=RequestMethod.GET,value="api/hello")//we can access this method through url only
	public String hello()
	{
		return "Welcome To Infinite";
	}
	@RequestMapping(value="api/hello1")//we can access this method through url only
	public String hello1()
	{
		return "Welcome To Khammam";
	}
}