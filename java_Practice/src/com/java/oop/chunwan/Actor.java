package com.java.oop.chunwan;

public class Actor {

	private String name;
	
	public Actor(){}

	public Actor(String name){
		setName(name);
	}
	
	/**
	 * ��Ա�ı��ݷ���
	 */
	public void performs(){
		System.out.println("��Ա" + name + "���ڱ��ݾ��ʵĽ�Ŀ��");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
