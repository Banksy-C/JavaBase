package com.java.baseframing.comparedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
 * 角色业务类
 * @author Administrator
 *
 */
public class RoleBiz {
	List<Role> roleList = null;
	
	public RoleBiz(){
		roleList = new ArrayList<>();
	}
	
	public void add(Role role){
		if(role != null){
			roleList.add(role);
		}
	}
	
	public void delete(Role role){
		roleList.remove(role);
	}
	
	/**
	 * 将传入的角色对象在集合中进行修改
	 * @param role
	 */
	public void update(Role role){
		//1、在集合中找到对象
		//2、修改对象
		int index = roleList.indexOf(role);
		if(index != -1){
			roleList.set(index, role);
		}
	}
	
	public void sort(){
		//使用内置的工具类进行排序--前提，必须实现比较器接口
		//1、实体类实现compareble接口
//		Collections.sort(roleList);
//		Collections.reverse(roleList);//逆序
		//2、自定义一个比较器接口对象
//		Collections.sort(roleList, new Rolecomparator_Attack());
		//基于比较器RoleComparator_Attack的逆序
		Collections.sort(roleList, Collections.reverseOrder(new Rolecomparator_Attack()));
		//乱序
//		Collections.shuffle(roleList);
	}
	
	public void show(){
		System.out.println("角色\t称号\t\t气血\t攻击力");
		System.out.println("--------------------------------------");
		Iterator<Role> roleIt = roleList.iterator();
		while(roleIt.hasNext()){
			Role role = roleIt.next();
			System.out.println(role.getName() + "\t" + role.getTitle() + "\t" + role.getHp() + "\t" + role.getAttack());
		}
		
	}
}

/**
 * 角色类中攻击力的比较器
 * @author Administrator
 *
 */
class Rolecomparator_Attack implements Comparator<Role>{

	@Override
	public int compare(Role role1, Role role2) {
		if(role1.getAttack() > role2.getAttack()) return 1;
		if(role1.getAttack() < role2.getAttack()) return -1;
		return 0;
	}
	
}

