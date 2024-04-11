package com.task1.day1;
import java.util.*;
public class Facinating {

	public static void main(String[] args) {
		int num, mul2, mul3;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter any Number: ");
	    num = sc.nextInt();
	    if(num<0 )
	    {
	    	System.out.println("enter correct value:");
	    	num = sc.nextInt();
	    }
	    mul2 = num * 2;
	    mul3 = num * 3;
	    String str = num + "" + mul2 + mul3;
	    boolean flag = true;
	    for(char ch = '1'; ch <= '9'; ch++)
	    {
	      int count = 0;
	      for(int i = 0; i < str.length(); i++)
	      {
	        char ch2 = str.charAt(i);
	        if(ch2 == ch)
	          count++;
	      }
	      if(count > 1 || count == 0)
	      {
	        flag = false;
	        break;
	      }
	    }
	    if(flag)
	      System.out.println(num + " is a fascinating number.");
	    else
	      System.out.println(num + " is not a fascinating number.");
	  }
	  

}
