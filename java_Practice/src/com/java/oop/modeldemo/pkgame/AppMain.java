package com.java.oop.modeldemo.pkgame;
/**
 * ����ģ����Ϸ����ҵ���߼���Ĵ���
 * @author Administrator
 *
 */
public class AppMain {

	public static void main(String[] args) {
		Hero hero1 = new Warrior(1, "�ܲ�", 0, 0);
		Castle castle = new Castle("��ɯ�ű�", 10, 10, 750);
		
		hero1.pk(castle);
	}

}
