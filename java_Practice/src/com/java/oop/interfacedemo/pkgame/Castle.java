package com.java.oop.interfacedemo.pkgame;

public class Castle implements Assailable {

	private String name;
	private int x;
	private int y;
	private int maxHp;
	private int hp;
	private int attackRange;
	
	public Castle(String name, int x, int y, int attackRange){
		setName(name);
		setX(x);
		setY(y);
		setAttackRange(attackRange);
		setMaxHp(100);
		setHp(100);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	@Override
	public void getY(int Y) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canFightByDistance(Assailable assa) {
		//1����������һ���ɹ�������֮��ľ���
		//2�������������Ϸ����ͽ��й���
		
		return false;
	}

	@Override
	public void fight(Assailable assa) {
		//����Ǳ��Ĺ������̶�
		int attack = 15;
		assa.setHp(assa.getHp() - attack);

	}



}
