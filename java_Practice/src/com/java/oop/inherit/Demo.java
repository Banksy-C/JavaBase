package com.java.oop.inherit;
/**
 * �̳�
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.move();
	}
}
class Animal{
	private String desc = "Animals are human's good friends";
	// ����Ҫ����һ�� getter ����
	public String getDesc() {
		return desc;
	}
	public void move(){
		System.out.println("Animals can move");
	}
}
class Dog extends Animal{
	@Override
	public void move(){
		super.move();
		// ���ø���ķ���
		System.out.println("Dogs can walk and run");
		// ͨ�� getter �������ø������ر���
		System.out.println("Please remember: " + super.getDesc());
	}	
}