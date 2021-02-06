package day8;
abstract class Bank
{
	abstract void rateOfInterest();
	abstract void minimumBalance();
	
	void display()
	{
		System.out.println("SATURDAY OFF");
	}
}
class SBI extends Bank
{

	@Override
	void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("sbi bank");
		System.out.println("4%");
		
	}

	@Override
	void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("100rs");
	}
	
}
class Axis extends Bank
{

	@Override
	void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("...");
	}

	@Override
	void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("min bal 5000rs");
	}
	
}


public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new Axis();
b.display();
b.rateOfInterest();
b.minimumBalance();
	}

}

