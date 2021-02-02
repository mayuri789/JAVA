package com.oops;

class Employee
{
	int id;
	String name;
	int salary;
	int experience;
	void displayEmployeeDetails()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("salary"+salary);
		System.out.println("experience"+experience);
	}
	
	
	
	
	
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee abc=new Employee();
		abc.id=1;
		abc.name="mayuri";
		abc.salary=100000;
		abc.experience=7;
		abc.displayEmployeeDetails();
		// TODO Auto-generated method stub

	}

}
