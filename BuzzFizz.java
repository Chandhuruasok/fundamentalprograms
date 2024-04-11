package com.task1.day1;
import java.util.*;
public class BuzzFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp=new Scanner(System.in);
		int nb,i;
		System.out.println("enter the number:");
		nb=sp.nextInt();
		if(nb<0)
		{
			System.out.println("enter positive no");
			nb=sp.nextInt();
		}
		for(i=1;i<=nb;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");

			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
				
			}
		}

	}

}
