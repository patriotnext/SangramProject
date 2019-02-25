package com.app.service;

import java.util.List;

import com.app.model.User;

public interface IUserService {
	public int sveUser(User user);
	public List<User> getAllUser();
	public User  getUserByNamePwd(String un, String pwd);


}
