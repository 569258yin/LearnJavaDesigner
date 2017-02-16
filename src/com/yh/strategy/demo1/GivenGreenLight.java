package com.yh.strategy.demo1;

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开后门");
	}

}
