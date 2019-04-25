package com.java.oop.book;

/**
 * ͼ��ʵ����
 * 
 * @author Administrator
 *
 */
public class Book {

	// MVC

	private String name;
	private String isbn;
	private double price;
	private int count; // ��ǰͼ�����Ŀ����
	private boolean brrow; // �Ƿ�ɽ�

	public Book() {
	}

	public Book(String name) {
		this.setName(name);
	}

	public Book(String name, String isbn, double price, int count) {
		setName(name);
		setIsbn(isbn);
		setPrice(price);
		setCount(count);
		setBrrow(brrow);
	}

	public boolean isBrrow() {
		return brrow;
	}

	public void setBrrow(boolean brrow) {
		this.brrow = brrow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		// ������д�ж��߼�
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count < 0) {
			count = 0;
		} else {
			this.count = count;
		}
	}

}
