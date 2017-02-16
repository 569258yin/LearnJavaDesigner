package com.yh.status.demo1;

public class Context {
	public final static OpenningState OPENNING_STATE = new OpenningState();
	public final static ClosingState CLOSING_STATE = new ClosingState();
	public final static RunningState RUNNING_STATE = new RunningState();
	public final static StoppingState STOPPING_STATE = new StoppingState();
	
	private LiftStatus liftStatus;
	public LiftStatus getLiftStatus() {
		return liftStatus;
	}
	public void setLiftStatus(LiftStatus liftStatus) {
		this.liftStatus = liftStatus;
		this.liftStatus.setCotext(this);
	}
	
	public void open(){
		this.liftStatus.open();
	}
	
	public void close(){
		this.liftStatus.close();
	}
	
	public void run(){
		this.liftStatus.run();
	}
	
	public void stop(){
		this.liftStatus.stop();
	}
}
