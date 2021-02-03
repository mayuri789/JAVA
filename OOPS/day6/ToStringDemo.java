package day6;
class Employee
{
	int id;
	String name;
	 
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class ToStringDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee(1, "mayuri"); 
		Employee emp2=new Employee(2, "Nishi");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}

}
