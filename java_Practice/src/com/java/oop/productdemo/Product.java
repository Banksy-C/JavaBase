package com.java.oop.productdemo;

/**
 * 商品实体类
 * 
 * @author Administrator
 *
 */
public class Product {
	private String name;
	private double price;
	/** 商品的描述 */
	private String decription;
	/** 商品的服务 */
	private String[] services;

	public Product() {
	}

	public Product(String name, String decription) {
		setName(name);
		setDecription(decription);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

}
