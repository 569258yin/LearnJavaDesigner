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
		System.out.println("电梯正在运行");
	}

	@Override
	public void stop() {
		super.context.setLiftStatus(Context.STOPPING_STATE);
		super.context.getLiftStatus().stop();
	}

}
