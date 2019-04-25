package com.java.basepractice;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password = null; // 密码
		String userName = "";
		// 1、循环结构
		int i = 0;
		while (i < 3) {
			System.out.print("请输入密码：");
			password = input.next();
			i++;
			// java中字符串判断if (password.equals("123456"))
			if (!"123456".equals(password)) {
				System.out.println("密码输入错误三次，请重新输入!(剩余" + (3 - i) + "次)");
				if (i == 3) {
					System.out.println("密码输入错误三次，强制退出系统!");
					System.exit(0);
				}
			} else {
				// 输入密码相等的情况
				// 想办法退出这个循环结构
				i = Integer.MAX_VALUE;// 让i的值为整型里的最大值
			}
		}
		System.out.println("密码正确，成功登陆本系统!");
		// 2、考虑循环次数
		// 3、输入并验证用户名和密码
	}
}
