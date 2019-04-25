package com.java.oop.chunwan;

public class CrossActorV1 extends Actor {

	public CrossActorV1() {
		super();
	}

	public CrossActorV1(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println(getName() + ":ÏàÉù½²¾¿ÍÏÐ¬¾Í³ª¡£¡£¡£¡£¡£");
	}
	
}
