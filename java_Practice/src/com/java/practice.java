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
//		String ��ǿ������ = "��С��"; // ��С������ַ����ͱ���������ַ�������
//		��ǿ������ = "�̲�����"; // �̲����� Ҳ�����ַ������еģ�
//		// new String("�̲�����@Сǿ��")
//		��ǿ������ = ��ǿ������.concat("@Сǿ��"); // ע�⣺��ǿ���������Ѿ�����ԭ���ڳ������е��̲������ˣ�
//		// ˼�����̲�����@Сǿ�� �Ƿ��ڳ������У�������
//		System.out.println(��ǿ������);
//
//		String ��ǿ��ǰ�� = "��С��";
//	}

}
