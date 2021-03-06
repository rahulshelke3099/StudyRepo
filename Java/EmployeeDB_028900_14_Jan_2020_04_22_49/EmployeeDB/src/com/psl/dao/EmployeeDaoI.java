package com.psl.dao;

import java.util.ArrayList;

import com.psl.bean.Employee;
import com.psl.exception.EmployeeException;

public interface EmployeeDaoI {
	
	public ArrayList<Employee> getAllEmployees()throws EmployeeException;
	public Employee getEmployeeById(int empId) throws EmployeeException;
	public Employee updateEmployee(int empId,int empSal)throws EmployeeException;
	public Employee deleteEmployee(int empId)throws EmployeeException;
	public int insertEmployee(Employee emp)throws EmployeeException ;

}
