package com.task1.day1;
import java.util.*;
import java.lang.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String sg=scan.next();
		char[] st=sg.toCharArray();
		int len=st.length;
		int i;
		for(i=0;i<len;i++)
		{
			System.out.println("index:"+i+"="+st[i]);
		}

	}

}
