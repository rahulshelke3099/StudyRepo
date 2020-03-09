package com.psl.Question1.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.*;

import com.psl.Question1.dto.DateOperations;
import com.psl.Question1.exception.DateOperationsException;

public class TestDateOperations {

	
	DateOperations d ;
	@Before
	public void init()
	{
		d = new DateOperations();
	}
	@After
	public void destroy()
	{
		d=null;
	}
	
	@Test
	public void testgetDate() throws DateOperationsException
	{
		int days = 12;
		int month = 4;
		int years = 2009;
		LocalDate date = d.getDate(days, month, years);
		assertNotNull(date);
	}
	
	@Test(expected=DateOperationsException.class)
	public void testGetDifference() throws DateOperationsException
	{
		int days2 = 12;
		int month2 = 4;
		int years2 = 2009;
		int days1 = 14;
		int month1 = 9;
		int years1 = 2019;
		Period period = d.getDifference(days1, month1, years1, days2, month2, years2);
		
		assertFalse(period.isNegative());
		
	}
}
