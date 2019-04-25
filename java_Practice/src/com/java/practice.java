package com.java;

public class practice {
	public static int static_number = 1;
	public int normal_number = 1;
	
	public static void test(){
		static_number++;
//		normal_number++;
	}
	
	public static void main(String[] args) {
		practice staticDemo1 = new practice();
		staticDemo1.test();
		
		System.out.println(staticDemo1.static_number);
		System.out.println(staticDemo1.normal_number);
		
		practice staticDemo2 = new practice();
		staticDemo2.test();
		
		System.out.println(practice.static_number);
		System.out.println(staticDemo2.normal_number);
		
		staticDemo1.test();
		
		System.out.println(practice.static_number);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		String 刘强东老婆 = "龚小京"; // 龚小京这个字符串就被存放在了字符串池中
//		刘强东老婆 = "奶茶妹妹"; // 奶茶妹妹 也是在字符串池中的！
//		// new String("奶茶妹妹@小强东")
//		刘强东老婆 = 刘强东老婆.concat("@小强东"); // 注意：刘强东的老婆已经不是原来在常量池中的奶茶妹妹了！
//		// 思考：奶茶妹妹@小强东 是否在常量池中？？？？
//		System.out.println(刘强东老婆);
//
//		String 刘强东前妻 = "龚小京";
//	}

}
