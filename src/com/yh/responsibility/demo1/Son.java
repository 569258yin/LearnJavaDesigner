package com.yh.responsibility.demo1;

public class Son implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("ĸ�׵������ǣ�"+women.getRequest());
		System.out.println("����˵�ǣ�ͬ��");
	}

}
