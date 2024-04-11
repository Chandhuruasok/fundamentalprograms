package com.task1.day1;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,j,i,k;
		System.out.println("enter the number:");
		n=s.nextInt();
		if(n<0)
		{
			System.out.println("enter positive no");
			n=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=n;i>0;i--)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
