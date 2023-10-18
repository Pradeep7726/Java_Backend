package com.infinite.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.infinite.daohelper.DaoHelper;
import com.infinite.daointerface.IProduct;
import com.infinite.pojo.Product;

public class  ProductImpl implements IProduct {
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;
	private Configuration con;
	private Transaction t;

	// private Session sessionObj;
	public void saveData(Product e) {
		con = new Configuration().configure("hibernate.cfg.xml");
		sessionFactoryObj = con.buildSessionFactory();
		sessionObj = sessionFactoryObj.openSession();
		t = sessionObj.beginTransaction();
		sessionObj.save(e);
		t.commit();

	}
	public void createRecord( Product e) {
		// TODO Auto-generated method stub
		// Getting Session Object From SessionFactory

		try {
			sessionObj = DaoHelper.buildSessionFactory().openSession();
			// Getting Transaction Object From Session Object
			sessionObj.beginTransaction();
			Product p = null;
			Product pr = (Product) sessionObj.get(Product.class,p.getProductid());
			p.setProductName(p.getProductName());
			p.setPrice(p.getPrice());
			p.setQuantity(p.getQuantity());
			p.setTotal(p.getTotal());
			sessionObj.update(p);
			sessionObj.save(p);
			sessionObj.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				sessionObj.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}

	}
	@Override
	public void create(String Productname, float price, int qunatity, int total) {
		// TODO Auto-generated method stub
		
	}
	/*@Override
	public Product update(Product p) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(int Productid) {
		// TODO Auto-generated method stub
		
	}*/
	public void delete(int productid) {
		// TODO Auto-generated method stub
		
	}
}