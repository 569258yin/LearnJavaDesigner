package com.yh.status.demo1;

public class RunningState extends LiftStatus{

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void run() {
		System.out.println("������������");
	}

	@Override
	public void stop() {
		super.context.setLiftStatus(Context.STOPPING_STATE);
		super.context.getLiftStatus().stop();
	}

}
