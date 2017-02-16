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
			System.out.println(this.name +"��¼�ɹ�");
		}else{
			System.out.println("�����ô���");
		}
	}

	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name + "�ڴ�Boss");
		}else{
			System.out.println("�����ô���");
		}
	}

	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name + "�����ˡ�������");
		}else{
			System.out.println("�����ô���");
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
