package com.yh.template.demo2;

public class Client {
	
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		int i = 0;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		
		while(i < MAX_COUNT){
			Mail clonerMail = mail.clone();
			clonerMail.setApplellation((int)(100000 + Math.random() * 9999999) +"卡号");
			clonerMail.setReciver((int)(100000 + Math.random() * 9999999)  +"@" + "163.com");
			sendMail(clonerMail);
			i++;
		}
	}

	private static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject());
		System.out.println("接收卡号："+mail.getReciver());
		System.out.println("发送成功！！");
	}
}
