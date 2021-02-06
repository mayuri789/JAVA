package oopsInterface;


interface Bank
{
	void rateOfInterest();
	void accountOpenService();
}
interface Entertainment extends Bank{
	
}


class SBI implements Bank{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println(" 40%");
		
	}

	@Override
	public void accountOpenService() {
		// TODO Auto-generated method stub
		System.out.println("open ...");
		
	}
}



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 
	}

}
