package com.java;
//测试类
public class AbstractTest {
	public static void main(String[] args) {
		//测试狗类
		//具体类用法
		//方式1：
		Dog d = new Dog();
		d.setName("旺财");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//方式2：
		Dog d2 = new Dog("旺财",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal a = new Dog();
		a.setName("旺财");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal a2 = new Dog("旺财",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//练习：测试猫类
		
		Cat c = new Cat("咪咪", 4);
		System.out.println(c.getName()+"---"+c.getAge());
		c.eat();
		
		Animal z = new Cat("mimi", 4);
		System.out.println(z.getName()+"----"+z.getAge());
		z.eat();
	}
}
