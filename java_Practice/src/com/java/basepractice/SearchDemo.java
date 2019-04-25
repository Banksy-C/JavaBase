package com.java.basepractice;

import java.util.Scanner;

public class SearchDemo {
	public static void main(String[] args) {
		// 随机生成一个数组，求里面的最大值和最小值
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.println("数组元素");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();

		// 让用户输入要查找的数字
		// 循环查找 遍历数组，查找对应的元素，如果找到了。打印下标，没找到，打印-1
		System.out.print("请输入要查找的元素：");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;
		// 循环查找
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				// 找到后，记录下要查找元素的下标
				searchIndex = i;
				break;
			}
		}
		// 在循环后进行判断
		if (searchIndex == -1) {
			System.out.println("很遗憾，没有找到这个元素！");
		} else {
			System.out.println("要查找的元素下标为：" + searchIndex);
		}
	}
}
