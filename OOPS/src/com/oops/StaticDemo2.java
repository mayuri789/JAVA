package com.oops;

class Student{
	int id;
	String name;
	static String companyName="fujitsu";
	
	void display()
	{
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("company name : "+companyName);
	}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.id=1;
		s1.name="mayuri";
		Student s2=new Student();
		s2.id=2;
		s2.name="sarthak";
		Student s3=new Student();
		s3.id=3;
		s3.name="Nishigandha";
		
		s3.companyName="FUJITSU";
		
		s1.display();
		s2.display();
		s3.display();
		 
		
		
		

	}

}
