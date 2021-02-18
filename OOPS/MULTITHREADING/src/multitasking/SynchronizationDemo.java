package multitasking;


 class WaterBottle
{
	synchronized void drinkWater(int time)
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Water implements Runnable
{
	
	WaterBottle waterBottle=new WaterBottle();
	public void run()
	{
		//task
		waterBottle.drinkWater(10);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Water w=new Water();
		
		Thread mayuri=new Thread(w);
		Thread sarthak=new Thread(w);
		Thread rani=new Thread(w);
		
		sarthak.setName("mani.....");
		rani.setName("rani  ...");
		
		
		sarthak.start();
		mayuri.start();
		rani.start();
		
		
		
		
	}

}
