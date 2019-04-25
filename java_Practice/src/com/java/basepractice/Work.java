package com.java.basepractice;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= 7 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i)
					System.out.print(1);
				else if (j == 1 || j == 2 * i - 1)
					System.out.print(2);
				else
					System.out.print(" ");
				// else if (j == 2 || j == 2 * i - 2)
				// System.out.print("4");
				// else if (j == 3 || j == 2 * i - 3)
				// System.out.print("8");
				// else if (j == 4 || j == 2 * i - 4)
				// System.out.print("16");
				// else if (j == 5 || j == 2 * i - 5)
				// System.out.print("32");
				// else if (j == 6 || j == 2 * i - 6)
				// System.out.print("64");
				// else if (j == 7 || j == 2 * i - 7)
				// System.out.print("128");
				// else if (j == 8 || j == 2 * i - 8)
				// System.out.print("256");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * 52));
			System.out.print(", ");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 10));
		}
	}

}
