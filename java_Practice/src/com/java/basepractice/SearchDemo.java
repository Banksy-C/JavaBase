package com.java.basepractice;

import java.util.Scanner;

public class SearchDemo {
	public static void main(String[] args) {
		// �������һ�����飬����������ֵ����Сֵ
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1001;
		}
		System.out.println("����Ԫ��");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();

		// ���û�����Ҫ���ҵ�����
		// ѭ������ �������飬���Ҷ�Ӧ��Ԫ�أ�����ҵ��ˡ���ӡ�±꣬û�ҵ�����ӡ-1
		System.out.print("������Ҫ���ҵ�Ԫ�أ�");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;
		// ѭ������
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				// �ҵ��󣬼�¼��Ҫ����Ԫ�ص��±�
				searchIndex = i;
				break;
			}
		}
		// ��ѭ��������ж�
		if (searchIndex == -1) {
			System.out.println("���ź���û���ҵ����Ԫ�أ�");
		} else {
			System.out.println("Ҫ���ҵ�Ԫ���±�Ϊ��" + searchIndex);
		}
	}
}
