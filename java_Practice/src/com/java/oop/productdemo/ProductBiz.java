package com.java.oop.productdemo;

import javax.swing.JOptionPane;

/**
 * 商品管理类
 * 
 * @author Administrator
 *
 */
public class ProductBiz {
	public static void main(String[] args) {
		/** 用来保存每种商品的总量 */
		int[] counts = new int[2];
		double total = 0; // 最终要支付的总金额
		for (int i = 0; i < counts.length; i++) {
			Product product = new Product();
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			product.setName(name);
			// 接收用户输入商品单价，要注意，返回值是字符串类型！！
			String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
			// 需要将字符串类型转换为double类型，在进行赋值
			product.setPrice(Double.parseDouble(strPrice));
			
			String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
			counts[i] = Integer.parseInt(strCount);

			// 累加总金额
			total += product.getPrice() * counts[i];

		}
		System.out.println();
		
		System.out.println("商品总金额为：" + total);
	}
}
