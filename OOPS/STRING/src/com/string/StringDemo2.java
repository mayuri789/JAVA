package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//literal	
		String s1="mayuri";
		String s2="mayuri";

		//new keyword
		
		String s3=new String("sachin");
		String s4=new String("Sachin");
		String s5=new String("Sam");
				
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s5);
		
		System.out.println("=======equals========");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
	}

}
