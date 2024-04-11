package com.task1.day1;
import java.util.*;
import java.lang.String;
public class InputStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String a=s.next();
		System.out.println("Enter the string2:");
		String b=s.next();
		System.out.println("character of the specified index position is:"+a.charAt(0));//finds the character at specified position
		System.out.println("concatination of 2 string is:"+b.concat(a));//concatenates 2 strings
		System.out.println("length of 1st string:"+a.length()+" "+"length of 2nd string:"+b.length());//returns length of the string
		System.out.println("2 strings are equal or not:"+a.equals(b));//compares 2 string
		System.out.println("Is blank or not:"+a.isBlank());//returns blank or not
		System.out.println("Is empty or not:"+b.isEmpty());//returns empty or not
		System.out.println("Index value of the character is:"+b.indexOf('a'));//returns index position
		System.out.println("index value is:"+b.lastIndexOf('a'));
		
	}

}
