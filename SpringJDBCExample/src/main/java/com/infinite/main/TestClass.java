package com.infinite.main;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.infinite.dao.EmployeeDaoImpl;
import com.infinite.pojo.Employee;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
		EmployeeDaoImpl daoImpl = (EmployeeDaoImpl) context.getBean("empDaoImpl");

		//daoImpl.deleteEmployee(10);
		
		// daoImpl.createTable();
		Employee employee = new Employee();
		employee.setFirstname("Pradeep");
		employee.setLastname("Lakki");
		employee.setSalary(2300);
		
		Employee employee2 = new Employee("hima", "lucky", 34000);
		System.out.println(daoImpl.countEmployees());
		System.out.println(daoImpl.findEmployeeName(8));
		/*daoImpl.insertEmployee(employee);
		daoImpl.insertEmployee(employee2);
		//daoImpl.createTable();
		Iterator <Employee> it=daoImpl.getAllEmployees().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getFirstname());
			System.out.println(it.next().getSalary());

		}*/
	}

}
