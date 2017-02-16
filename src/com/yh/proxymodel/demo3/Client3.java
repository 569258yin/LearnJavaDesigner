package com.yh.proxymodel.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client3 {
	
	public static void main(String[] args) {
		IGamePlayer palyer = new GamePalyer("张三");
		//定义hander
		InvocationHandler handler = new GamePalyerIH(palyer);
		//获取类加载器
		ClassLoader cl = palyer.getClass().getClassLoader();
		//动态产生一个代理者
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{ IGamePlayer.class}, handler);
		
		proxy.login("", "");
		proxy.killBoss();
		proxy.upgrade();
		
	}
}
