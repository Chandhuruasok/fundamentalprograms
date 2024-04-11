package com.task1.day1;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int no,i,j,k;
		System.out.println("enter n value:");
		no=sr.nextInt();
		if(no<0)
		{
			System.out.println("enter positive no");
			no=sr.nextInt();
		}
		for(i=no;i>0;i--)
		{
			for(j=0;j<no-i;j++)
			{
				System.out.print(" ");
			}
				for(k=0;k<2*i-1;k++)
				{
					if(k%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				System.out.println();
				}
		}
	}
