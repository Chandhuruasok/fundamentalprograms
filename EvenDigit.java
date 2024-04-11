package com.task1.day1;
import java.util.*;
public class EvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num,i,r;
		System.out.println("enter the number:");
		num=scan.nextInt();
		if(num<0)
		{
			System.out.println("please enter positive value");
			num=scan.nextInt();
		}
		while(num>0)
		{
			r=num%10;
			if(r%2==0)
			{
				System.out.println("even number is:"+r);
			}
			num/=10;
		}
	}

}
