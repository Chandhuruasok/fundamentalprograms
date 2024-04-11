package com.clg.sand;
import java.util.*;
public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your fav food:");
		int food=s.nextInt();
		switch(food)
		{
		case 0:
			System.out.println("Biriyani");
			break;
		case 1:
			System.out.println("Fried Rice");
			break;
		case 2:
			System.out.println("Noodles");
			break;	
		case 3:
			System.out.println("Parotta");
			break;
		case 4:
			System.out.println("Chicken 65");
			break;
		case 5:
			System.out.println("Idly");
			break;	
		case 6:
			System.out.println("Dosa");
			break;
		default:
			System.out.println("None");
		}
	}

}
