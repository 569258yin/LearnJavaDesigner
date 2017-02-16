package com.yh.template.demo2;

public class Client {
	
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		
		while(i < MAX_COUNT){
			Mail clonerMail = mail.clone();
			clonerMail.setApplellation((int)(100000 + Math.random() * 9999999) +"����");
			clonerMail.setReciver((int)(100000 + Math.random() * 9999999)  +"@" + "163.com");
			sendMail(clonerMail);
			i++;
		}
	}

	private static void sendMail(Mail mail) {
		System.out.println("���⣺"+mail.getSubject());
		System.out.println("���տ��ţ�"+mail.getReciver());
		System.out.println("���ͳɹ�����");
	}
}
