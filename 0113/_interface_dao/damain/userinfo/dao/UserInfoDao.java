package _interface_dao.damain.userinfo.dao;

import _interface_dao.damain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updatetUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
