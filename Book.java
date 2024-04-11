package com.clg.sand;
import java.util.*;
public class Book {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the book name:");
		String book_name=s.next();
		System.out.println("bookname:"+book_name);
		System.out.println("Enter the author name:");
		String author_name=s.next();
		System.out.println("author name:"+author_name);
		System.out.println("Enter the number of pages:");
		int nop=s.nextInt();
		System.out.println("number of pages:"+nop);
		System.out.println("Enter the index page number:");
		int indexno=s.nextInt();
		System.out.println("indexno:"+indexno);
		System.out.println("Enter the year of publish");
		int yop=s.nextInt();
		System.out.println("year of publish:"+yop);
		System.out.println("enter the option gud/bad");
		boolean gg=s.nextBoolean();
		System.out.println(gg);
		
	}

}
