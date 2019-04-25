package com.java.basepractice;

public class ShuffleCardsDemo {
	// ģ��ϴ�ƵĹ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ƵĻ�ɫ����
		String[] cardColors = { "����", "����", "����", "÷��" };
		// ��������
		String[] cardValues = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		final int N = 52;
		// 52����
		int[] cards = new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i; // ������ѭ������һ�£�0-51֮��
		}

		System.out.println("ϴ��ǰ��");
		for (int i = 0; i < cards.length; i++) {
			// System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			// 13��һ��
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}

		// ����ȡ��������ܻ�����ظ�
		// ϴ�ƣ��������һ��0-51֮�������newIndex,cards[i]��cards[newIndex]Ԫ�ػ���
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int) (Math.random() * N);// 0-51֮����������
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}

		System.out.println("ϴ�ƺ�");
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
