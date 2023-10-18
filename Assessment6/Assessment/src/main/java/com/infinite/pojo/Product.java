package com.infinite.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	@Column(name = "ProductName")
	private String ProductName;
	@Column(name = "Price")
	private float Price;
	@Column(name = "Quantity")
	private int Quantity;
	@Column(name = "Total")
	private int Total;

	public Product() {
		// super();
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	/*
	 * public Product(int productid, String productname, float price, int
	 * quantity, int total) { super(); this.productid = productid; ProductName =
	 * productname; this.price = price; this.quantity = quantity; this.total =
	 * total; }
	 */

}
