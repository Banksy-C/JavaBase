package com.java.basepractice;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		// 二分查找：前提-数组已经有序
		// 基本原理
		// 首先将要查找的元素(key)与数组的中间元素比较
		// 1、如果key小于中间元素，只需要在数组的前一半元素中继续查找
		// 2、如果key和中间元素相等，匹配成功，查找结束
		// 3、如果key大于中间元素，只需要在数组的后一半元素中继续查找key

		Scanner input = new Scanner(System.in);
		int[] array = { 2, 5, 8, 10, 15, 35, 45, 55, 65, 75, 95 };
		System.out.print("请输入要查找的数字：");
		int searchNum = input.nextInt();
		int insertIndex = -1; // 要插入元素的下标
		int deleteIndex = -1; // 要删除元素的下标
		int count = array.length; // 当前元素的总个数
		boolean isFind = false; // 是否找到
		int low = 0; // 下届下标
		int hight = array.length - 1; // 上界下标
		// 不知道要查找多少次
		while (hight >= low) {
			// 计算中点下标
			int mid = (hight + low) / 2;
			// 如果key小于中间元素，只需要在数组的前一半元素中继续查找
			if (searchNum < array[mid]) {
				hight = mid - 1;
			} else if (searchNum > array[mid]) {
				// 如果key大于中间元素，只需要在数组的后一半元素中查找
				low = mid + 1;
			} else {
				// 如果key和中间元素相等，匹配成功，查找结束
				System.out.println("找到了数字！下标为：" + mid);
				isFind = true;
				deleteIndex = mid;
				break;
			}
		}

		if (!isFind || deleteIndex == -1) {
			System.out.println("没有找到您输入的数字！");
			System.exit(0);
		}

		// 删除元素
		// 1、找到要删除的元素的下标deleteIndex =
		// 2、从要删除下标开始，后面一个元素赋值给前面一个元素-覆盖
		// nums[i] = nums[i + 1]
		// 3、数组总长度-1
		count--;
		for (int i = deleteIndex; i < count; i++) {
			array[i] = array[i + 1];
		}
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}
		// 插入
		// 1、找到要插入元素的下标（找到第一个大于要插入元素的下标）
		// 2、从最后一个元素开始nums[i + 1] = nums[i]
		// 直到insertIndex结束
		// 在insertIndex处赋值
		// 4、总个数+1

	}

}
