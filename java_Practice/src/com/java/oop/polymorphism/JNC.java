package com.java.oop.polymorphism;

public class JNC extends Wine {
	public JNC() {
		setName("JNC");
	}

	/**
	 * ��д���෽����ʵ�ֶ�̬
	 */
	@Override
	public String drink() {
		return "�ȵ��� " + getName();
	}

	/**
	 * ��дtoString()
	 */
	@Override
	public String toString() {
		return "Wine : " + getName();
	}
}
