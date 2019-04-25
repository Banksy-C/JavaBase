package com.java.basepractice;

import java.util.Arrays;

//ð������
public class SortDemo {
	public static void main(String[] args) {
		// 1��һ����Ƚ�����Ԫ�ظ���-1��
		// 2��ÿһ�֣��ȽϵĴ�������һ����1
		// 3�����ǰ��һ���������/С�ں���һ�����֣���ô����

		final int N = 10000;
		int[] nums1 = new int[N];
		int[] nums2 = new int[N];
		int[] nums3 = new int[N];
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 100000);
			nums2[i] = nums1[i];
			nums3[i] = nums1[i];
		}

		long startTime = System.currentTimeMillis();
		// int[] nums1 = { 45, 32, 56, 90, 21 };
		for (int i = 0; i < nums1.length - 1; i++) {
			for (int j = 0; j < nums1.length - i - 1; j++) {
				if (nums1[j] > nums1[j + 1]) {
					int temp = nums1[j];
					nums1[j] = nums1[j + 1];
					nums1[j + 1] = temp;

				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ð�����򹲺�ʱ��" + (endTime - startTime) + "����");

		// ѡ������
		startTime = System.currentTimeMillis();
		for (int i = 0; i < nums2.length; i++) {
			int min = nums2[i]; // �����i��ֵ����Сֵ
			int minIndex = i; // ��Сֵ���±�
			for (int j = i + 1; j < nums2.length; j++) {
				if (min > nums2[j]) {
					min = nums2[j];
					minIndex = j;
				}
			}
			int temp = nums2[i];
			nums2[i] = nums2[minIndex];
			nums2[minIndex] = temp;
		}
		endTime = System.currentTimeMillis();
		System.out.println("ѡ�����򹲺�ʱ��" + (endTime - startTime) + "����");

		// java.util.Arrays.sort()��Java��������
		startTime = System.currentTimeMillis();
		Arrays.sort(nums3);
		endTime = System.currentTimeMillis();
		System.out.println("Arrays.sort()���򹲺�ʱ��" + (endTime - startTime) + "����");
		// ������β����
		for (int i = 0; i < nums3.length / 2; i++) {
			int temp = nums3[i];
			nums3[i] = nums3[nums3.length - i - 1];
			nums3[nums3.length - i - 1] = temp;
		}

		//
		// System.out.println("�����");
		// for (int i = 0; i < nums3.length; i++) {
		// System.out.print(nums3[i]);
		// if ((i + 1) % 15 == 0) {
		// System.out.println();
		// } else {
		// System.out.print(", ");
		// }
		// }
		// System.out.println();
	}
}
