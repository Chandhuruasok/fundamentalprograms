package com.clg.sand;
import java.util.*;
public class Hospital {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the hospital name");
		String hos_name=s.next();
		System.out.println("Hospital name:"+hos_name);
		System.out.println("enter the number of wards");
		int wards=s.nextInt();
		System.out.println("no of wards:"+wards);
		System.out.println("enter the no of ambulances");
		int amb=s.nextInt();
		System.out.println("ambulance:"+amb);
		System.out.println("where there is emergency ward");
		boolean icu=s.nextBoolean();
		System.out.println(icu);
		System.out.println("enter the number of doctors");
		int doc=s.nextInt();
		System.out.println("no of doctors:"+doc);
		System.out.println("enter the number of nurses");
		int nur=s.nextInt();
		System.out.println("no of nurse:"+nur);
		
	}

}
