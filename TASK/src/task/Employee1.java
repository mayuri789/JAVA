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
		try {
		if (fName.length()<3 && lName.length()<3)
		{
			System.out.println("character should be less than 3");
		}
		else
		{
			System.out.println("");
		}
		}
		catch(Exception e)
		{
			System.out.println("successful...");
		}
		
	}
	
	
	
}

public class Employee1 {

	public static void main(String[] args) throws NullPointerException{
		// TODO Auto-generated method stub
		
		
		
		Emplo e=new Emplo(null,null );
		
		
			System.out.println("entry is missing ");
		
	}

}
