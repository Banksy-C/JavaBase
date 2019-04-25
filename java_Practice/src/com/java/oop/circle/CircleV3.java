package com.java.oop.circle;

public class CircleV3 {
	/** Բ�İ뾶 */
	private double radius;
	/** Բ���ܳ� */
	private double perimeter;
	/** Բ����� */
	private double area;

	// ����
	public CircleV3() {
	}

	public CircleV3(double radius) {
		// this.radius = radius;
		this.setRadius(radius);
	}

	// ��
	public double getRadius() {
		return radius;
	}

	// д
	public void setRadius(double radius) {
		if (radius <= 0) {// ��װ�ĺô������ԶԴ�������Խ��м򵥵���֤
			radius = 1;
		}
		// this->��ָ��
		this.radius = radius;
	}

	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public void show() {
		System.out.println("�ܳ�Ϊ��" + this.getPerimeter());
		System.out.println("���Ϊ��" + this.getArea());
	}

}
