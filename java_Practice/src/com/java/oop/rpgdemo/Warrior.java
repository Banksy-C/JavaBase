package com.java.oop.rpgdemo;
/**
 * 战士类 - 继承了 Hero类
 * @author Administrator
 *
 */
public class Warrior extends Hero{
	/** 战士的特有属性：物理攻击力 */
	private int pysicalAttach;

	
	
	public Warrior() {}
	
	

	public Warrior(String nickName, int pysicalAttach) {
		setNickName(nickName);
		setPysicalAttach(pysicalAttach);
	}

	public int getPysicalAttach() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
}
