package com.java.oop.circle;

import java.util.Scanner;

public class CircleText {

	public static void main(String[] args) {
		// Circle circle = new Circle();
		// circle.inputRaius();
		// circle.showPerimter();
		// circle.showArea();

		// CircleV2 circle = new CircleV2();
		// circle.showArea();
		// circle.showPerimter();

		Scanner input = new Scanner(System.in);
		System.out.print("«Î ‰»Î‘≤µƒ∞Îæ∂:");
		double radius = input.nextDouble();
		CircleV3 circle = new CircleV3(radius);
		circle.show();
	}

}
