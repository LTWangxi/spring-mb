package com.org.kdxr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.kdxr.dao.UserDao;
import com.org.kdxr.model.User;
import com.org.kdxr.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
		public int insertUser(User user) {
		return userDao.insertUser(user);
	}
}
