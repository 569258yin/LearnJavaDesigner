package com.yh.responsibility.demo1;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<IWomen> lists = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lists.add(new Women(random.nextInt(4),"我要去逛街"));
		}
		
		IHandler father = new Father(); 
		IHandler husband = new Husband();
		IHandler son = new Son();
		
		for (IWomen iWomen : lists) {
			if(iWomen.getType() == 1){
				System.out.println("---------女儿向父亲请示---------");
				father.HandleMessage(iWomen);
			}else if(iWomen.getType() == 2){
				System.out.println("---------妻子向丈夫请示---------");
				husband.HandleMessage(iWomen);
			}else if(iWomen.getType() == 3){
				System.out.println("---------母亲向儿子请示---------");
				son.HandleMessage(iWomen);
			}else{
				System.out.println("Error:"+iWomen.getType());
			}
		}
				
	}
}
