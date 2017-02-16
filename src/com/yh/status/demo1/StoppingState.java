package com.yh.status.demo1;

public class StoppingState extends LiftStatus{

	@Override
	public void open() {
		super.context.setLiftStatus(Context.OPENNING_STATE);
		super.context.getLiftStatus().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		super.context.setLiftStatus(Context.RUNNING_STATE);
		super.context.getLiftStatus().run();
	}

	@Override
	public void stop() {
		System.out.println("µÁÃ›Õ£÷π¡À ");
	}

}
