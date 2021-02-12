package day13Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(id==o.id)
			return 0;
		else if(id>o.id)
			return 1;
		return -1;
		//return 0;
	}

}

public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"rahul",90000));
		emplist.add(new Employee(2,"mayu",55000));
		emplist.add(new Employee(3,"rani",65000));
	
		System.out.println("Employee list :"+emplist);
		for(Employee e: emplist)
		{
			System.out.println(e.id+ " "+e.name+" "+e.salary);
		}

		Collections.sort(emplist);
		System.out.println("=======after sorting ==========");

		for(Employee e: emplist)
		{
			System.out.println(e.id+ " "+e.name+" "+e.salary);
		}
		



	}

}
