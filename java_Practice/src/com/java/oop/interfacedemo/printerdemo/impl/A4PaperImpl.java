package com.java.oop.interfacedemo.printerdemo.impl;

import com.java.oop.interfacedemo.printerdemo.iface.IPaper;

public class A4PaperImpl implements IPaper {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "A4";
	}

}
