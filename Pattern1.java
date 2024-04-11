package com.task1.day1;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the n value:");
		n=s.nextInt();
		if(n<0)
		{
			System.out.println("enter positive no");
			n=s.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
