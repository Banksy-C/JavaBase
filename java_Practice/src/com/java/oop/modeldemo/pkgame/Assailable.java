package com.java.oop.modeldemo.pkgame;
/**
 * �ɹ����ӿ�- ֻҪʵ���˱��ӿڣ����൱�ھ߱��˿�ʵʩ��������Ļ�������
 * @author Administrator
 *
 */
public interface Assailable {

	String getName();
	int getX();
	void setX(int x);
	int getY();
	void getY(int Y);
	int getHp();
	void setHp(int hp);
	/**
	 * ���ݾ����жϣ��Ƿ��ܹ��ɹ�������һ���߱����������Ķ���
	 * @param assa
	 * @return
	 */
	boolean canFightByDistance(Assailable assa);
	
	/**
	 * ������һ���߱����������Ķ���
	 * @param assa
	 */
	void fight(Assailable assa);
	
}
