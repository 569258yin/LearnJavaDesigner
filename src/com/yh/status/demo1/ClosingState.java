package com.yh.status.demo1;

public class ClosingState extends LiftStatus {

	@Override
	public void open() {
		super.context.setLiftStatus(Context.OPENNING_STATE);
		super.context.getLiftStatus().open();
	}

	@Override
	public void close() {
		System.out.println("µÁÃ›√≈πÿ±’.....");
	}

	@Override
	public void run() {
		super.context.setLiftStatus(Context.RUNNING_STATE);
		super.context.getLiftStatus().run();
	}

	@Override
	public void stop() {
		super.context.setLiftStatus(Context.STOPPING_STATE);
		super.context.getLiftStatus().stop();
	}

}
