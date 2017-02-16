package com.yh.responsibility.demo1;

public class Women implements IWomen{

	private int type = 0;
	private String request = " ";
	
	

	public Women(int type, String request) {
		super();
		this.type = type;
		this.request = request;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
