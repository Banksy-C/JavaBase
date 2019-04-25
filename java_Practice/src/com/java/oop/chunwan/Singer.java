package com.java.oop.chunwan;
/**
 * 歌唱演员
 * @author Administrator
 *
 */
public class Singer extends Actor {

	public Singer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performs() {
		System.out.println("歌唱演员" + getName() + "正在表演歌唱节目《在这桃花盛开的地方》");
	}
}
