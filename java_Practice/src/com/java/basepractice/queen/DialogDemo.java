package com.java.basepractice.queen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogDemo {
	/** 对话框示例 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 参数1：对话框的父体对象
		// JOptionPane.showMessageDialog(null, "提示信息");
		// 参数2：对话框中的提示信息
		// 参数3：对话框的标题信息
		// 参数4：对话框的消息类型
		// JOptionPane.showMessageDialog(null, "今天吃了吗", "嘘寒问暖",
		// JOptionPane.QUESTION_MESSAGE);
		// 参数5：对话框中显示的图片对象
		// JOptionPane.showMessageDialog(null, "今天吃了吗", "嘘寒问暖",
		// JOptionPane.WARNING_MESSAGE,
		// new ImageIcon("images/u=275.jpg"));
		//

		// JOptionPane.showInputDialog(null, "吃了吗", "标题", 0, new
		// ImageIcon("images/u=275.jpg"), null, "默认值");

		//
		JOptionPane.showInputDialog(null, "吃了吗", "标题", 0, new ImageIcon("images/宝座.jpg"),
				new String[] { "1、吃了吗", "2、管你p事", "3、今天一起吃！" }, "默认值");

		// JOptionPane.showConfirmDialog(null, "到底去不去吃饭");
	}

}
