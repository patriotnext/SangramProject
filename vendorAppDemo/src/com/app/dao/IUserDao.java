package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface IUserDao {
	public int sveUser(User user);
	public List<User> getAllUser();
	public User  getUserByNamePwd(String un, String pwd);
	

}
