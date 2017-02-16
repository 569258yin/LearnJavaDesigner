package com.yh.proxymodel;

import com.yh.proxymodel.IGamePlayer;

public class GamePlayProxy implements IGamePlayer{
	
	private IGamePlayer gamePalyer;
	
	public GamePlayProxy(String name) {
		try {
			this.gamePalyer = new GamePalyer(this, name);
		} catch (Exception e) {
			System.err.println("Error");
			System.exit(0);
		}
		
	}
	
	public void login(String user,String password){
		this.gamePalyer.login(user, password);
	}
	
	public void killBoss(){
		this.gamePalyer.killBoss();
	}
	
	public void upgrade(){
		this.gamePalyer.upgrade();
	}

}
