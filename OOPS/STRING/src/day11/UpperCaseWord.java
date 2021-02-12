package day11;

public class UpperCaseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=" i am in pune";
		String arr[]=	name.split("a");
		int a[]= {1,2,3};

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);	



		for(int x:a)
		{

			System.out.println(x);
		}

	}
}
