package com.java.oop.book;

/**
 * ͼ���ҵ���࣬��װ�˶�ͼ���������ɾ�Ĳ鷽��
 * 
 * @author Administrator
 *
 */
public class BookBiz {

	/**
	 * �����鼮
	 * 
	 * @param book Ҫ���۵�ͼ�����
	 * @return ������۳ɹ����������۵�����������ʧ�ܣ�����-1
	 */
	public int sellBook(Book book) {
		// 1���ж�ͼ��Ŀ���Ƿ����1
		// 2��ͼ��Ŀ��-1
		// 3���������۵�����
		if (!(book.getCount() > 1)) {
			//��������
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}
}
