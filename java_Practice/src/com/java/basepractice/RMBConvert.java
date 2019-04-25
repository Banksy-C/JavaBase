package com.java.basepractice;

import java.util.Scanner;

public class RMBConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入钱数：");
		double money = input.nextDouble();

		// 处理圆部分
		int yuan = (int) money;
		int numOfShiYuan = yuan / 10; // 10元纸币的数量
		int numOfWuYuan = yuan % 10 / 5;// 5元纸币的数量
		int numOfYiYuan = yuan % 10 - 5;// 1元纸币的数量——大于5和小于5出现不同情况
		// 处理角部分
		int jiao = ((int) (money * 10)) % 10;
		int numOfWuJiao = jiao / 5; // 5角纸币的数量
		int numOfYiJiao = jiao - 5; // 1角纸币的数量

		System.out.println("10元纸币的数量：" + numOfShiYuan + "张");
		System.out.println("5元纸币的数量：" + numOfWuYuan + "张");
		System.out.println("1元纸币的数量：" + numOfYiYuan + "张");
		System.out.println("5角纸币的数量：" + numOfWuJiao + "张");
		System.out.println("1角纸币的数量" + numOfYiJiao + "张");
	}

}
