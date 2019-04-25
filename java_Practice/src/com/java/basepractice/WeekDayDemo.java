package com.java.basepractice;

import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		System.out.printf("今天是星期几(1-7):");
		int dayOfWeek = new Scanner(System.in).nextInt();

		// 中文
		ShowWeekDayByChinese(dayOfWeek - 1);
		// 日文
		ShowWeekDayByJpanese(dayOfWeek - 1);
		// 英文
		ShowWeekDayByEnglish(dayOfWeek - 1);

	}

	/**
	 * 用来判断传入参数是否在1-7之间
	 * 
	 * @param dayWeek
	 *            要判断的整型数字：星期几
	 * @return 如果合法，返回True,非法，返回false
	 */
	private static boolean isRight(int dayOfWeek) {
		if (dayOfWeek < 0 || dayOfWeek > 6) {

			return false;
		}
		return true;
	}

	/**
	 * 以中文的方式，打印星期几
	 * 
	 * @param dayOfweek
	 *            1-7之间的整型数字，用来表示星期几
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek) {
		if (!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数字");
			return;
		}

		String[] weekdays = { "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };

		System.out.println(weekdays[dayOfWeek]);
	}

	/**
	 * 以日文的方式，打印星期几
	 * 
	 * @param dayOfWeek
	 */
	public static void ShowWeekDayByJpanese(int dayOfWeek) {
		if (!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = { "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日" };
		System.out.println(weekdays[dayOfWeek]);
	}

	/**
	 * 以英文的方式，打印星期几
	 * 
	 * @param dayOfWeek
	 */
	public static void ShowWeekDayByEnglish(int dayOfWeek) {
		if (!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = { "Monday", "Tuesday", "wednesday", "Thurday", "friday", "Saturday", "sunday" };
		System.out.println(weekdays[dayOfWeek]);
	}

}
