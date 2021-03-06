package com.psl.emp;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psl.emp.bean.Employee;
import com.psl.emp.service.EmployeeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeeService service;
	
	@RequestMapping("addEmployee")
	public ModelAndView toAddEmployee()
	{
		return new ModelAndView("addEmp","","");
	}
	
	@RequestMapping("getAllEmps")
	public ModelAndView getAllEmployees()
	{
		HashMap<Integer, Employee> empMap = service.getallEmployees();
		
		return new ModelAndView("showAllEmp","emps",empMap);
	}
	
	@RequestMapping("getEmpById")
	public ModelAndView getEmployeeById(@RequestParam("id") int empId) //Request Param name is case sensitive same name should be used.
	{
		Employee emp =service.getEmployeeById(empId);
		
		return new ModelAndView("employee","emp",emp);
	}
	
	
	@RequestMapping("addEmp")
	public ModelAndView addEmployee(HttpServletRequest request)
	{
		int empId = Integer.parseInt(request.getParameter("id"));
		String empName = request.getParameter("name");
		int empSal = Integer.parseInt(request.getParameter("salary"));
		
		Employee emp = new Employee(empId, empName, empSal);
		
		Employee ref = service.addEmployee(emp);
		
		return new ModelAndView("addEmp","newEmp",ref);
	}
	
	@RequestMapping("removeEmp")
	public ModelAndView removeEmployee(@RequestParam("id") int empId)
	{
		Employee emp = service.removeEmployee(empId);
		return new ModelAndView("delete","delEmp",emp);
	}

}
