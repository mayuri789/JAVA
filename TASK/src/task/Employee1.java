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
	
	
	
	void validate() throws Exception
	{
		
		System.out.println("first name : "+fName+ " last name : "+lName);
		
		if (fName==null && lName==null)
		{
			throw new NullPointerException("entry is missing");
		}
		else if(fName.length()<3 && lName.length()<3)
		{
			throw new  Exception(" fname and lname must not be less than 3 ");
		}
		}
		
	
	
	
}

public class Employee1  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		try
		{
			Emplo e=new Emplo(null,null );
			e.validate();
			Emplo e1=new Emplo("aa","nn" );
			e.validate();
		}
		catch(NullPointerException ne )
		{
			System.out.println(ne);
		}
		
		
		
		
			
		
	}

}
