package org.infinite.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Product")
public class Product {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")
	private int pid;
	@Column(name="productname")
	private String pname;
	@Column(name="productprice")
	private int price;
	
	private int getPid()
	{
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}
