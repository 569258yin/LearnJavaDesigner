package com.yh.status.demo1;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftStatus(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
