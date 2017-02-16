package com.yh.status.demo1;

public class OpenningState extends LiftStatus {

	@Override
	public void open() {
		System.out.println("µçÌÝÃÅ¿ªÆô");
	}

	@Override
	public void close() {
		super.context.setLiftStatus(Context.CLOSING_STATE);
		super.context.getLiftStatus().close();
	}

	@Override
	public void run() {

	}

	@Override
	public void stop() {

	}

}
