package day6;

class Parent1{
	public Parent1() {
		// TODO Auto-generated constructor stub
	System.out.println("Parent Constructor ");
	}
	
	public Parent1(int id, String name) {
		System.out.println("id  :"+id+"name :"+name);
		
	}
	
}
class Child1 extends Parent1{
	Child1()
	{
		super();
		
		System.out.println("child constructor");
	}
	Child1(int id, String name)
	{
		super(id,name);
		System.out.println("Hello......child parameterized constructor");
	}
	
}

public class InheritanceWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c=new Child1();
		Child1 c1=new Child1(2,"MAYURI");

	}

}
