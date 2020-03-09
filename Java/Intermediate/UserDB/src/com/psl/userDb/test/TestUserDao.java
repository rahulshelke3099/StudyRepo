package com.psl.userDb.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.psl.userDb.dao.UserDao;
import com.psl.userDb.dao.UserDaoImpl;
import com.psl.userDb.dto.UserDetails;
import com.psl.userDb.service.UserServiceImpl;

public class TestUserDao {

	UserServiceImpl service;
	UserDao dao;
	
	@Before
	public void init()
	{
		service = new UserServiceImpl();
		dao = new UserDaoImpl();
		service.setDao(dao);
	}
	
	@After
	public void destroy()
	{
		dao=null;
		service=null;
	}
	
	@Test
	public void testAddUser() throws Exception
	{
		UserDetails obj = new UserDetails("xyz","111");
		UserDetails user = service.addUser(obj);
		assertNotNull(user);
	}
}
