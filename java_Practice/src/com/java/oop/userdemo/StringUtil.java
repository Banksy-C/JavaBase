package com.java.oop.userdemo;

public class StringUtil {
	/**
	 * �жϴ�����û����ַ����Ƿ��ǺϷ����û���
	 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	 * @param userName
	 * @return
	 */
	public static boolean isCorretUserName(String userName) {
		boolean isCorrect = true;
		if (userName == null)
			return false;
		if (userName.length() > 25)
			return false;
		//�Ƿ��ַ�����
		char[] unValidChar = {' ', '\'' , '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(userName.contains(Character.toString(ch))){
				isCorrect = false;
				break;
			}
		}
			return isCorrect;
	}
	/**
	 * 2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$��!��
	 * �����֡�����ĸʱ������ǿ�ȶ����� ��������
	 * ����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�������
	 * ͬʱ���������ַ���ǿ��Ϊǿ��������
	 * @param password
	 * @return	�������ֵΪ"",��ô�������֤ʧ�ܣ���֤�ɹ����򷵻��Ǻű�ʾ�����ǿ��
	 */
	public static String validatePassword(String password){
		String power = "";//�����ǿ��
		if(password == null) return power;
		if(password.length() < 6 || password.length() > 18) return power;
		//�����кϷ�����ɲ���
//		String[] correctPart = {"_", "@", "#", "$", "!"};
		String part = "_@#$!";
		for (int i = 0; i < password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))){
				//���������ĸ�����֣�����Ҳ���ǺϷ���������ţ���֤���ǷǷ��ĸ�ʽ
				if(!part.contains(Character.toString(password.charAt(i)))){
					return power;
				}
			}
		}
		//�ж�����ǿ��
		if(isDigit(password) || isLetter(password)){
			power = "�������";
		}else if(isDigitAndLetter(password)){
			power = "�������";
		}else if(isDigitAndLetterAndSymble(password)){
			power = "�������";
		}
		return power;
	}
	
	private static boolean isDigitAndLetterAndSymble(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!(Character.isDigit(value.charAt(i)) || Character.isLetter(value.charAt(i)) || "_@#$!".contains(Character.toString(value.charAt(i))))){
				return false;
			}
		}
		return true;
	}
	/**
	 * �ַ����а����Ϸ�����ĸ������
	 * @param value
	 * @return
	 */
	private static boolean isDigitAndLetter(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!(Character.isLetterOrDigit(value.charAt(i)))){
				return false;
			}
		}
		return true;
	}
	/**
	 * �ж�һ���ַ����ǲ���һ��������
	 * @param value
	 * @return
	 */
	private static boolean isDigit(String value){
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/**
	 * �ж�һ���ַ����ǲ��Ǵ���ĸ���
	 * @param value
	 * @return
	 */
	private static boolean isLetter(String value){

		for (int i = 0; i < value.length(); i++) {
			if(!Character.isLetter(value.charAt(i))){
				return false;
			}
		}
		return true;
	}
	/**
	 * �ж��ַ������Ƿ�����Ϸ����������
	 * @param value
	 * @return
	 */
	private static boolean isContainsSymble(String value){
		String part = "_@#$!";
		for (int i = 0; i < value.length(); i++) {
			if(!part.contains(Character.toString(value.charAt(i)))){
				return true;
			}
		}
		return false;
	}
	// 3���û�������ȷ��email
	// �������@���ţ���ֻ�ܰ���һ��
	// @��. ���Ų����ڿ�ͷ��Ҳ�����ڽ�β

}
