package com.yh.advance;

import java.util.ArrayList;

public interface IBranch {
	
	//�ܹ�����С��(��Ҷ�ڵ㣩�����Ǿ�����֦�ڵ㣩
	public void addSubordinate(ICorp corp);
	//�һ�Ҫ�ܹ������������Ϣ
	public ArrayList<ICorp> getSubordinate();
	/*������Ӧ����һ������delSubordinate(ICorp corp)��ɾ������
	 * �����������û���õ��Ͳ�д������
	 */
}
