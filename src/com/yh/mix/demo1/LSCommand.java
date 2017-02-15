package com.yh.mix.demo1;

public class LSCommand extends Command{
	public String execute(CommandVO vo){
		//返回链表的首节点
		return super.buildChain(AbstractLS.class).get(0).handleMessage(vo);
	}
}
