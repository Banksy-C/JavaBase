package com.java.oop.polymorphism;

public class JGJ extends Wine {

	public JGJ() {
		setName("JGJ");
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
