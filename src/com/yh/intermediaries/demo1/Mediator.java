package com.yh.intermediaries.demo1;

public class Mediator extends AbstractMediator{

	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("purchase.buy")){
			this.buyComputer((Integer)objects[0]);
		}else if(str.equals("sale.sell")){
			this.sellComputer((Integer)objects[0]);
		}else if(str.equals("sale.offsell")){
			this.offSell();
		}else if(str.equals("stock.clear")){
			this.clearStock();
		}
	}
	
	private void buyComputer(Integer number) {
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus > 80){
			System.out.println("采购IBM电脑："+number + "台");
		}else{
			int buyNumber = number / 2 ;
			System.out.println("采购IBM电脑："+ buyNumber +"台");
		}
		super.stock.increase(number);
	}

	private void sellComputer(Integer number) {
		if(super.stock.getStockNumber() < number){
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}


	private void clearStock() {
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

	private void offSell() {
		System.out.println("折扣销售IBM电脑"+stock.getStockNumber()+"台");
	}



}
