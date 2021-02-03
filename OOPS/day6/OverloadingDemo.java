package day6;

public class OverloadingDemo {
	
	void DisplayInfo()
	{
		System.out.println("Default contructor..");
	}

	void DisplayInfo(int id)
	{
		System.out.println("id : "+id);
	}
	void DisplayInfo(String name)
	{
		System.out.println("Name :"+name);
	}
	


	void DisplayInfo(int id, String name)
	{
		System.out.println("id :"+id+" Name "+name);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverloadingDemo o= new OverloadingDemo();
o.DisplayInfo();
o.DisplayInfo(5);
o.DisplayInfo(4, "mayuri");
o.DisplayInfo("nishi");
	}

}
