package com.java.basepractice;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ҫ���û���̬¼��5��ѧ���ĳɼ�����ƽ���ɼ�
		final int N = 5;// ����
		double[] scores = new double[N]; // ��������
		double sum = 0, avg; // �ܳɼ���ƽ���ɼ�
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�������" + (i + 1) + "λͬѧ�ĳɼ�:");
			// ���û������double�������֣���ֵ�������еĵ�i��Ԫ��
			scores[i] = input.nextDouble();// �ص����
		}
		// �����ܳɼ�
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // �������
		}
		System.out.printf("%dλͬѧ��ƽʱ�ɼ�Ϊ:%.2f", scores.length, sum / scores.length);
	}
}
