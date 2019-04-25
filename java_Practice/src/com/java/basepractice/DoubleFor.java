package com.java.basepractice;

public class DoubleFor {
	public static void main(String[] args) {
		// 行、列- 双循环

		// 外层循环控制行，内层循环控制列
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");

		char ch = 'A';
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" "); // 只能打印符号不能换行
			}
			// 打印完空格，再打印星号：
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(); // 外层循环控制换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" "); // 只能打印符号不能换行
			}
			// 打印完空格，再打印星号：
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(); // 外层循环控制换行
		}
		System.out.println("-----------------------------");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" "); // 只能打印符号不能换行
			}
			// 打印完空格，再打印星号：
			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(); // 外层循环控制换行
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" "); // 只能打印符号不能换行
			}
			// 打印完空格，再打印星号：
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if (j == 0 || j == 4 - 2 * i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(); // 外层循环控制换行
		}
	}
}
