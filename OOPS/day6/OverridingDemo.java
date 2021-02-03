package day6;
class Parent
{
	void property()
	{
		System.out.println("50 lakhs");
	}
	void marry()
	{
		System.out.println("mayuri....");
	}
}
class Child extends Parent{
	void marry()
	{
		System.out.println("nishigandha...");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child c=new Child();
//		c.property();
//		c.marry();
//		
		Parent p=new Child();
		p.marry();
		
	}

}
