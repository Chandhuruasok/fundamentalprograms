package com.task1.day1;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		long  salary;
		int yoe;
		double netBonus,bonus;
		System.out.println("Enter the salary:");
		salary=st.nextLong();
		System.out.println("enter the year of experience:");
		yoe=st.nextInt();
		if(salary<0||yoe<0)
		{
			System.out.println("Enter positive no");
			yoe=st.nextInt();
		}
		if(salary>0)
		{
			if(yoe>5)
			{
				bonus=salary*5/100;
			    netBonus=salary+bonus;
			    System.out.println("netBonusamount:"+netBonus);
			}
			else
			{
				System.out.println("No bonus");
			}
		}

	}

}
