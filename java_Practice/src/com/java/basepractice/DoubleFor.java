package com.java.basepractice;

public class DoubleFor {
	public static void main(String[] args) {
		// �С���- ˫ѭ��

		// ���ѭ�������У��ڲ�ѭ��������
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
				System.out.print(" "); // ֻ�ܴ�ӡ���Ų��ܻ���
			}
			// ��ӡ��ո��ٴ�ӡ�Ǻţ�
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(); // ���ѭ�����ƻ���
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" "); // ֻ�ܴ�ӡ���Ų��ܻ���
			}
			// ��ӡ��ո��ٴ�ӡ�Ǻţ�
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(); // ���ѭ�����ƻ���
		}
		System.out.println("-----------------------------");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" "); // ֻ�ܴ�ӡ���Ų��ܻ���
			}
			// ��ӡ��ո��ٴ�ӡ�Ǻţ�
			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(); // ���ѭ�����ƻ���
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" "); // ֻ�ܴ�ӡ���Ų��ܻ���
			}
			// ��ӡ��ո��ٴ�ӡ�Ǻţ�
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if (j == 0 || j == 4 - 2 * i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(); // ���ѭ�����ƻ���
		}
	}
}
