package com.clg.sand;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name:");
		String n=s.next();
		System.out.println("name:"+n);
		System.out.println("enter the registration no:");
		String no=s.next();
		System.out.println("num:"+no);
		System.out.println("enter the father's name:");
		String f=s.next();
		System.out.println("father:"+f);
		System.out.println("whether you have id or not:");
		boolean id=s.nextBoolean();
		System.out.println(id);
		System.out.println("enter the blood group:");
		String c=s.next();
		System.out.println("+ve:"+c);
		System.out.println("enter the mother's name:");
		String m=s.next();
		System.out.println("mother:"+m);
		System.out.println("enter the city:");
		String add=s.next();
		System.out.println("city:"+add);
		

	}

}
