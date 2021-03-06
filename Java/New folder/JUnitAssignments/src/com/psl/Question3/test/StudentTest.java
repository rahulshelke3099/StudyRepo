package com.psl.Question3.test;

import static org.junit.Assert.*;

import org.junit.*;

import com.psl.Question3.dto.Student;
import com.psl.Question3.exception.StudentException;

public class StudentTest {

	Student s;
	@Before
	public void init()
	{
		s=new Student();
	}
	@After
	public void destroy()
	{
		s=null;
	}
	
	@Test
	public void testGetTotalFees() throws StudentException
	{
		s.setName("Pulkit");
		s.setPercentage(59);
		int totalFees = s.getTotalFees(s);
		System.out.println(totalFees);
		assertEquals(9000,totalFees);
	
	}
	
}
