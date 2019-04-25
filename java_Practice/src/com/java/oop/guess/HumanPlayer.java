package com.java.oop.guess;

/**
 * �������
 * 
 * @author Administrator
 *
 */
public class HumanPlayer {
	/** ��̬������ ��ȭ����Ϣ */
	public static final int MessageTypeFist = 1;
	/** ��̬������ Ӯ�ñ���ʱ����Ϣ */
	public static final int MessageTypeWin = 2;
	/** ��̬������ �������ʱ����Ϣ */
	public static final int MessageTypeLose = 3;

	// ���ԣ����ơ�������������ȭ������ɫ��Ӧ����Ч������ɫ�ĸ��Ի�̨��
	private String name;
	private int score;
	private int fist;
	// .............
	/** ��ɫ�ڳ�ȭ��ʱ����˵�ĸ��Ի�̨�� */
	private String[] fistWords = { "���йⲨ~biubiubiu~~~", "����ı���Ϊʲô��ô��~~~", "��ɱ��¶PP������~~~", "������ϲ�����ཷ��",
			"�ز�����ŷ��ɣ������һȭ~" };

	private String[] winWinds = { "����˭~~~", "��ȭ���е���˼~~~", "~~~~��~~~~��~~~~~", "ȫ������~~", "���Ż�����Ÿ裬Ȼ���������~" };

	private String[] loseWords = { "ͨ���ɹ���·����ʩ��������", "�ȵ���ˮ��ȥ����֪��˭����Ӿ�ˡ���", "������ǲ��ã����ʱ�����������綼û�ú�",
			"���������ˡ���QQ���ϣ�����̡��ú�����һ���������ô�̫����QQ������", "���˽����Ҷ������������Ҷ��塣����" };

	/**
	 * ���ݴ������Ϣ���ͣ������ӡ��Ӧ���͵���Ϣ
	 * 
	 * @param msgType
	 *            ��ӦHemanPlayer���ж���ľ�̬����
	 */
	public void sendMessage(int msgType) {
		// ����һ��0-4֮����������
		int index = ((int) (Math.random() * 1000)) % 5;
		String message = null; // Ҫ��ӡ����Ϣ
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWinds[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}

}
