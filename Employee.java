package com.task1.day1;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age;
		char sex,maritalStatus;
		System.out.println("Enter the age:");
		age=s.nextInt();
		System.out.println("Enter the sex(M/F):");
		sex=s.next().charAt(0);
		System.out.println("enter the marital status(Y/N):");
		maritalStatus=s.next().charAt(0);
		if(sex=='F')
		{
			System.out.println("she will work only in urban areas");
		}
		else if(sex=='M')
		{
			if(age>20 && age<40)
			{
				System.out.println(" he may work in anywhere");
			}
			else if(age>40 && age<60)
			{
				System.out.println("he will work in urban areas only");
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		
		else
		{
			System.out.println("ERROR");
		}

	}

}
