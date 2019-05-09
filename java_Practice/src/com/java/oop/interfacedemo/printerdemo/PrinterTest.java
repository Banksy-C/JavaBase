package com.java.oop.interfacedemo.printerdemo;

import com.java.oop.interfacedemo.printerdemo.impl.A4PaperImpl;
import com.java.oop.interfacedemo.printerdemo.impl.ColorInkBoxImpl;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//Ϊ��ӡ����װֽ�� ��ī��
		printer.setiInkbox(new ColorInkBoxImpl());
		printer.setiPaper(new A4PaperImpl());
		printer.print("��������");
	}
}
