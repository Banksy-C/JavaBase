package com.java.oop.chunwan;

import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {

	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Director zhangyimou = new Director();
		
		Singer songzuying = new Singer("����Ӣ");
		Dancer yangliping = new Dancer("����Ƽ");
		
		
		zhangyimou.action(songzuying);
		zhangyimou.action(yangliping);
		
		//1��ģ������������Ҫ�����������Ա������ҵ�����벻��
		CrossActor fenggong = new CrossActor("�빮");
		CrossActor guodegang = new CrossActor("���¸�");
		zhangyimou.action(fenggong);
		zhangyimou.action(guodegang);
		
		
		//2��Ҫ��ʵ��main����Ҳ���޸ĵ�����£�ʵ��ĳ����ɫ������
		//���������ʹ�÷���+��̬����ʵ���޷�����
		Properties props = new Properties();//��ӦJava�����ļ�
		//��ȡ�����ļ��е�����
		props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
//		System.out.println(props.getProperty("crossactor"));
		//ͨ������ʵ���������ļ������õ���
		Actor actor = (Actor)Class.forName(props.getProperty("crossactor")).newInstance();
		actor.setName("�빮");
		zhangyimou.action(actor);
		
	}

}
