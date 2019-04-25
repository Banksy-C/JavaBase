package com.java.basepractice;

public class ShuffleCardsDemo {
	// 模拟洗牌的过程
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 牌的花色数组
		String[] cardColors = { "黑桃", "红心", "方块", "梅花" };
		// 牌面数组
		String[] cardValues = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		final int N = 52;
		// 52张牌
		int[] cards = new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i; // 牌面与循环变量一致，0-51之间
		}

		System.out.println("洗牌前：");
		for (int i = 0; i < cards.length; i++) {
			// System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			// 13个一行
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}

		// 这种取随机数可能会出现重复
		// 洗牌：随机生成一个0-51之间的数字newIndex,cards[i]和cards[newIndex]元素互换
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int) (Math.random() * N);// 0-51之间的随机数字
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}

		System.out.println("洗牌后：");
		for (int i = 0; i < cards.length; i++) {
			// System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}

}
