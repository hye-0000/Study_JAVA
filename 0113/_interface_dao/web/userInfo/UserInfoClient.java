package _interface_dao.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import _interface_dao.damain.userinfo.UserInfo;
import _interface_dao.damain.userinfo.dao.UserInfoDao;
import _interface_dao.damain.userinfo.dao.mysql.UserInfoMySQLDao;
import _interface_dao.damain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String DBType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("12345");
		userInfo.setPassword("fjdk");
		userInfo.setUserName("lee");
		
		UserInfoDao userInfoDao = null;
		
		if(DBType.equals("ORACLE"))
			userInfoDao = new UserInfoOracleDao();
		else if(DBType.equals("MYSQL"))
			userInfoDao = new UserInfoMySQLDao();
		else {
			System.out.println("DB ERROR");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updatetUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
