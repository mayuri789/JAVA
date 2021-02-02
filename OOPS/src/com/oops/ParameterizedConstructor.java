package com.oops;
class Employee1{
	int id;
	String name;
	String dept;
	 
	
	public Employee1(int id,String name,String dept) {
		// TODO Auto-generated constructor stub
		 this.id=id;
		 this.name=name;
		 this.dept=name;
		
	}
	
	void display() {
		System.out.println("id"+id);
		System.out.println("name"+name);

		System.out.println("dept"+dept);

		
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e1=new Employee1(1,"mayuri","computer");
//e1.id=1;
//e1.name="mayuri";
//e1.dept="computer";
e1.display();


	}

}
