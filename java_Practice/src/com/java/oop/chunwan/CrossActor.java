package com.java.oop.chunwan;

public class CrossActor extends Actor{

	public CrossActor() {
		super();
	}

	public CrossActor(String name) {
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println(getName() + "现在相声相声不景气啦，我只能说：我想死你们了！！");
	}
}
