package day2;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice");
		int grade = sc.nextInt();
		
		

		if(grade>=90 && grade<=100)
			
		{
			System.out.println("your grade is A");
		}
		else if(grade>=80 && grade<=89)
		{
			System.out.println("your grade is B");
		}
		else if(grade>=70 && grade<=79)
		{
			System.out.println("your grade is C");
		}
		else
		{
			System.out.println("you are fail ");
		}
	}

}
