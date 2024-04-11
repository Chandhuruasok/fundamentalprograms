package com.task1.day1;
import java.util.*;
public class Semicolon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("enter a:");
		a=s.nextInt();
		System.out.println("enter b:");
		b=s.nextInt();
		if(a<0&&b<0)
		{
			System.out.println("Enter positive no");
			a=s.nextInt();
			b=s.nextInt();
		}
		if(a>b);
		{
			System.out.println("a is greater");
		}
		else;
		{
			System.out.println("b is greater");
		}


	}

}
