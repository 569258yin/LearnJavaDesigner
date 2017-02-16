package com.yh.strategy.demo1;

public class Context {
	
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void operate(){
		this.strategy.operate();
	}
}
