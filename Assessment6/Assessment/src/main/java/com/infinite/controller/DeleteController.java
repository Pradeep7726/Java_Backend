package com.infinite.controller;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.daoimpl.ProductImpl;
import com.infinite.pojo.Product;

 

public class DeleteController {
	private static final Logger logger= Logger.getLogger(DeleteController.class); // loggers 
	private ApplicationContext con;   // declaring a variable
	@RequestMapping(value="/delete",method=RequestMethod.POST) // mapping the delete view page with the controller
	public String insert(@ModelAttribute("bean") Product p,Model m){
		con=new ClassPathXmlApplicationContext("ApplicationContext.xml");  
		ProductImpl obj=con.getBean("dao",ProductImpl.class);
		int Productid = 0;
		obj.delete(Productid);  //delete the records as per per request
		logger.info("Delete Controller");  //it will display delete controller
		return "delete";	//view page
	}
}