package com.task1.day1;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("enter the n value:");
		n=s.nextInt();
		if(n<0)
		{
			System.out.print("enter positive no");
			n=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.print("odd number:"+i+" ");
			}
			else if(i%2==0)
			{
				System.out.print("even number:"+i+" ");
			}
			System.out.println();
		}

	}

}
