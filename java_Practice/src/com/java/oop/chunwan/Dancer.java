package com.java.oop.chunwan;

/**
 * �赸��Ա
 * @author Administrator
 *
 */
public class Dancer extends Actor {

	public Dancer() {
		super();
	}

	public Dancer(String name) {
		super(name);
	}

	@Override
	public void performs() {
		System.out.println("�赸��Ա" + getName() + "վ��չ��������ȶ��˵��赸��");
	}
	
}
