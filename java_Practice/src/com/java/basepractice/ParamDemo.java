package com.java.basepractice;

/**
 * ���ݲ���
 * 
 * @author Administrator
 *
 */
public class ParamDemo {
	public static void main(String[] args) {
		paraTest("��������", 1, 2, 3, 4);
	}

	public static void paraTest(String str, int... nums) {
		System.out.println("��һ������: " + str);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
