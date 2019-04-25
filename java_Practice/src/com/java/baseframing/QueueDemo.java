package com.java.baseframing;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
//		LinkedListDemo();
		ArrayDequeDemo();
	}
	
	public static void LinkedListDemo(){
		Queue<String> queue = new LinkedList<>();
		//queue.remove();
//		System.out.println(queue.poll());
		queue.offer("Geroge Washington");
		queue.offer("John Adams");
		queue.offer("Thomas Jefferson");
		queue.offer("James Madison");
		queue.offer("James Monroe");
		
//		System.out.println("���Ӳ���" + queue.poll());
		System.out.println("���Ӳ���" + queue.peek());
		queue.forEach(str -> System.out.println(str));
		
	}
	
	public static void ArrayDequeDemo(){
		//ArrarDeque��һ����������ʵ�ֵ�˫�˶��У�Ĭ�ϵײ�����ĳ���Ϊ16������������Ϊ����ʹ�ã�Ҳ������Ϊջʹ��
		//���Ե�Ԫ�س������ϵ�����ʱ��ϵͳ���ڵײ����·���һ��Object�������洢����
		
		Queue<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.offer("Geroge Washington");
		arrayDeque.offer("John Adams");
		arrayDeque.offer("Thomas Jefferson");
		arrayDeque.offer("James Madison");
		arrayDeque.offer("James Monroe");
		System.out.println("���Ӳ���" + arrayDeque.poll());
		arrayDeque.forEach(str -> System.out.println(str));
		
		//���飺����ʹ��ArrayDeque��ջ�ṹʹ�ã�����ʹ��Stack����ΪStack�ȽϹ��ϣ����ܽϲ�
		//ջ���ص㣺�Ƚ���� push-��ջ pop-��ջ
		
		
		
	}
}
