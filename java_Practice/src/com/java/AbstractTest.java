package com.java;
//������
public class AbstractTest {
	public static void main(String[] args) {
		//���Թ���
		//�������÷�
		//��ʽ1��
		Dog d = new Dog();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//��ʽ2��
		Dog d2 = new Dog("����",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal a = new Dog();
		a.setName("����");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal a2 = new Dog("����",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//��ϰ������è��
		
		Cat c = new Cat("����", 4);
		System.out.println(c.getName()+"---"+c.getAge());
		c.eat();
		
		Animal z = new Cat("mimi", 4);
		System.out.println(z.getName()+"----"+z.getAge());
		z.eat();
	}
}
