package com.java.oop.interfacedemo.pkgame;

/**
 * 实现了可攻击接口的英雄类 - 跟之前类似，也是抽象类
 * 
 * @author Administrator
 *
 */
public abstract class Hero implements Assailable {

	private long id;
	private String name;
	private int level;
	private int maxHp;
	private int hp;
	private int attack;
	private int x;
	private int y;

	public Hero() {
		setMaxHp(100);
		setHp(100);
	}

	public Hero(long id, String name) {
		this();
		setId(id);
		setName(name);
	}

	protected double getDistance(int x1, int y1, int x2, int y2){
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	/**
	 * 英雄之间的pk 
	 * 1、判断两者的距离 
	 * 2、如果距离满足，就进行攻击
	 * @param assa
	 */
	public void pk(Assailable assa) {
		if (canFightByDistance(assa) && hp > 0 && assa.getHp() > 0) {
			fight(assa);
		}
		//3、在控制台打印对战后的结果（控制台程序专用）
				System.out.println("两位英雄的当前状态：");
				System.out.println("昵称\tHP\tX坐标\tY坐标");
				System.out.println(name + "\t" + hp + "\t" + x + "\t" + y);
				System.out.printf("%s\t%d\t%d\t%d", 
					assa.getName(), assa.getHp(), assa.getX(), assa.getY()
				);
	};

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
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

}
