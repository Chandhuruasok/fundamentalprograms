package com.task1.day1;
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int quantity;
		double cost;
		System.out.println("Enter the quantity:");
		quantity=sc.nextInt();
		if(quantity<0)
		{
			System.out.println("enter positive no");
			quantity=sc.nextInt();
		}
		if(quantity>0)
		{
			cost=(quantity*100)-(0.1*(quantity*100));
			if(cost>1000)
			{
				System.out.println("cost after discount:"+cost);
			}
			else
			{
				cost=quantity*100;
			    System.out.println("cost without discount:"+cost);
			}
		}
		

	}

}
