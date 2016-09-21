package org.shiro.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.shiro.dao.IUserDao;
import org.shiro.kit.ShiroKit;
import org.shiro.model.User;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {
	
	@Resource
	private IUserDao userDao;

	@Override
	public User login(String username, String password) {
		User u = userDao.loadByUsername(username);
		if(u==null) throw new UnknownAccountException("�û��������������");
		if(!u.getPassword().equals(ShiroKit.md5(password, username)))
			throw new IncorrectCredentialsException("�û��������������");
		if(u.getStatus()==0) throw new LockedAccountException("�û��Ѿ�������");
		
		

		return u;
	}

	@Override
	public List<String> listRoleSnByUser(int uid) {
		// TODO Auto-generated method stub
		return userDao.listRoleSnByUser(uid);
	}

	@Override
	public List<org.shiro.model.Resource> listAllResource(int uid) {
		// TODO Auto-generated method stub
		return userDao.listAllResource(uid);
	}

}
