package com.java.oop.circle;

import java.util.Scanner;

/**
 * ʹ���������ķ�ʽ����һ��Բ�࣬�ֱ�����ܳ������ 1�������ࣺCircle 2����ȡ���� 3�����巽�� 4�����÷�������ӡ���
 * 
 * @author Administrator
 *
 */
public class Circle {
	/** Բ�İ뾶 */
	public double radius;
	/** Բ���ܳ� */
	public double perimeter;
	/** Բ����� */
	public double area;

	public void inputRaius() {
		Scanner input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶");
		radius = input.nextDouble();
		input.close();
	}

	public void showPerimter() {
		if (radius <= 0) {
			inputRaius();// ����û�û������뾶����ôǿ�����û�����뾶
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("�ܳ�Ϊ��" + perimeter);
	}

	public void showArea() {
		if (radius <= 0) {
			inputRaius();
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("�����" + area);
	}
}
