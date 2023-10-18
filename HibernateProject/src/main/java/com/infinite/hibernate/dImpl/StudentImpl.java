package com.infinite.hibernate.dImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.infinite.hibernate.daohelper.DaoHelper;
import com.infinite.hibernate.dinterface.IStudent;
import com.infinite.hibernate.pojo.Student;

public class StudentImpl implements IStudent {
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	public void createRecord(String name,String rno,String course) {
		// TODO Auto-generated method stub
		try {

			sessionObj = DaoHelper.buildSessionFactory().openSession();
			sessionObj.beginTransaction();
			Student st = new Student();
			st.setStudentName(name);
			st.setRollNumber(rno);
			st.setCourse(course);
			sessionObj.save(st);
			sessionObj.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			sessionObj.close();
		}
	}

	public List<Student> displayRecords() {
		 List<Student> ls= new ArrayList<Student>();
		 try{
		 sessionObj=DaoHelper.buildSessionFactory().openSession();
		 sessionObj.beginTransaction();
		 ls=sessionObj.createQuery("from Student").list();
		 for(Student z:ls){
		 System.out.println(z.getId()+" "+z.getStudentName()+" "+z.getRollNumber()+" "+z.getCourse());
		 }
		 sessionObj.getTransaction().commit();



	}
		 catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 sessionObj.close();
		 }
		 return ls;
	 }

	 public void deleteAllRecords() {
		 try{
			 sessionObj=DaoHelper.buildSessionFactory().openSession();
			 sessionObj.beginTransaction();
			 Query qt=sessionObj.createQuery("delete from Student");
			 int rowcount= qt.executeUpdate();
			 System.out.println("row affecteds: "+ rowcount);
			// sessionObj.saveOrUpdate(qt);
			 sessionObj.getTransaction().commit();



		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }finally{
			 sessionObj.close();
		 }
	 }

	public List<Student> displayRecord() {
		// TODO Auto-generated method stub
		return null;
	}



	/*
	 * public List<Student> displayRecord() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * public void deleteAllRecord() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
