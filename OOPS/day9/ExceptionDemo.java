package day9;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a[]=new int[5];
		// TODO Auto-generated method stub
		System.out.println("HELLO MUMBAI");
		System.out.println("HELLO PUNE");
		try {
			System.out.println(1/1);
			System.out.println("welcome to java programming");
			a[7]=90;
			System.out.println("welcome to exception handling");
			
		}
		catch(ArithmeticException e)
		{
		System.out.println("successful ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ARRAY INDEX OUT OF BOUND EXCEPTION..");
		}
		System.out.println("bye mumbai..");
		System.out.println("bye pune..");

	}

}
