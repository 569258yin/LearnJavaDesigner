package com.yh.proxymodel.demo3;

import com.yh.proxymodel.demo3.IGamePlayer;

public class GamePalyer implements IGamePlayer{

	private String name = "";
	

	public GamePalyer(String _name) {
		this.name = _name;
	}
	
	@Override
	public void login(String name,String password) {
		System.out.println(this.name +"��¼�ɹ�");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "�ڴ�Boss");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "�����ˡ�������");
	}

}
