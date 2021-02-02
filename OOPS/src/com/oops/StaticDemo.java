package com.oops;

public class StaticDemo {
	
	int a=10; //global nanstatic
	static int b=20;
	
	
	void disp1()
	{
		System.out.println("this is non static method");
	}
static void disp2()
{
	System.out.println("this is static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StaticDemo.b);

StaticDemo.disp2();
System.out.println();
	}

}
