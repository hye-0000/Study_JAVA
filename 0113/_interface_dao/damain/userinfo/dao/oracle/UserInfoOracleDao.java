package _interface_dao.damain.userinfo.dao.oracle;

import _interface_dao.damain.userinfo.UserInfo;
import _interface_dao.damain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {

		System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserID());
		
	}

	@Override
	public void updatetUserInfo(UserInfo userInfo) {

		System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserID());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {

		System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserID());
		
	}

}
