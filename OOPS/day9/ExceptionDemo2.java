package day9;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		
		int size=scan.nextInt();
	    int arr[]=new int [size];
		System.out.println("enter the array length: "+arr.length);
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		//TAKING USER INPUT 
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the element : ");
			arr[i]=scan.nextInt();
		}
	
		System.out.println(".......................");
		

		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("enter the index number to fetch the elemnt :" );
		int index=scan.nextInt();
		
		try {
			System.out.println("element at index : " + index + " is "+arr[index]);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("index out of bound exception ... ");
		}
	}

}
