package com.yh.mix.demo1;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
	ls("com.yh.mix.demo1.LSCommand");
	private String value = "";
	//定义构造函数，目的是Data(value)类型的相匹配
	private CommandEnum(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	//返回所有的enum对象
	public static List<String> getNames(){
		CommandEnum[] commandEnum = CommandEnum.values();
		List<String> names = new ArrayList<String>();
		for(CommandEnum c:commandEnum){
			names.add(c.name());
		}
		return names;
	}
	/*
	 * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
	 * 毕竟用Clas完全可以代替enum
	 */
}
