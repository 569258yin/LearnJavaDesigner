package com.yh.flyweight;

import java.util.HashMap;

public class SignInfoFactory {
	//������
	private static HashMap<ExtrinsicState,SignInfo> pool = new
			HashMap<ExtrinsicState,SignInfo>();
	//�ӳ��л�ö���
	public static SignInfo getSignInfo(ExtrinsicState key){
		//���÷��ض���
		SignInfo result = null;
		//����û�иö������������������
		if(!pool.containsKey(key)){
			result = new SignInfo();
			pool.put(key, result);
		}else{
			result = pool.get(key);
		}
		return result;
	}
}
