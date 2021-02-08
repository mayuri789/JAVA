package FileNotFoundException;

class AgeException extends Exception{
	
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "AgeException [msg=" + msg + "]";
	}
	
	
	
}

class User{
	

	 void checkAge(int age)throws AgeException
	 {
		 if(age<18)
		 {
			 System.out.println("age is less than 18...");
		 }
		 else
		 {
			 System.out.println("Age is greater than 18 ...");
		 }
	 }
	
	
}

public class TestDemo {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.checkAge(8);

	}

}
