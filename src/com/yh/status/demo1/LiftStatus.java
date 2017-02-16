package com.yh.status.demo1;

public abstract class LiftStatus {
	
	protected Context context;
	
	public void setCotext(Context cotext) {
		this.context = cotext;
	}
	
	public abstract void open();
	
	public abstract void close();
	
	public abstract void run();
	
	public abstract void stop();
}
