package com.java.basepractice;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 要求用户动态录入5个学生的成绩，求平均成绩
		final int N = 5;// 常量
		double[] scores = new double[N]; // 声明数组
		double sum = 0, avg; // 总成绩和平均成绩
		for (int i = 0; i < scores.length; i++) {
			System.out.print("请输入第" + (i + 1) + "位同学的成绩:");
			// 将用户输入的double类型数字，赋值给数组中的第i个元素
			scores[i] = input.nextDouble();// 重点语句
		}
		// 计算总成绩
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // 经典代码
		}
		System.out.printf("%d位同学的平时成绩为:%.2f", scores.length, sum / scores.length);
	}
}
