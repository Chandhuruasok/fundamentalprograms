package com.task1.day1;
import java.util.*;
import java.lang.*;
public class MethodsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a="Chainsys";
		System.out.println("Enter the string:");
		String str=s.next();
		String trs=str.toLowerCase();//converts to lowercase
		String rts=str.toUpperCase();//converts to uppercase
		System.out.println("Lowercase:"+trs+"\n"+"Uppercase:"+rts);
		System.out.println("replace old with new character:"+a.replace('s', 'n'));
		
	}

}
