package day7;
class Employee
{
	int id;
	String name;
	Address ad;// entity or object reference
	
	
	public Employee(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}

	void displayInfo()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("ad : "+ad.city);
	}
	
}


class Address
{
	int doorNo;
	String streetname;
	String city;
	
	public Address(int doorNo, String streetname, String city) {
		super();
		this.doorNo = doorNo;
		this.streetname = streetname;
		this.city = city;
	}
	void displayInfo()
	{
		System.out.println("DOOR :"+doorNo);
		System.out.println("STREET NAME :"+streetname);
		System.out.println("CITY  : "+city);
	}
	

}

public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Address addr=new Address(456, "aundh","pune");
  Employee emp=new Employee(1,"MAYURI",addr);
  emp.displayInfo();
  
  
	}

}
