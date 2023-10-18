package com.infinite.controller;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.infinite.daoimpl.ProductImpl;
import com.infinite.pojo.Product;

@Controller
public class InsertController {
	private static final Logger logger = Logger.getLogger(InsertController.class);
	private ApplicationContext con;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("bean") Product p,Model m){
		con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ProductImpl obj=con.getBean("dao",ProductImpl.class);
		obj.saveData(p);
		String ProductName=p.getProductName();
		float Price=p.getPrice();
		int Quantity=p.getQuantity();
		int Total=p.getTotal();
		m.addAttribute("msg",ProductName); 
		logger.info("inserted");
		return "Inserted";	
	}
}