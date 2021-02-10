package task;

class Employee
{
	String firstName;
	String lastName;
	
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	void Employee(String firstName, String lastName)
	{
		System.out.println("first name is : " + firstName +"last name : " +lastName);
	}
	
	
	
	
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee(null, null);
		emp.Employee("MAYURI ", " MESTRY");
		

	}

}
