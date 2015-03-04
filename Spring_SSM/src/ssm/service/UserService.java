package ssm.service;


import ssm.dao.LogDAO;
import ssm.dao.UserDAO;
import ssm.entity.User;


public class UserService {
	


	
	public User getUser(String name, String pass) {
		User user = userDao.selectByNameAndPass(name, pass);
		return user;
	}

	private UserDAO userDao;
	private LogDAO logDao;
	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	public LogDAO getLogDao() {
		return logDao;
	}
	public void setLogDao(LogDAO logDao) {
		this.logDao = logDao;
	}
	
	
}
