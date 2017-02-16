package com.yh.adpater.demo1;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("姓名为。。。");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("家庭地址为。。。");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("手机号码为。。。");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("办公室电话为....");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("工作职位为.....");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("家庭电话为.....");
		return null;
	}

}
