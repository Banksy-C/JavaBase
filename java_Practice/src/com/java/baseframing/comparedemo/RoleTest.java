package com.java.baseframing.comparedemo;

public class RoleTest {
	public static void main(String[] args) {
		RoleBiz biz = new RoleBiz();
		biz.add(new Role("梅长苏", "麒麟才子1", 50, 150));
		biz.add(new Role("梅有苏", "麒麟才子2", 150, 250));
		biz.add(new Role("梅才苏", "麒麟才子3", 250, 350));
		biz.add(new Role("梅没苏", "麒麟才子4", 350, 450));
		biz.add(new Role("梅苏苏", "麒麟才子5", 450, 550));
		biz.add(new Role("梅兰苏", "麒麟才子6", 550, 650));
		biz.show();
		
		Role role4 = new Role("梅没苏", "麒麟才子4", 350, 450);
		biz.delete(role4);
		biz.show();
		
		Role role3 = new Role("梅才苏", "青龙才子1", 250, 350);
		biz.update(role3);
		biz.show();
		
		System.out.println("排序：");
		biz.sort();
		biz.show();	
		
		
		
		
	}
}
