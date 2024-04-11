package com.task1.day1;
import java.util.*;
import java.lang.*;
public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sk=new Scanner(System.in);
		System.out.println("Enter the string:");
		String cat=sk.next();
		String tom=cat.substring(3,6 );
		System.out.println("substring is:"+tom);
		System.out.println("endswith:"+cat.endsWith("a"));

	}

}
