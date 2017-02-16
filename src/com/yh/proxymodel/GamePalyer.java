package com.yh.proxymodel;

import com.yh.proxymodel.IGamePlayer;

public class GamePalyer implements IGamePlayer{

	private String name = "";
	
	public GamePalyer(IGamePlayer proxy,String _name) {
		if(proxy == null){
			throw new NullPointerException();
		}else{
			this.name = _name;
		}
	}
	
	@Override
	public void login(String name,String password) {
		System.out.println(this.name +"登录成功");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "在打Boss");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "升级了。。。。");
	}

}
