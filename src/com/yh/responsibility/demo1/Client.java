package com.yh.responsibility.demo1;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<IWomen> lists = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lists.add(new Women(random.nextInt(4),"��Ҫȥ���"));
		}
		
		IHandler father = new Father(); 
		IHandler husband = new Husband();
		IHandler son = new Son();
		
		for (IWomen iWomen : lists) {
			if(iWomen.getType() == 1){
				System.out.println("---------Ů��������ʾ---------");
				father.HandleMessage(iWomen);
			}else if(iWomen.getType() == 2){
				System.out.println("---------�������ɷ���ʾ---------");
				husband.HandleMessage(iWomen);
			}else if(iWomen.getType() == 3){
				System.out.println("---------ĸ���������ʾ---------");
				son.HandleMessage(iWomen);
			}else{
				System.out.println("Error:"+iWomen.getType());
			}
		}
				
	}
}
