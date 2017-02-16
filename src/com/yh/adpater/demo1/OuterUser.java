package com.yh.adpater.demo1;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap<String,String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName", "���Ա���л���ħ��");
		baseInfoMap.put("mobileNumber", "���Ա���绰Ϊ....");
		return baseInfoMap;
	}
	
	/**
	 * jobPosition   officeTelNumber
	 */
	@Override
	public Map getUserOfficeInfo() {
		HashMap<String,String> userOfficeInfo = new HashMap<>();
		userOfficeInfo.put("jobPosition", "Ա��ְλΪ...");
		userOfficeInfo.put("officeTelNumber", "���Ա���칫˾�绰Ϊ....");
		return userOfficeInfo;
	}

	@Override
	public Map getUSerHomeInfo() {
		HashMap<String,String> userHomeInfo = new HashMap<>();
		userHomeInfo.put("homeTelNumber", "Ա����ͥ�绰Ϊ...");
		userHomeInfo.put("homeAddress", "Ա����ͥ��ַ....");
		return userHomeInfo;
	}

}
