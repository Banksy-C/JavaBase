package com.java.oop.rpgdemo;
/**
 * սʿ�� - �̳��� Hero��
 * @author Administrator
 *
 */
public class Warrior extends Hero{
	/** սʿ���������ԣ��������� */
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
