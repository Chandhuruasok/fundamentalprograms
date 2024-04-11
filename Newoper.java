package com.clg.sand;

import java.util.Scanner;

public class Newoper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//marks
		int n=s.nextInt();
		if((n>90) && (n<100))
		{
			System.out.println("grade A");
		}
		else if((n>80)&&(n<=90))
		{
			System.out.println("grade B");
		}
		else if((n>70)&&(n<=80))
		{
			System.out.println("grade c");
		}
		else if((n>60) && (n<=70))
		{
			System.out.println("grade D");
		}
		else if((n>40)&&(n<=60))
		{
			System.out.println("grade E");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
