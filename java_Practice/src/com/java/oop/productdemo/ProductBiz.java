package com.java.oop.productdemo;

import javax.swing.JOptionPane;

/**
 * ��Ʒ������
 * 
 * @author Administrator
 *
 */
public class ProductBiz {
	public static void main(String[] args) {
		/** ��������ÿ����Ʒ������ */
		int[] counts = new int[2];
		double total = 0; // ����Ҫ֧�����ܽ��
		for (int i = 0; i < counts.length; i++) {
			Product product = new Product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			product.setName(name);
			// �����û�������Ʒ���ۣ�Ҫע�⣬����ֵ���ַ������ͣ���
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ��ۣ�");
			// ��Ҫ���ַ�������ת��Ϊdouble���ͣ��ڽ��и�ֵ
			product.setPrice(Double.parseDouble(strPrice));
			
			String strCount = JOptionPane.showInputDialog("�����빺���������");
			counts[i] = Integer.parseInt(strCount);

			// �ۼ��ܽ��
			total += product.getPrice() * counts[i];

		}
		System.out.println();
		
		System.out.println("��Ʒ�ܽ��Ϊ��" + total);
	}
}
