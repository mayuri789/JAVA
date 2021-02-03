package day6;



class Parent{
	int a=100;
	void display1()
	{
		
		System.out.println("this is parent");
	}
	
}

class Child extends Parent
{
	int a=20;
	
	void display2()
	{
		int result1= a+super.a;
		System.out.println("this is child"+result1);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Parent();
p.display1();
Child c=new Child();
c.display1();
c.display2();
	}

}
