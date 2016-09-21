package org.shiro.dao;

import java.util.List;

import org.shiro.model.User;
import org.springframework.stereotype.Repository;

public interface IUserDao {
	
	public User loadByUsername(String username);

	public List<org.shiro.model.Resource> listAllResource(int uid);

	public List<String> listRoleSnByUser(int uid);


}
