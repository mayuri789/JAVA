package multitasking;
class Anjali extends Thread
{
	public void run()
	{
		for(int i=10;i<30;i++)
		{
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
class Sarthak1 extends Thread
{
	public void run()
	{
		for(int i=40;i<=50;i++)
		{
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}

class Rani1 extends Thread
{
	public void run()
	{
		for(int i=60;i<=70;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Anjali mayuri=new Anjali();
		Rani1 rani=new Rani1();
		Sarthak sarthak=new Sarthak();

		mayuri.setName("mayu...");
		sarthak.setName("mani...");
		rani.setName("rani....");
		
		mayuri.start();
		mayuri.join();
		sarthak.start();
		rani.start();
	}

}
