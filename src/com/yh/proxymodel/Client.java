package com.yh.proxymodel;

import com.yh.proxymodel.demo2.IGamePlayer;

public class Client {
//	public static void main(String[] args) {
//		GamePlayProxy gProxy = new GamePlayProxy("张三");
//		gProxy.login("", "");
//		gProxy.killBoss();
//		gProxy.upgrade();
//	}
	public static void main(String[] args) {
		IGamePlayer payer = new com.yh.proxymodel.demo2.GamePalyer("张三");
		payer.getProxy().login("", "");
				
	}
}
