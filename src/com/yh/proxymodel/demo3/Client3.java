package com.yh.proxymodel.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client3 {
	
	public static void main(String[] args) {
		IGamePlayer palyer = new GamePalyer("����");
		//����hander
		InvocationHandler handler = new GamePalyerIH(palyer);
		//��ȡ�������
		ClassLoader cl = palyer.getClass().getClassLoader();
		//��̬����һ��������
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{ IGamePlayer.class}, handler);
		
		proxy.login("", "");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
