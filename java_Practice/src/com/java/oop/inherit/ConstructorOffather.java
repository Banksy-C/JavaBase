package com.java.oop.inherit;

public class ConstructorOffather {
	    public static void main(String[] args) {
	        Dogs obj = new Dogs("����", 3);
	        obj.say();
	    }
	}
	class Animals{
	    String name;
	    public Animals(String name){
	        this.name = name;
	    }
	}
	class Dogs extends Animals{
	    int age;
	    public Dogs(String name, int age){
	        super(name);
	        this.age = age;
	    }

	    public void say(){
	        System.out.println("����һֻ�ɰ���С�����ҵ����ֽ�" + name + "����" + age + "����");
	    }
	}
