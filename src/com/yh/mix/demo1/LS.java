package com.yh.mix.demo1;

public class LS extends AbstractLS {
	//��򵥵�ls����
	protected String echo(CommandVO vo) {
		return FileManager.ls(vo.formatData());
	}
	//����Ϊ��
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}
}
