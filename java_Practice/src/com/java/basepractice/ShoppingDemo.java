package com.java.basepractice;

import java.util.Scanner;

public class ShoppingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double price; // ��Ʒ����
		double price1, price2, price3;
		int Count; // ��Ʒ����
		double total; // ������Ʒ���ܼ�
		float zhekou; // �ۿ�
		// 1�����û�����������Ʒ�ĵ��ۺ�����
		System.out.print("������·��˹�����к��ֱ�ĵ���:");
		price1 = price = input.nextDouble(); // �����û�����ĵ�������
		System.out.print("��������Ʒ��������");
		Count = input.nextInt(); // �����û����������
		total = price * Count; // �����ܼ�

		System.out.print("�����밮����ʱ������Ƥ���ĵ��ۣ�");
		price2 = price = input.nextDouble(); // �����û�����ĵ�������
		System.out.print("��������Ʒ������");
		Count = input.nextInt(); // �����û����������
		total += price * Count; // ����������Ʒ���ۼ��ܼ�

		System.out.print("���������ζ�����������ˮ�ĵ���:");
		price3 = price = input.nextDouble(); // �����û�����ĵ�������
		System.out.print("��������Ʒ������");
		Count = input.nextInt(); // �����û����������
		total += price * Count; // ����������Ʒ���ۼ��ܼ�

		// 2�������ܼ�
		// // 3�������ܼ��ж��Ƿ����
		// if (total >= 50000) {
		// // ������
		//// total *= 0.7;
		// zhekou = 0.7f;
		// } else {
		//// total *= 0.9;
		// zhekou = 0.9f;
		// }
		// 3.1��������������Ʒÿ����Ʒ���ܼ۴���5000
		// ��������Ʒ�ܼ۴���35000���ۿ���Ϊ60%
		// �����ۿ���Ϊ90%
		if (price1 > 5000 && price2 > 5000 && price3 > 5000 || price > 35000) {
			zhekou = 0.6f;
			System.out.println("�����ۣ���");
		} else {
			zhekou = 0.9f;
			System.out.println("����ۣ���");
		}

		total *= zhekou;
		// 4����ӡ���ۺ�Ӧ��֧���Ľ��
		System.out.printf("����Ӧ���Ľ��Ϊ��%.2f", total);

	}
}
