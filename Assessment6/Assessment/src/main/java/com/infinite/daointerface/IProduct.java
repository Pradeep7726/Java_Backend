package com.infinite.daointerface;
import com.infinite.pojo.Product;

public interface IProduct {
	public void create(String Productname, float price, int qunatity, int total);
	//public Product update(Product p);
	//public void delete(int Productid);
}