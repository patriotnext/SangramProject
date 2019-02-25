package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	
	@Override
	public int sveUser(User user) {
		return dao.sveUser(user);
	}

	@Override
	public User getUserByNamePwd(String un, String pwd) {
		return dao.getUserByNamePwd(un, pwd);

	}

	@Override
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	

}
