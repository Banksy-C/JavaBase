package com.java.oop.userdemo;

/**
 * ʵ���û�ע�Ṧ��
	1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
	2������6-18λ��ֻ�ܰ�����ĸ�����֡�������ţ��»��ߡ�@��#��$��!��
	�����֡�����ĸʱ������ǿ�ȶ����� ��������
	����+���롢����+���š�����+��ĸ��ǿ��Ϊ�У�������
	ͬʱ���������ַ���ǿ��Ϊǿ��������
	3���û�������ȷ��email
	�������@���ţ���ֻ�ܰ���һ��
	@��.  ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
 * 
 * @author Administrator
 *
 */
public class User {
	private String usrtName;
	private String password;
	private String email;

	public User() {
	}

	public User(String usrtName, String password, String email) {
		setUsrtName(usrtName);
		setPassword(password);
		setEmail(email);
	}

	public String getUsrtName() {
		return usrtName;
	}

	public void setUsrtName(String usrtName) {
		this.usrtName = usrtName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
