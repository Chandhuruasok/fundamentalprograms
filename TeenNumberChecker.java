package com.task1.day1;
import java.util.*;
public class TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		if(age<0)
		{
			System.out.println("Enter the age again:");
			age=s.nextInt();
		}
		System.out.println("Enter the age 1:");
		int age1=s.nextInt();
		if(age1<0)
		{
			System.out.println("Enter the age again:");
			age1=s.nextInt();
		}
		System.out.println("Enter the age 2:");
		int age2=s.nextInt();
		if(age2<0)
		{
			System.out.println("Enter the age again:");
			age2=s.nextInt();
		}
		System.out.println("Enter the age 3:");
		int age3=s.nextInt();
		if(age3<0)
		{
			System.out.println("Enter the age again:");
			age3=s.nextInt();
		}
		System.out.println(isTeen(age));
		System.out.println(hasTeen(age1, age2, age3));
		
	}
    public static  boolean isTeen(int num)
	{
		if (num>=13 && num<=19)
		{
			return true;
		}
		return false;
	}
	public static boolean hasTeen(int num1,int num2,int num3)
	{
		if(num1>=13 && num1<=19 || num2>=13 && num2<=19 || num3>=13 && num3<=19)
		{
			return true;
		}
		return false;
	}

	

}
