package com.java.oop.capsulation;
/**
 * 封装
 * @author Administrator
 *
 */
public class CatTest {
	      public static void main(String[] args){
	    	  //对象实例化
	    	  //Cat one=new Cat("花花",2,1000,"英国短毛猫");
	    	  Cat one=new Cat();
	    	  one.setName("花花");
	    	  one.setMonth(3);
	    	  one.setWeight(1000);
	    	  one.setSpecies("英国短毛猫");
	    	  
	    	  
	          System.out.println("昵称："+one.getName()); 
	          if(one.getMonth()==0)//如果没赋值，或者赋值因为小于0错误，初始值还是0
	    		  return;//结束，不在执行下面的语句
	    	  System.out.println("年龄："+one.getMonth()); 
	    	  System.out.println("体重："+one.getWeight());   	  		
	    	  System.out.println("昵称："+one.getSpecies());    
	    }
	}
