package com.java.basepractice;

/**
 * ʹ�÷���ģ��ʵ��������Ϸ�е����纰������
 * 
 * @author Administrator
 *
 */
public class SendMessageDemo {

	public static void main(String[] args) {
		// SendMessage("������", "����Ƶ��", "�������ԣ�40���ţ����п�++", 5, 1);
		SendMessage("������");
	}

	/**
	 * ���صĺ���������ֻ���û��ṩ�ǳƲ������ɽ���Ĭ�ϵĺ���
	 * 
	 * @param nicName
	 */
	public static void SendMessage(String nicName) {
		String[] contents = { "�������", "���˰ɡ�����", "��ӭ����xxx��Ϸ����!", "�Ǿ������ɣ�", "��������" };
		SendMessage(nicName, "Ĭ��Ƶ��", contents[(int) (Math.random() * 5)], 10, 1);
	}

	/**
	 * ʵ����Ϸ�еĺ�������
	 * 
	 * @param name
	 *            �����ߵ��ǳ�
	 * @param channelName
	 *            ������Ƶ������
	 * @param message
	 *            ����������
	 * @param count
	 *            �����Ĵ���
	 * @param interval
	 *            ������ʱ����(��λ����)
	 */
	public static void SendMessage(String name, String channelName, String message, int count, int interval) {
		if (interval < 5)
			interval = 5;
		// �����������߼���ƴ���ַ����Ժ��ӡ����
		String value = String.format("��%s��%s,%s", channelName, name, message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				Thread.sleep(interval * 10);// ���߶�����
				// TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block e.printStackTrace();
			}

		}
	}

}
