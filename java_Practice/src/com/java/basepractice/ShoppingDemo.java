package com.java.basepractice;

import java.util.Scanner;

public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double price; // 商品单价
		double price1, price2, price3;
		int Count; // 商品数量
		double total; // 购买商品的总价
		float zhekou; // 折扣
		// 1、让用户输入三种商品的单价和数量
		System.out.print("请输入路易斯威登中号手表的单价:");
		price1 = price = input.nextDouble(); // 接收用户输入的单价数字
		System.out.print("请输入商品的数量：");
		Count = input.nextInt(); // 接收用户输入的数量
		total = price * Count; // 计算总价

		System.out.print("请输入爱马仕时尚休闲皮带的单价：");
		price2 = price = input.nextDouble(); // 接收用户输入的单价数字
		System.out.print("请输入商品数量：");
		Count = input.nextInt(); // 接收用户输入的数量
		total += price * Count; // 计算两种商品的累加总价

		System.out.print("请输入香奈儿东方屏风香水的单价:");
		price3 = price = input.nextDouble(); // 接收用户输入的单价数字
		System.out.print("请输入商品数量：");
		Count = input.nextInt(); // 接收用户输入的数量
		total += price * Count; // 计算三种商品的累加总价

		// 2、计算总价
		// // 3、根据总价判断是否打折
		// if (total >= 50000) {
		// // 打七折
		//// total *= 0.7;
		// zhekou = 0.7f;
		// } else {
		//// total *= 0.9;
		// zhekou = 0.9f;
		// }
		// 3.1如果购买的三种商品每种商品的总价大于5000
		// 或三种商品总价大于35000，折扣率为60%
		// 否则折扣率为90%
		if (price1 > 5000 && price2 > 5000 && price3 > 5000 || price > 35000) {
			zhekou = 0.6f;
			System.out.println("打六折！！");
		} else {
			zhekou = 0.9f;
			System.out.println("打九折！！");
		}

		total *= zhekou;
		// 4、打印打折后应该支付的金额
		System.out.printf("最终应付的金额为：%.2f", total);

	}
}
