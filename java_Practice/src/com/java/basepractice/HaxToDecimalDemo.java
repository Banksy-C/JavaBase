package com.java.basepractice;

import java.util.Scanner;

/**
 * 十六进制和十进制之间的转换
 * 
 * @author Administrator
 *
 */
public class HaxToDecimalDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1、让用户输入一个10进制数字
		System.out.print("请输入一个整型数字：");
		int decNum = input.nextInt();
		// 2、调用方法将10进制转换为16进制
		System.out.println(dexToHex(decNum));
		// 3、再将16进制数字转回10进制
		System.out.println(hexToDec(dexToHex(decNum)));
	}

	/**
	 * 用方法将10进制转换为16进制
	 * 
	 * @param decNum
	 *            要转换的10进制数字
	 * @return 转换成16进制的数字（以字符串的方式返回）
	 */
	public static String dexToHex(int decNum) {
		// 45/26反取余数
		String hex = ""; // 转换好的16进制字符串
		while (decNum != 0) {
			int temp = decNum % 16;// 取余数
			// 余数有可能是0-9之间的数字或10-15之间的数字
			if (temp >= 0 && temp <= 9) {
				hex = temp + hex; // 每取一个余数，就往前拼接
			} else if (temp >= 10 && temp <= 15) {
				// 把数字转换为字符串再拼接
				hex = (char) (temp - 10 + 'A') + hex;
			}
			// 卸磨杀驴
			decNum /= 16;
		}

		return hex;
	}

	/**
	 * 用方法将16进制转换为10进制
	 * 
	 * @param hex
	 *            要转换的16进制字符串
	 * @return 转换成功的10进制数
	 */
	public static int hexToDec(String hex) {
		int decNum = 0;
		// 6E -> 6 * 16 + 14 * 1
		// 需要遍历16进制字符串
		// 规律：如果数组中首元素下标为i，那么最后一个元素的下标为len - i - 1
		for (int i = 0; i < hex.length(); i++) {
			// 取出字符串中的每一个字符串进行判断
			char tempChar = hex.charAt(i);
			// 两种情况：'0'-'9' 'A'-'F'
			if (tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
			} else if (tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}

		return decNum;
	}

}
