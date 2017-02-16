package com.yh.proxymodel.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePalyerIH implements InvocationHandler {
	
	//被代理对象
	Class cls = null;
	
	//被代理实列
	Object obj = null;
	
	//我要代理谁
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
		System.out.println("代理执行之前");
	}
	
	private void after(){
		System.out.println("代理执行之后");
	}

}
