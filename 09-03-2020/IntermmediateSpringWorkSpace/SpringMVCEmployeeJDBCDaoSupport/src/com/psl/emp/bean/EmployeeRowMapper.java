package com.psl.emp.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int noOfRows) throws SQLException 
	{
		Employee emp = new Employee(rs.getInt("empId"), rs.getString("empName"), rs.getInt("empSal"));
		
		return emp;
	}
	

}
