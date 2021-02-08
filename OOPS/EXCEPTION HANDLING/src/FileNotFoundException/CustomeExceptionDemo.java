package FileNotFoundException;
class LateException extends Exception
{
	String msg;
	public LateException(String msg)
	{
		super();
		this.msg=msg;
		System.out.println("this is constructor"+msg);
		
		
	}
	@Override
	public String toString() {
		return "LateException [msg=" + msg + "]";
	}
	
}
class StudentAttendance
{
	void loginTime(int time)throws LateException
	{
		if(time>9)
		{
			throw new LateException("you are absent");
		}
		else
		{
			System.out.println("present");
		}
	}
}

public class CustomeExceptionDemo {

	
	
	public static void main(String[] args) throws LateException {
		// TODO Auto-generated method stub
StudentAttendance studentAttendace =new StudentAttendance();
	studentAttendace.loginTime(8);
	
	
//	try
//	{
//		studentAttendace.loginTime(10);
//	}
//	catch(LateException e)
//	{
//		System.out.println(" come before 9.. ");
//	}
	}

}
