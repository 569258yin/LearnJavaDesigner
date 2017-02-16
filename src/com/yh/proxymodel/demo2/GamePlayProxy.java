package com.yh.proxymodel.demo2;

import com.yh.proxymodel.demo2.IGamePlayer;

public class GamePlayProxy implements IGamePlayer,IProxy{
	
	private IGamePlayer gamePalyer;
	
	public GamePlayProxy(IGamePlayer _gamePlayer) {
		this.gamePalyer = _gamePlayer;
		
	}
	
	public void login(String user,String password){
		this.gamePalyer.login(user, password);
	}
	
	public void killBoss(){
		this.gamePalyer.killBoss();
	}
	
	public void upgrade(){
		this.gamePalyer.upgrade();
		this.count();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

	@Override
	public void count() {
		System.out.println("升级需要150元");
	}

}
