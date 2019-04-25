package com.java.oop.interfacedemo.printerdemo;

import com.java.oop.interfacedemo.printerdemo.iface.IInkbox;
import com.java.oop.interfacedemo.printerdemo.iface.IPaper;

/**
 * ��ӡ����
 * 
 * @author Administrator
 *
 */
public class Printer {
	private IInkbox iInkbox = null;// ��ӡ���е�ī��
	private IPaper iPaper = null; // ��ӡ���е�ֽ��

	/**
	 * ��ӡ������ - ʹ��ī�к�ֽ��
	 * @param content	���ݸ���ӡ�����ַ�������
	 */
	public void print(String content){
		if(null == iInkbox || null == iPaper){
			System.out.println("ī�к�ֽ�ų��ִ����밲װ��ȷ�����ԣ�");
			return ;
		}
		//��ӡ����
		String color = iInkbox.getColor();
		String type = iPaper.getSize();
		System.out.println("����������" + color + "��ɫ");
		System.out.println("ʹ�õ�ֽ�ţ�" + type);
		System.out.println("��ӡ���ݣ�" + content);
	}
	
	public IInkbox getiInkbox() {
		return iInkbox;
	}

	public void setiInkbox(IInkbox iInkbox) {
		this.iInkbox = iInkbox;
	}

	public IPaper getiPaper() {
		return iPaper;
	}

	public void setiPaper(IPaper iPaper) {
		this.iPaper = iPaper;
	}

}
