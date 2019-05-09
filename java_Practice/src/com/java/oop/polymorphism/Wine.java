package com.java.oop.polymorphism;

public class Wine {
	private String name;

	public Wine() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String drink() {
		return "喝的是" + getName();
	}

	/**
	 * 重写toString()
	 */
	@Override
	public String toString() {
		return null;
	}
}