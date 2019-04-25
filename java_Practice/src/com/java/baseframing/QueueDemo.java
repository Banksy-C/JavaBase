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
		
//		System.out.println("出队操作" + queue.poll());
		System.out.println("出队操作" + queue.peek());
		queue.forEach(str -> System.out.println(str));
		
	}
	
	public static void ArrayDequeDemo(){
		//ArrarDeque是一个基于数组实现的双端队列，默认底层数组的长度为16，不仅可以作为队列使用，也可以作为栈使用
		//所以当元素超过集合的容量时，系统会在底层重新分配一个Object数组来存储数据
		
		Queue<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.offer("Geroge Washington");
		arrayDeque.offer("John Adams");
		arrayDeque.offer("Thomas Jefferson");
		arrayDeque.offer("James Madison");
		arrayDeque.offer("James Monroe");
		System.out.println("出队操作" + arrayDeque.poll());
		arrayDeque.forEach(str -> System.out.println(str));
		
		//建议：尽量使用ArrayDeque当栈结构使用，避免使用Stack，因为Stack比较古老，性能较差
		//栈的特点：先进后出 push-入栈 pop-出栈
		
		
		
	}
}
