package day3;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,4,1,9,5,12,1,0};
		for(int i=0;i<a.length;i++)
		{
		
			System.out.println(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		int index= Arrays.binarySearch(a, 9);
		System.out.println("binary search"+index);

	}

}
