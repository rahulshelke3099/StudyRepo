package com.psl.Question2.dto;

public class Person {

	private int age;
	private String name;
	
	
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public boolean isEligible(Person p)
	{
		boolean flag=false;
		if(p.age>=18 && p.age<=100 && (p.name!=null) && (!p.getName().isEmpty()))
		{
			flag = true;
		}	
		return flag;
	}
}
