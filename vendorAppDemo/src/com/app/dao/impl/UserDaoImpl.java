package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao;
import com.app.model.User;
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	HibernateTemplate ht;

	User user = null;

	@Override
	public int sveUser(User user) {
		return (Integer) ht.save(user);
	}

	@Override
	public User getUserByNamePwd(String un, String pwd) {
		String hql = "from com.app.model.User where (uemail=? or uContact=?) and pwd=?";
		List<User> list = ht.find(hql, un, un, pwd);
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}

		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> user=ht.loadAll(User.class);
		return user;
	}




}
