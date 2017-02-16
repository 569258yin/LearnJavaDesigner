package com.yh.responsibility.demo1;

public class Father implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("女儿的请求是："+women.getRequest());
		System.out.println("父亲说是：同意");
	}

}
