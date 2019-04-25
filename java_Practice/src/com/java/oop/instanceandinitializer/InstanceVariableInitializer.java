package com.java.oop.instanceandinitializer;
/*
 * ʵ��������ʼ����ʵ��������ʼ��
 */
public class InstanceVariableInitializer {

	private int i = 1;
	private int j = i + 1;
	
	//���ι��캯��
	public InstanceVariableInitializer(int var){
		System.out.println(i);
		System.out.println(j);
		this.i = var;
		System.out.println(i);
		System.out.println(j);
	}
	
	{
		//ʵ�������
		j += 3;
	}
	
	public static void main(String[] args) {
		new InstanceVariableInitializer(10);
	}

}
