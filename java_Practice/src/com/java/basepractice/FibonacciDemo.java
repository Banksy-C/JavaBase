package com.java.basepractice;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		// ���ɣ�ǰ����Ԫ�ع̶�����������ʼ����ǰ����Ԫ��֮��
		final int N = 10;
		int sum = 0;
		double avg;
		int[] nums = new int[N]; // ��ʼ������
		nums[0] = 0; // �����һ��
		nums[1] = 1; // ����ڶ���
		for (int i = 2; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
		}
		System.out.println("��ӡ���:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
			sum += nums[i];
		}
		System.out.println();
		System.out.println(sum / 1.0 / nums.length);
	}

}
