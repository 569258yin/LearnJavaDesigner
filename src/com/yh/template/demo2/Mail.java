package com.yh.template.demo2;

public class Mail implements Cloneable{
	private String reciver;
	
	private String subject;
	
	private String applellation;
	
	private String context;
	
	private String tail;
	
	public Mail(AdvTemplate advTemplate) {
		this.context = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}
	
	//���ڸ�д�ķ��������ǿ����������ķ�Χ���޸����������������������С
	@Override
	public Mail clone(){
		Mail mail = null;
		try{
			mail = (Mail) super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}

	public String getReciver() {
		return reciver;
	}

	public void setReciver(String reciver) {
		this.reciver = reciver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getApplellation() {
		return applellation;
	}

	public void setApplellation(String applellation) {
		this.applellation = applellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
}
