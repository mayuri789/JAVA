package FileNotFoundException;

import java.io.IOException;

class Attendance
{
	void loginTime(int time) throws IOException {
		if(time>9)
		{
			//throw new ArithmeticException("YOU ARE ABSENT");
			throw new IOException("you are absent");
		}
		else
		{
			System.out.println("YOU ARE PRENSENT");
		}
	}
}

public class ThrowsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Attendance attendance =new Attendance();
		attendance.loginTime(10);

	}

}
