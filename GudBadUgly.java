package com.chainsys.dot;
import java.util.*;
public class GudBadUgly {
	public static int hault(int sum,int n)
	{
		int i;
		sum=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a,sum;
		a=hault(sum,n);
		if(a*2==sum)
		{
			System.out.println("perfect no");
		}
		else
		{
			System.out.println("not a perfect no");
		}
		System.out.println();
	}

}
