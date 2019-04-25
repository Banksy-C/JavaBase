package com.java.oop.circle;

public class CircleV3 {
	/** 圆的半径 */
	private double radius;
	/** 圆的周长 */
	private double perimeter;
	/** 圆的面积 */
	private double area;

	// 构造
	public CircleV3() {
	}

	public CircleV3(double radius) {
		// this.radius = radius;
		this.setRadius(radius);
	}

	// 读
	public double getRadius() {
		return radius;
	}

	// 写
	public void setRadius(double radius) {
		if (radius <= 0) {// 封装的好处：可以对传入的属性进行简单的验证
			radius = 1;
		}
		// this->自指针
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
		System.out.println("周长为：" + this.getPerimeter());
		System.out.println("面积为：" + this.getArea());
	}

}
