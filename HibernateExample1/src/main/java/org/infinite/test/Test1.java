package org.infinite.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.infinite.pojo.Employee;

public class Test1 {
	public static void main(String args[])
	{
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory=meta.getSessionFactoryBuilder().build();

	Session session1=factory.openSession();  
	Employee emp1=(Employee)session1.load(Employee.class,1);  
	System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());  
	session1.close();  

	Session session2=factory.openSession();  
	Employee emp2=(Employee)session2.load(Employee.class,2);  
	System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());  
	session2.close();
	
	/*Session session3=factory.openSession();  
	Employee emp3=(Employee)session3.load(Employee.class,3);  
	System.out.println(emp3.getId()+" "+emp3.getName()+" "+emp3.getSalary());  
	session3.close();*/
	}
}