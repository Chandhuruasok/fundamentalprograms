package com.clg.sand;
import java.util.*;
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the movie name:");
		String mvname=s.next();
		System.out.println("movie name:"+mvname);
		System.out.println("enter the director name:");
		String dirname=s.next();
		System.out.println("director name:"+dirname);
		System.out.println("enter the release year:");
		String yor=s.next();
		System.out.println("date:"+yor);
		System.out.println("enter the number of songs:");
		int songs=s.nextInt();
		System.out.println("songs:"+songs);
		System.out.println("enter the duration of movie:");
		double dur=s.nextFloat();
		System.out.println("duration:"+dur);
		

	}

}
