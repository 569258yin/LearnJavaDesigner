package com.yh.mix.demo1;

public class LS_A extends AbstractLS {
	//ls -aÃüÁî
	protected String echo(CommandVO vo) {
		return FileManager.ls_a(vo.formatData());
	}
	protected String getOperateParam() {
		return super.A_PARAM;
	}
}