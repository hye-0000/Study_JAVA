package _interface_dao.damain.userinfo.dao.mysql;

import _interface_dao.damain.userinfo.UserInfo;
import _interface_dao.damain.userinfo.dao.UserInfoDao;

public class UserInfoMySQLDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserID());
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {
		
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		
		System.out.println("Delete into MySQL DB userID = " + userInfo.getUserID());
	}

}
