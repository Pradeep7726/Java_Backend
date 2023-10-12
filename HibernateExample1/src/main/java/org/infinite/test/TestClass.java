package org.infinite.test;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Student;
public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get the session object.
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		tx = session.beginTransaction();
		Student student = null;
		/*for (int i = 0; i <= 50; i++) {



			student = new Student();
			student.setFirstName("Yes" + i);
			student.setLastName("S" + i);
			student.setClassName("Btecch");
			student.setRollNo("Bt/07/" + 7456 + i);
			student.setAge(28);
			session.save(student);
			// Commit hibernate transaction if no exception occurs.
		}*/
		//tx.commit();
		try{
		     //List <Student> ls=(List)session.createCriteria(Student.class).add(Restrictions.gt("studentId",14)).add(Restrictions.lt("studentId",24)).list();
			 List <Student> ls=session.createCriteria(Student.class).setFirstResult(1).setMaxResults(20).list();
		     
			//System.out.println(ls);
		     for (Student z:ls)
		     {
		    	 System.out.println("firstname = "+z.getFirstName()+" ");
		    	 
		    	 System.out.println("lastname = "+z.getLastName()+" ");
		    	 System.out.println("Rollno = "+z.getRollNo()+" ");
		    	 System.out.println();
		     }
			//Start hibernate session.
			
			//Insert a new student record in the database.
			//session.save(student);
			//Commit hibernate transaction if no exception occurs.
			//tx.commit();
		}
		catch (HibernateException e) {
			if(tx!=null){
				//Roll back if any exception occurs. 
				tx.rollback();
			}
			e.printStackTrace(); 
		}finally {
			//Close hibernate session.
			session.close(); 
		}
	}
}