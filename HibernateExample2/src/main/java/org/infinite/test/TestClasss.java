package org.infinite.test;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.db.Hibernate;
import org.infinite.pojo.Login;

public class TestClasss {
	public static void main(String[] args) {
		Date now=new Date();
		
		Login log = new Login();//transient
		
		log.setUsername("Pradeep");
		log.setPassword("india");
		log.setLogintimestamp(now);

		Transaction tx = null;
		//Get the session object.
		Session session = Hibernate.getSessionFactory().openSession();
		try{
			//Start hibernate session.
			tx = session.beginTransaction(); //transaction
			//Insert a new student record in the database.
			session.save(log); //persisent
			//Commit hibernate transaction if no exception occurs.
			tx.commit();
		}catch (HibernateException e) {
			if(tx!=null){
				//Roll back if any exception occurs. 
				tx.rollback();
			}
			e.printStackTrace(); 
		}finally {
			//Close hibernate session.
			session.close(); //removed
		}
	}
}