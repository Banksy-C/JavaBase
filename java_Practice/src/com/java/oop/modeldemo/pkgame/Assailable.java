package com.java.oop.modeldemo.pkgame;
/**
 * 可攻击接口- 只要实现了本接口，就相当于具备了可实施攻击对象的基本特征
 * @author Administrator
 *
 */
public interface Assailable {

	String getName();
	int getX();
	void setX(int x);
	int getY();
	void getY(int Y);
	int getHp();
	void setHp(int hp);
	/**
	 * 根据距离判断，是否能够成功攻击另一个具备攻击能力的对象
	 * @param assa
	 * @return
	 */
	boolean canFightByDistance(Assailable assa);
	
	/**
	 * 攻击另一个具备攻击能力的对象
	 * @param assa
	 */
	void fight(Assailable assa);
	
}
