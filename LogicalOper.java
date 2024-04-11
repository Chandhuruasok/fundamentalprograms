package com.task1.day1;
import java.util.*;
public class LogicalOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("enter the 1st value");
		a=s.nextInt();
		System.out.println("enter the 2nd value");
		b=s.nextInt();
		if(a<0&&b<0)
		{
			System.out.println("enter positive no");
			b=s.nextInt();
		}
		if(a>0&&b>0)
		{
		if(a>b && a>=b)
		{
		    System.out.println("a is greater than or equal to b");

		}
		else if(a<b && a<=b)
		{
			System.out.println("a is less than or equal to b");

		}
		else if(a==b)
		{
			System.out.println("a is equal to b");

		}
		else 
		{
			System.out.println("not valid");

		}
		}
	}
	}


