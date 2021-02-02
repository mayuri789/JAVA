package com.oops;

public class VariableDemo {
	int a=10;//global variable
	void function1()
	{
		int x=2;//local variable
		System.out.println("value of x "+x);
		System.out.println("value of a "+a);
	}
	void function2(int y) {//y is local variable
		
		System.out.println("value of a   " +a);
		System.out.println("value of y   "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
VariableDemo v= new VariableDemo();
v.a=3;
v.function1();

VariableDemo v1=new VariableDemo();
v1.a=30;
v1.function1();



	}

}
