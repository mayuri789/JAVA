package day9;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int result=0;
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter two number");
			System.out.println("enter a value");
			int a= sc.nextInt();
			System.out.println("enter 2nd value");
			int b= sc.nextInt();
		 result=a/b;
		 String name=null;
		 System.out.println(name.length());
		}
		
		
		catch(ArithmeticException |NullPointerException obj) {
			System.out.println("do not enter zero");
			obj.printStackTrace();
		}
		
		catch(Exception e)
		{
		System.out.println("hiiii....");
		}
		System.out.println(" result : "+result);

	}
}
