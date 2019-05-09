package com.java.oop.capsulation;

/**
 * 宠物猫类
 * 
 * @author zhangziwei
 *
 */
public class Cat {

	// 修改属性的可见性--private限定只能在当前类访问
	private String name;
	int month;
	double weight;
	String species;

	public Cat() {
		System.out.println("无参数构造方法！");
	}

	// 创建get/set方法
	// 在get和set方法中添加对属性的限制
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "我是一只名叫" + this.name + "的猫咪";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}
