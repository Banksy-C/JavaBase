package com.java.basepractice;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		// 规律：前两个元素固定，第三个开始，是前两个元素之和
		final int N = 10;
		int sum = 0;
		double avg;
		int[] nums = new int[N]; // 初始化数组
		nums[0] = 0; // 数组第一个
		nums[1] = 1; // 数组第二个
		for (int i = 2; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
		}
		System.out.println("打印结果:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
			sum += nums[i];
		}
		System.out.println();
		System.out.println(sum / 1.0 / nums.length);
	}

}
