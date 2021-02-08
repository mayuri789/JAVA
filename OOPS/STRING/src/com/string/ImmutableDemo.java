package com.string;

public class ImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IMMUTABLE
		
		String name="mayuri";
		System.out.println("name is : "+name);
		
		name.concat("prasad");
		System.out.println("name is: "+name);
		
		name=name.concat("mestry");
		System.out.println("name is :"+name);
		
		
		//MUTABLE
		
		System.out.println("......mutable....");
		StringBuffer sb=new StringBuffer("NISHIGANDHA");
		
		System.out.println("name is "+sb);
		sb.append("RANI");
		System.out.println("nerulkar"+sb);
		
		

	}

}
