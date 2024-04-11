package com.clg.sand;
import java.util.*;
public class Fahren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the celsius:");
		int celsius=s.nextInt();
		double farenheit=(celsius*1.8)+32;
		System.out.println("farenheit"+farenheit);
		if(farenheit>90&&farenheit<100)
		{
			System.out.println("Chennai");
		}
		else if(farenheit>80&&farenheit<=90)
		{
			System.out.println("Madurai");
		}
		else if(farenheit>70&&farenheit<=80)
		{
			System.out.println("Trichy");
		}
		else
		{
			System.out.println("not valid");
		}
	}
	
}
