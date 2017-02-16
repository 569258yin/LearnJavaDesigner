package com.yh.intermediaries.demo1;

public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}

	public void buyIBMComputer(int number){
		//访问库存
		super.mediator.execute("purchase.buy", number);
	}
	
	public void refuseBuyIBM(){
		System.out.println("不在采购IBM电脑");
	}
}
