package com.task1.day1;
import java.util.*;
public class MultipliactionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,n,num;
		System.out.println("enter n:");
		n=s.nextInt();
		
		System.out.println("enter the num:");
		num=s.nextInt();
		if(n<0&&num<0)
		{
			System.out.println("Enter positive number:");
			n=s.nextInt();
			num=s.nextInt();
		}
		if(n<0 && num<0)
		{
			System.out.println("enter positive no");
		}
		for(i=0;i<n;i++)
		{
			System.out.println(i+"*"+num+"="+i*num);
		}

	}

}
