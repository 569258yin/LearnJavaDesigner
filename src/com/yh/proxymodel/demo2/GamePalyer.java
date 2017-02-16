package com.yh.proxymodel.demo2;

public class GamePalyer implements IGamePlayer{

	private String name = "";

	private IGamePlayer proxy = null;

	public GamePalyer(String _name) {
		this.name = _name;
	}

	@Override
	public void login(String name,String password) {
		if(this.isProxy()){
			System.out.println(this.name +"登录成功");
		}else{
			System.out.println("请设置代理");
		}
	}

	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name + "在打Boss");
		}else{
			System.out.println("请设置代理");
		}
	}

	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name + "升级了。。。。");
		}else{
			System.out.println("请设置代理");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayProxy(this);
		return this.proxy;
	}

	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		}else{
			return true;
		}
	}

}
