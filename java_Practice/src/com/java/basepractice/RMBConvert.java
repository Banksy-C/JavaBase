package com.java.basepractice;

import java.util.Scanner;

public class RMBConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("������Ǯ����");
		double money = input.nextDouble();

		// ����Բ����
		int yuan = (int) money;
		int numOfShiYuan = yuan / 10; // 10Ԫֽ�ҵ�����
		int numOfWuYuan = yuan % 10 / 5;// 5Ԫֽ�ҵ�����
		int numOfYiYuan = yuan % 10 - 5;// 1Ԫֽ�ҵ�������������5��С��5���ֲ�ͬ���
		// ����ǲ���
		int jiao = ((int) (money * 10)) % 10;
		int numOfWuJiao = jiao / 5; // 5��ֽ�ҵ�����
		int numOfYiJiao = jiao - 5; // 1��ֽ�ҵ�����

		System.out.println("10Ԫֽ�ҵ�������" + numOfShiYuan + "��");
		System.out.println("5Ԫֽ�ҵ�������" + numOfWuYuan + "��");
		System.out.println("1Ԫֽ�ҵ�������" + numOfYiYuan + "��");
		System.out.println("5��ֽ�ҵ�������" + numOfWuJiao + "��");
		System.out.println("1��ֽ�ҵ�����" + numOfYiJiao + "��");
	}

}
