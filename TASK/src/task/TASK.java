package task;

import java.util.Scanner;

public class TASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter the elements of an array : ");
			
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("enter the age : ");
		int age1=sc.nextInt();

		
		
			if(age1>0 && age1<18)
			{
				System.out.println("children ");
			}
			else if(age1>18 && age1<=54)
			{
				System.out.println("adult ");
			}
			else
			{
				System.out.println(" Senior citizon .. ");
			}
		
		
		

	}

}
