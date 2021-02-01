package com.assignments;

import java.util.Scanner;

public class NumberSeries {
	
	static int calculateSum(int n)  
	{ 
	return (int)Math.pow(n * (n + 1) / 2, 2);  
	}  
	  
	// Driver code  
	  
	  
	    public static void main (String[] args) { 
	        int n = 4;  
	    System.out.println( calculateSum(n));  
	  
	    } 
	
}


