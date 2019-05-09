package com.java;
//定义具体的猫类
public class Cat extends Animal{
	public Cat() {}
	
	public Cat(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
