package com.java.oop.book;

public class BookText {

	public static void main(String[] args) {
		// Book book = new Book("醉酒谈Java", "123-321", 98.9, 5);
		// // 实例化图书业务对象
		// BookBiz bookBiz = new BookBiz();
		// bookBiz.sellBook(book);
		//
		// System.out.println(book.getCount());

		int[] nums = { 1, 2 };
		Swap(nums);
		System.out.println(nums[0] + "\t" + nums[1]);

	}

	public static void Swap(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}
}
