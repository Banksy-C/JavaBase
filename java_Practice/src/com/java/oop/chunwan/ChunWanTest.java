package com.java.oop.chunwan;

import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Director zhangyimou = new Director();
		
		Singer songzuying = new Singer("宋祖英");
		Dancer yangliping = new Dancer("杨丽萍");
		
		
		zhangyimou.action(songzuying);
		zhangyimou.action(yangliping);
		
		//1、模拟程序的升级：要求添加相声演员，核心业务层代码不变
		CrossActor fenggong = new CrossActor("冯巩");
		CrossActor guodegang = new CrossActor("郭德纲");
		zhangyimou.action(fenggong);
		zhangyimou.action(guodegang);
		
		
		//2、要求实现main方法也不修改的情况下，实现某个角色的升级
		//解决方案：使用反射+多态技术实现无缝升级
		Properties props = new Properties();//对应Java配置文件
		//读取配置文件中的内容
		props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
//		System.out.println(props.getProperty("crossactor"));
		//通过反射实例化配置文件中配置的类
		Actor actor = (Actor)Class.forName(props.getProperty("crossactor")).newInstance();
		actor.setName("冯巩");
		zhangyimou.action(actor);
		
	}

}
