package com.java.oop.capsulation;

/**
 * ����è��
 * 
 * @author zhangziwei
 *
 */
public class Cat {

	// �޸����ԵĿɼ���--private�޶�ֻ���ڵ�ǰ�����
	private String name;
	int month;
	double weight;
	String species;

	public Cat() {
		System.out.println("�޲������췽����");
	}

	// ����get/set����
	// ��get��set��������Ӷ����Ե�����
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "����һֻ����" + this.name + "��è��";
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
