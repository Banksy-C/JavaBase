package com.java.oop.interfacedemo.printerdemo;

import com.java.oop.interfacedemo.printerdemo.iface.IInkbox;
import com.java.oop.interfacedemo.printerdemo.iface.IPaper;

/**
 * 打印机类
 * 
 * @author Administrator
 *
 */
public class Printer {
	private IInkbox iInkbox = null;// 打印机中的墨盒
	private IPaper iPaper = null; // 打印机中的纸张

	/**
	 * 打印机方法 - 使用墨盒和纸张
	 * @param content	传递给打印机的字符串内容
	 */
	public void print(String content){
		if(null == iInkbox || null == iPaper){
			System.out.println("墨盒和纸张出现错误，请安装正确后重试！");
			return ;
		}
		//打印过程
		String color = iInkbox.getColor();
		String type = iPaper.getSize();
		System.out.println("以下文字是" + color + "颜色");
		System.out.println("使用的纸张：" + type);
		System.out.println("打印内容：" + content);
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
