package com.task1.day1;
import java.util.*;
public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int numberOfClassheld,numberOfClassattented;
		System.out.println("Enter the medical cause");
		char medicalCause=s.next().charAt(0);
		double percentage;
		System.out.println("Enter the number of class held");
		numberOfClassheld=s.nextInt();
		System.out.println("Enter the number of class attented");
		numberOfClassattented=s.nextInt();
		/*if(numberOfClassheld<0 && numberOfClassattented)
		{
			System.out.println("Enter the positive value:");
			System.out.println("Enter the number of class held");
			numberOfClassheld=s.nextInt();
			System.out.println("Enter the number of class attented");
			numberOfClassattented=s.nextInt();
		}*/
		percentage=numberOfClassattented/numberOfClassheld*100;
		if(percentage>75/100 || medicalCause=='Y')
		{
			System.out.println("Allowed to sit in exam");
		}
		else
		{
			System.out.println("Not allowed to sit");
		}
		
	}

}
