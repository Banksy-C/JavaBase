package com.java.basepractice;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password = null; // ����
		String userName = "";
		// 1��ѭ���ṹ
		int i = 0;
		while (i < 3) {
			System.out.print("���������룺");
			password = input.next();
			i++;
			// java���ַ����ж�if (password.equals("123456"))
			if (!"123456".equals(password)) {
				System.out.println("��������������Σ�����������!(ʣ��" + (3 - i) + "��)");
				if (i == 3) {
					System.out.println("��������������Σ�ǿ���˳�ϵͳ!");
					System.exit(0);
				}
			} else {
				// ����������ȵ����
				// ��취�˳����ѭ���ṹ
				i = Integer.MAX_VALUE;// ��i��ֵΪ����������ֵ
			}
		}
		System.out.println("������ȷ���ɹ���½��ϵͳ!");
		// 2������ѭ������
		// 3�����벢��֤�û���������
	}
}
