package com.yh.flyweight;

public class ExtrinsicState {
	//���Կ�Ŀ
	private String subject;
	String location;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof ExtrinsicState){
			ExtrinsicState state = (ExtrinsicState)obj;
			return state.getLocation().equals(location) &&
					state.getSubject().equals(subject);
		}
		return false;
	}
	@Override
	public int hashCode(){
		return subject.hashCode() + location.hashCode();
	}
}
