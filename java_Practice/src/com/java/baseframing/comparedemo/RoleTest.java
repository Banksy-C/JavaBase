package com.java.baseframing.comparedemo;

public class RoleTest {
	public static void main(String[] args) {
		RoleBiz biz = new RoleBiz();
		biz.add(new Role("÷����", "�������1", 50, 150));
		biz.add(new Role("÷����", "�������2", 150, 250));
		biz.add(new Role("÷����", "�������3", 250, 350));
		biz.add(new Role("÷û��", "�������4", 350, 450));
		biz.add(new Role("÷����", "�������5", 450, 550));
		biz.add(new Role("÷����", "�������6", 550, 650));
		biz.show();
		
		Role role4 = new Role("÷û��", "�������4", 350, 450);
		biz.delete(role4);
		biz.show();
		
		Role role3 = new Role("÷����", "��������1", 250, 350);
		biz.update(role3);
		biz.show();
		
		System.out.println("����");
		biz.sort();
		biz.show();	
		
		
		
		
	}
}
