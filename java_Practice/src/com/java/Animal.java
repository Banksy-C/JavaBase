package com.java;


	/*
	è������
		�������è����
		���ԣ����������䣬�Է�
	�������Ӿ��嵽����
		è:
			��Ա����������������
			���췽�����޲Σ�����
			��Ա�������Է�(è����)
			
		��:
			��Ա����������������
			���췽�����޲Σ�����
			��Ա�������Է�(������)
			
		��Ϊ�й��Ե����ݣ����Ծ���ȡ��һ�����ࡣ���
		���������ڳԷ������ݲ�һ�������ԳԷ��ķ����ǳ���ģ�
		�������ǳ�����࣬��ͱ��붨��Ϊ�����ࡣ
		
		�������ࣺ
			��Ա����������������
			���췽�����޲Σ�����
			��Ա�������Է�();
	
	ʵ�֣��ӳ��󵽾���
		������:
			��Ա����������������
			���췽�����޲Σ�����
			��Ա�������Է�();
			
		���ࣺ
			�̳��Զ�����
			��д�Է�();
			
		è�ࣺ
			�̳��Զ�����
			��д�Է�();
*/
//�������Ķ�����
public abstract class Animal {
	//����
	private String name;
	//����
	private int age;
	
	public Animal() {}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//����һ�����󷽷�
	public abstract void eat();
}
 



