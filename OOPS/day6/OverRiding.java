package day6;
class Bank
{
	void rateOfInterest()
	{
		System.out.println("4%");
	}
}
class Axis extends Bank
{
	void rateOfInterest()
	{
		super.rateOfInterest();
		System.out.println("10%");
	}
}
class HDFC extends Bank{
	void rateOfInterest()
	{
		System.out.println("20%");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank axis =new Axis();
		Bank hdfc= new HDFC();
		axis.rateOfInterest();
		hdfc.rateOfInterest();
	}

}
