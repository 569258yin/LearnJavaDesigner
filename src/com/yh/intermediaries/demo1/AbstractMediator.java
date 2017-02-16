package com.yh.intermediaries.demo1;

/**
 * 中介者
 * @author Administrator
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	
	protected Sale sale;
	
	protected Stock stock;
	
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	
	/**
	 * 处理各个对象之间关系
	 * @param str
	 * @param objects
	 */
	public abstract void execute(String str,Object...objects);
}
