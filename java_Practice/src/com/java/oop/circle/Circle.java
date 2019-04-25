package com.java.oop.circle;

import java.util.Scanner;

/**
 * 使用面向对象的方式创建一个圆类，分别计算周长和面积 1、定义类：Circle 2、抽取属性 3、定义方法 4、调用方法并打印结果
 * 
 * @author Administrator
 *
 */
public class Circle {
	/** 圆的半径 */
	public double radius;
	/** 圆的周长 */
	public double perimeter;
	/** 圆的面积 */
	public double area;

	public void inputRaius() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		radius = input.nextDouble();
		input.close();
	}

	public void showPerimter() {
		if (radius <= 0) {
			inputRaius();// 如果用户没有输入半径，那么强制让用户输入半径
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("周长为：" + perimeter);
	}

	public void showArea() {
		if (radius <= 0) {
			inputRaius();
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("面积：" + area);
	}
}
