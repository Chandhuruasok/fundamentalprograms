package com.task1.day1;

import java.util.*;
import java.util.regex.Pattern;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		String emailCheck="^[\\w_+\\.]*[\\w_]\\@[\\w_+\\.]+[\\w]$";
		System.out.println("Enter the employee email id:");
		String email=s.next();
		Pattern pattern=Pattern.compile(emailCheck);
		while(!(pattern.matches(emailCheck,email)))
		{
			System.out.println("Please enter the correct employee id");
			email=s.next();
		}
		String passwordCheck="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8}$";
		System.out.println("Enter the employee password:");
		String password=s.next();
		Pattern p=Pattern.compile(passwordCheck);
		while(!(p.matches(passwordCheck,password)));
		{
			System.out.println("Please enter the correct employee password");
			password=s.next();
		}
		
		System.out.println("Successfully logged in");
	}

}
