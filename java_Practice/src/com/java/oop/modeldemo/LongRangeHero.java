package com.java.oop.modeldemo;
/**
 * Զ�̹���Ӣ��
 * @author Administrator
 *
 */
public abstract class LongRangeHero extends Hero{
	private int attackRange;	//��������
	
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
