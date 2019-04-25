package com.java.basepractice;

import java.util.Scanner;

/**
 * ʮ�����ƺ�ʮ����֮���ת��
 * 
 * @author Administrator
 *
 */
public class HaxToDecimalDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1�����û�����һ��10��������
		System.out.print("������һ���������֣�");
		int decNum = input.nextInt();
		// 2�����÷�����10����ת��Ϊ16����
		System.out.println(dexToHex(decNum));
		// 3���ٽ�16��������ת��10����
		System.out.println(hexToDec(dexToHex(decNum)));
	}

	/**
	 * �÷�����10����ת��Ϊ16����
	 * 
	 * @param decNum
	 *            Ҫת����10��������
	 * @return ת����16���Ƶ����֣����ַ����ķ�ʽ���أ�
	 */
	public static String dexToHex(int decNum) {
		// 45/26��ȡ����
		String hex = ""; // ת���õ�16�����ַ���
		while (decNum != 0) {
			int temp = decNum % 16;// ȡ����
			// �����п�����0-9֮������ֻ�10-15֮�������
			if (temp >= 0 && temp <= 9) {
				hex = temp + hex; // ÿȡһ������������ǰƴ��
			} else if (temp >= 10 && temp <= 15) {
				// ������ת��Ϊ�ַ�����ƴ��
				hex = (char) (temp - 10 + 'A') + hex;
			}
			// жĥɱ¿
			decNum /= 16;
		}

		return hex;
	}

	/**
	 * �÷�����16����ת��Ϊ10����
	 * 
	 * @param hex
	 *            Ҫת����16�����ַ���
	 * @return ת���ɹ���10������
	 */
	public static int hexToDec(String hex) {
		int decNum = 0;
		// 6E -> 6 * 16 + 14 * 1
		// ��Ҫ����16�����ַ���
		// ���ɣ������������Ԫ���±�Ϊi����ô���һ��Ԫ�ص��±�Ϊlen - i - 1
		for (int i = 0; i < hex.length(); i++) {
			// ȡ���ַ����е�ÿһ���ַ��������ж�
			char tempChar = hex.charAt(i);
			// ���������'0'-'9' 'A'-'F'
			if (tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);
			} else if (tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}

		return decNum;
	}

}
