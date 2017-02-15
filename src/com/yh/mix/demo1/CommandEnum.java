package com.yh.mix.demo1;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
	ls("com.yh.mix.demo1.LSCommand");
	private String value = "";
	//���幹�캯����Ŀ����Data(value)���͵���ƥ��
	private CommandEnum(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	//�������е�enum����
	public static List<String> getNames(){
		CommandEnum[] commandEnum = CommandEnum.values();
		List<String> names = new ArrayList<String>();
		for(CommandEnum c:commandEnum){
			names.add(c.name());
		}
		return names;
	}
	/*
	 * java enum���;�����ʹ�ã�������Ҫʹ�ö�̬���̳еȷ���
	 * �Ͼ���Clas��ȫ���Դ���enum
	 */
}
