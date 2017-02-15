package com.yh.mix.demo1;

public class Invoker {
	//ִ������
	public String exec(String _commandStr){
		//���巵��ֵ
		String result = "";
		//���Ƚ�������
		CommandVO vo = new CommandVO(_commandStr);
		//����Ƿ�֧��֧�ָ�����
		if(CommandEnum.getNames().contains(vo.getCommandName())){
			//�����������
			String className =
					CommandEnum.valueOf(vo.getCommandName()).getValue();
			Command command;
			try {
				command = (Command)Class.forName(className).newInstance();
				result = command.execute(vo);
			}catch(Exception e){
				// TODO �쳣����
			}
		}else{
			result = "�޷�ִ��������������ʽ";
		}
		return result;
	}
}
