package com.yh.responsibility.demo1;

public class Son implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("母亲的请求是："+women.getRequest());
		System.out.println("儿子说是：同意");
	}

}
