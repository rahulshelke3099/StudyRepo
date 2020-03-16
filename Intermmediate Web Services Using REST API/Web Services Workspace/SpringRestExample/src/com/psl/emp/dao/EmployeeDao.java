package com.psl.emp.dao;

import java.util.HashMap;

import com.psl.emp.bean.Employee;

public interface EmployeeDao {
	 public void deleteEmp(int id);
	 public HashMap<Integer,Employee> getAllEmployee();
	 public void addEmployee(Employee e);
	 public Employee updateEmployee(Employee e);
	 public Employee getEmployeeById(int id);
}
