package com.java.basepractice.queen;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogDemo {
	/** �Ի���ʾ�� */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����1���Ի���ĸ������
		// JOptionPane.showMessageDialog(null, "��ʾ��Ϣ");
		// ����2���Ի����е���ʾ��Ϣ
		// ����3���Ի���ı�����Ϣ
		// ����4���Ի������Ϣ����
		// JOptionPane.showMessageDialog(null, "���������", "�꺮��ů",
		// JOptionPane.QUESTION_MESSAGE);
		// ����5���Ի�������ʾ��ͼƬ����
		// JOptionPane.showMessageDialog(null, "���������", "�꺮��ů",
		// JOptionPane.WARNING_MESSAGE,
		// new ImageIcon("images/u=275.jpg"));
		//

		// JOptionPane.showInputDialog(null, "������", "����", 0, new
		// ImageIcon("images/u=275.jpg"), null, "Ĭ��ֵ");

		//
		JOptionPane.showInputDialog(null, "������", "����", 0, new ImageIcon("images/����.jpg"),
				new String[] { "1��������", "2������p��", "3������һ��ԣ�" }, "Ĭ��ֵ");

		// JOptionPane.showConfirmDialog(null, "����ȥ��ȥ�Է�");
	}

}
