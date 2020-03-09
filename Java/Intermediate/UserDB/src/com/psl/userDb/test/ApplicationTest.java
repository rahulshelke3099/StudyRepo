package com.psl.userDb.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.psl.userDb.dao.UserDao;
import com.psl.userDb.dto.UserDetails;
import com.psl.userDb.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

	@InjectMocks
	UserServiceImpl service ;
	
	@InjectMocks
	UserDao dao;
	
	@Test
	public void save() throws Exception
	{
		//service.setDao(dao);
		UserDetails details = new UserDetails();
		details.setUserName("NANAMA");
		details.setPassword("1234");
		UserDetails ref = service.addUser(details);
		//System.out.println(ref);
		assertNotNull(ref);
	}
}