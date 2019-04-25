package com.java.oop.modeldemo;
/**
 * Ô¶³Ì¹¥»÷Ó¢ÐÛ
 * @author Administrator
 *
 */
public abstract class LongRangeHero extends Hero{
	private int attackRange;	//¹¥»÷¾àÀë
	
	public LongRangeHero(){
		super();
	}
	public LongRangeHero(long id, int attackRange, String name, int x, int y){
		super(id, name);
		setAttack(attackRange);;
		setX(x);
		setY(y);
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
}
