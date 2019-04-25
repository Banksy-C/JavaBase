package com.java.oop.instanceandinitializer;
/*
 * 实例变量初始化与实例代码块初始化
 */
public class InstanceVariableInitializer {

	private int i = 1;
	private int j = i + 1;
	
	//带参构造函数
	public InstanceVariableInitializer(int var){
		System.out.println(i);
		System.out.println(j);
		this.i = var;
		System.out.println(i);
		System.out.println(j);
	}
	
	{
		//实例代码块
		j += 3;
	}
	
	public static void main(String[] args) {
		new InstanceVariableInitializer(10);
	}

}
