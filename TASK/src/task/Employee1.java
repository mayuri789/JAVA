
//question -3

package task;


class Emplo
{
	
	private String fName;
	private String lName;
	public Emplo(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	
	
	
	void Emplo(String fName, String lName)
	{
		
		System.out.println("first name : "+fName+ "last name : "+lName);
		
	}
	
	
}

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
		Emplo e=new Emplo(null,null );
		}
		catch(NullPointerException ne)
		{
			System.out.println("entry is missing ");
		}
	}

}
