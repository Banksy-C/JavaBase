package com.java.oop.capsulation;
/**
 * ��װ
 * @author Administrator
 *
 */
public class CatTest {
	      public static void main(String[] args){
	    	  //����ʵ����
	    	  //Cat one=new Cat("����",2,1000,"Ӣ����ëè");
	    	  Cat one=new Cat();
	    	  one.setName("����");
	    	  one.setMonth(3);
	    	  one.setWeight(1000);
	    	  one.setSpecies("Ӣ����ëè");
	    	  
	    	  
	          System.out.println("�ǳƣ�"+one.getName()); 
	          if(one.getMonth()==0)//���û��ֵ�����߸�ֵ��ΪС��0���󣬳�ʼֵ����0
	    		  return;//����������ִ����������
	    	  System.out.println("���䣺"+one.getMonth()); 
	    	  System.out.println("���أ�"+one.getWeight());   	  		
	    	  System.out.println("�ǳƣ�"+one.getSpecies());    
	    }
	}
