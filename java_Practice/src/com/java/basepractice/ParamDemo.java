package com.java.basepractice;

/**
 * 传递参数
 * 
 * @author Administrator
 *
 */
public class ParamDemo {
	public static void main(String[] args) {
		paraTest("参数测试", 1, 2, 3, 4);
	}

	public static void paraTest(String str, int... nums) {
		System.out.println("第一个参数: " + str);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
