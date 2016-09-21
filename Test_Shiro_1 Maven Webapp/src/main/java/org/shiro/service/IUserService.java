package org.shiro.service;

import java.util.List;

import org.shiro.model.Resource;
import org.shiro.model.User;

public interface IUserService {

	public User login(String username, String password);
	
	public List<String> listRoleSnByUser(int uid);
	
	public List<org.shiro.model.Resource> listAllResource(int uid);


}
