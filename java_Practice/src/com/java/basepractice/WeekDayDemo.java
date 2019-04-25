package com.java.basepractice;

import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		System.out.printf("���������ڼ�(1-7):");
		int dayOfWeek = new Scanner(System.in).nextInt();

		// ����
		ShowWeekDayByChinese(dayOfWeek - 1);
		// ����
		ShowWeekDayByJpanese(dayOfWeek - 1);
		// Ӣ��
		ShowWeekDayByEnglish(dayOfWeek - 1);

	}

	/**
	 * �����жϴ�������Ƿ���1-7֮��
	 * 
	 * @param dayWeek
	 *            Ҫ�жϵ��������֣����ڼ�
	 * @return ����Ϸ�������True,�Ƿ�������false
	 */
	private static boolean isRight(int dayOfWeek) {
		if (dayOfWeek < 0 || dayOfWeek > 6) {

			return false;
		}
		return true;
	}

	/**
	 * �����ĵķ�ʽ����ӡ���ڼ�
	 * 
	 * @param dayOfweek
	 *            1-7֮����������֣�������ʾ���ڼ�
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek) {
		if (!isRight(dayOfWeek)) {
			System.out.println("��������1-7֮�������");
			return;
		}

		String[] weekdays = { "����һ", "���ڶ�", "������", "������", "������", "������", "������" };

		System.out.println(weekdays[dayOfWeek]);
	}

	/**
	 * �����ĵķ�ʽ����ӡ���ڼ�
	 * 
	 * @param dayOfWeek
	 */
	public static void ShowWeekDayByJpanese(int dayOfWeek) {
		if (!isRight(dayOfWeek)) {
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = { "������", "������", "ˮ����", "ľ����", "������", "������", "������" };
		System.out.println(weekdays[dayOfWeek]);
	}

	/**
	 * ��Ӣ�ĵķ�ʽ����ӡ���ڼ�
	 * 
	 * @param dayOfWeek
	 */
	public static void ShowWeekDayByEnglish(int dayOfWeek) {
		if (!isRight(dayOfWeek)) {
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = { "Monday", "Tuesday", "wednesday", "Thurday", "friday", "Saturday", "sunday" };
		System.out.println(weekdays[dayOfWeek]);
	}

}
