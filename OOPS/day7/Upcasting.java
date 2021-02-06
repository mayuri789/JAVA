package day7;

class Parent1{
	void fun1()
	{
		System.out.println("this is parent function 1");
	}
	void fun2()
	{
		System.out.println("parent fun 2");
	}
}
class Child1 extends Parent1{
	//it is overriding
	void fun2()
	{ 
		super.fun2();
		System.out.println("child fun2 ");
	}
	void fun3()
	{
		System.out.println("child fun3");
	}
}

public class Upcasting {
	public static void main(String args[])
	{
		Parent1 p1=new Child1();
		p1.fun1();
		p1.fun2();
		
	}

}
