package com.java.oop.userdemo;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ���´���ʵ���û�ע��
		System.out.println("���������룺");
		String password = input.next();
		System.out.println(StringUtil.validatePassword(password));
	}
}
