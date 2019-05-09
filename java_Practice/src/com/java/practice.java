package com.java;

public class practice {
//	 public practice()
//	 {
//	 }
//	 public static void main(String[] argc)
//	 {
//		practice w = new practice();
//	  System.out.println(w.Multi(2,3));
//	  System.out.println(w.Multi(2,3,4));
//	  System.out.println(w.Multi(2.0f,3.0f));
//	 }
//	 
//	 public int Multi(int x, int y)
//	 {
//	  return x*y;
//	 }
//	 public int Multi(int x, int y ,int z)
//	 {
//	  return x*y*z;
//	 }
//	 public float Multi(float x, float y)
//	 {
//	  return x*y;
//	 }
	
	
	
			private String name;
			private int age;
			
			public static void main(String[] args) {
				practice demo=new practice();
				demo.test1();
//				System.out.println(demo.test1("张三"));
				demo.test1("张三");
				demo.test1("王五", 19);
				demo.test1(18, "李四");
			}
			public void test1() {
				
			}
			public String test1(String name) {
				return name;
			}
			public void test1(String name,int age) {
				this.name=name;
				this.age=age;
			}
			public void test1(int age,String name) {
				this.age=age;
				this.name=name;
			}
			
		
}
