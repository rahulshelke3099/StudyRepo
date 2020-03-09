package com.psl.userDb.dao;

import com.psl.userDb.dto.UserDetails;

public interface UserDao {

	public UserDetails addUser(UserDetails obj) throws Exception;
	public UserDetails deleteUser(UserDetails obj);
	public UserDetails updateUser(UserDetails obj);
	
}
