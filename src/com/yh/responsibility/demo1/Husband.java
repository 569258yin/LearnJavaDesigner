package com.yh.responsibility.demo1;

public class Husband implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("妻子的请求是："+women.getRequest());
		System.out.println("丈夫说是：同意");		
	}

}
