package com.yh.responsibility.demo1;

public class Husband implements IHandler{

	@Override
	public void HandleMessage(IWomen women) {
		System.out.println("���ӵ������ǣ�"+women.getRequest());
		System.out.println("�ɷ�˵�ǣ�ͬ��");		
	}

}
