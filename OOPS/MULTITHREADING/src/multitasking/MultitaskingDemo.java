package multitasking;

class Mayuri extends Thread
{
	public void run()
	{
		for(int i=10;i<30;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
class Sarthak extends Thread
{
	public void run()
	{
		for(int i=40;i<=50;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}

class Rani extends Thread
{
	public void run()
	{
		for(int i=60;i<=70;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}

public class MultitaskingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mayuri mayuri=new Mayuri();
		Rani rani=new Rani();
		Sarthak sarthak=new Sarthak();

		mayuri.setName("mayu...");
		sarthak.setName("mani...");
		rani.setName("rani....");
		
		mayuri.setPriority(3);
		sarthak.setPriority(2);
		rani.setPriority(1);


		mayuri.start();
		sarthak.start();
		rani.start();
	
	}

}
