package com.org.kdxr.dao;

import com.org.kdxr.model.User;

public interface UserDao {


	/** 
	 * 添加新用户 
	 * @param user 
	 * @return 
	 */ 
	public int insertUser(User user);


}
