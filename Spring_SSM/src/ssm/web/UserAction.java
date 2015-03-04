package ssm.web;


import ssm.entity.User;
import ssm.service.UserService;

import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport {
	public String index() {
		return SUCCESS;
	}
	
	public String login() {
		User user = userService.getUser(name,pass);
		return SUCCESS;
	}
	
	
	private String name;
	private String pass;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
