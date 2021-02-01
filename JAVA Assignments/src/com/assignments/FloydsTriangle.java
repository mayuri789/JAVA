package com.assignments;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k=1,n;
        System.out.print("Enter how many lines u want : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           
            for(j=1;j<=i;j++)
            {
                
                System.out.print(" *");
                k++;
            }
            System.out.println("");
        }

	}

}
