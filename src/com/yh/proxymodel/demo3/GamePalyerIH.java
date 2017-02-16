package com.yh.proxymodel.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePalyerIH implements InvocationHandler {
	
	//���������
	Class cls = null;
	
	//������ʵ��
	Object obj = null;
	
	//��Ҫ����˭
	public GamePalyerIH(Object _obj) {
		this.obj = _obj;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		this.before();
		Object result = method.invoke(this.obj,args);
		this.after();
		return result;
	}
	
	private void before(){
		System.out.println("����ִ��֮ǰ");
	}
	
	private void after(){
		System.out.println("����ִ��֮��");
	}

}
