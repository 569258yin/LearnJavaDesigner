package com.yh.responsibility.demo1;

public class Father implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("Ů���������ǣ�"+women.getRequest());
		System.out.println("����˵�ǣ�ͬ��");
	}

}
