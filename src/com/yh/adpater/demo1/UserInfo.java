package com.yh.adpater.demo1;

public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		System.out.println("����Ϊ������");
		return null;
	}

	@Override
	public String getHomeAddress() {
		System.out.println("��ͥ��ַΪ������");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("�ֻ�����Ϊ������");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("�칫�ҵ绰Ϊ....");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("����ְλΪ.....");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("��ͥ�绰Ϊ.....");
		return null;
	}

}
