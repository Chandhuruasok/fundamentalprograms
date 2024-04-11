package com.task1.day1;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,r,sum=0;
		System.out.println("enter the number:");
		n=s.nextInt();
		if(n<0)
		{
			System.out.println("enter positive no");
			n=s.nextInt();
		}
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n/=10;
		}
		System.out.println("sum of digits="+sum);
		
	}

}

