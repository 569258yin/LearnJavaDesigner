package com.yh.advance;

import java.util.ArrayList;

public class Branch extends Corp{
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}
	//�쵼�±�����Щ�¼��쵼��С��
	ArrayList<Corp> subordinateList = new ArrayList<Corp>();
	//����һ��������������СͷĿ��Ҳ�����Ǹ�С��
	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}
	//������Щ����
	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}
	
}
