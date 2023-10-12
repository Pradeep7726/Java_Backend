package org.infinite.test;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtil;
import org.infinite.pojo.Student;

public class HQLTest {
	public static void main(String args[])
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		//Student student = null;
		tx = session.beginTransaction();
		try{
			/*Query q=session.createQuery("update Student set last_Name=:last_Name where Student_Id=6");
			q.setString("last_Name", "Lakki");
			q.executeUpdate();
			tx.commit();*/
			/*String hql="from Student"
					Query q=session.createQuery()*/
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