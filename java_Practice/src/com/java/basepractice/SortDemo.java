package com.java.basepractice;

import java.util.Arrays;

//冒泡排序
public class SortDemo {
	public static void main(String[] args) {
		// 1、一共会比较数组元素个数-1轮
		// 2、每一轮，比较的次数比上一轮少1
		// 3、如果前面一个数组大于/小于后面一个数字，那么交换

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
		System.out.println("冒泡排序共耗时：" + (endTime - startTime) + "毫秒");

		// 选择排序
		startTime = System.currentTimeMillis();
		for (int i = 0; i < nums2.length; i++) {
			int min = nums2[i]; // 假设第i个值是最小值
			int minIndex = i; // 最小值的下标
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
		System.out.println("选择排序共耗时：" + (endTime - startTime) + "毫秒");

		// java.util.Arrays.sort()；Java内置排序
		startTime = System.currentTimeMillis();
		Arrays.sort(nums3);
		endTime = System.currentTimeMillis();
		System.out.println("Arrays.sort()排序共耗时：" + (endTime - startTime) + "毫秒");
		// 逆序：首尾交换
		for (int i = 0; i < nums3.length / 2; i++) {
			int temp = nums3[i];
			nums3[i] = nums3[nums3.length - i - 1];
			nums3[nums3.length - i - 1] = temp;
		}

		//
		// System.out.println("排序后：");
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
