package com.java.oop.chunwan;
/**
 * ������--�൱����Ŀ�еĺ���ҵ����
 * ��Ҫ���ܣ�����Ա��λ����ʼ����
 * @author Administrator
 *
 */
public class Director {

	/**
	 * ���ݵ�"Action"����������Ա��λ��ʼ���ݽ�Ŀ
	 * @param actor
	 */
	public void action(Actor actor){
		actor.performs();
	}
}
