package multitrading;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{		
			System.out.println(" run method ..."+i);
		}
	}
}


class B implements Runnable
{
	for(int i=1;i<=10;i++)
	{		
		System.out.println(" this is my task.."+i);
	}
}

public class CreateDemo {
	public static void main(String[] args)
	{
		A o=new A();
		o.start();
		B o1=new B();
		Thread t1=new Thread(o1);
		t1.start();
		
		
	}

}
