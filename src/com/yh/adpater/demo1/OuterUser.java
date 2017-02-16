package com.yh.adpater.demo1;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap<String,String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName", "这个员工叫混世魔王");
		baseInfoMap.put("mobileNumber", "这个员工电话为....");
		return baseInfoMap;
	}
	
	/**
	 * jobPosition   officeTelNumber
	 */
	@Override
	public Map getUserOfficeInfo() {
		HashMap<String,String> userOfficeInfo = new HashMap<>();
		userOfficeInfo.put("jobPosition", "员工职位为...");
		userOfficeInfo.put("officeTelNumber", "这个员工办公司电话为....");
		return userOfficeInfo;
	}

	@Override
	public Map getUSerHomeInfo() {
		HashMap<String,String> userHomeInfo = new HashMap<>();
		userHomeInfo.put("homeTelNumber", "员工家庭电话为...");
		userHomeInfo.put("homeAddress", "员工家庭地址....");
		return userHomeInfo;
	}

}
