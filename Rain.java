package com.task1.day1;

import java.util.*;

public class Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Is it raining?(Y/N)");
		char rain = s.next().charAt(0);
		int temp;
		if (rain == 'N' || rain == 'n') {
			System.out.println("no need of umbrella");
			rain = s.next().charAt(0);
		}

		if (rain == 'Y' || rain == 'y') {
			System.out.println("Bring an umbrella");
			System.out.println("enter the temperature:");
			temp = s.nextInt();
			if (temp < 32) {
				System.out.println("Bring heavy jacket");
			} else if (temp > 32 && temp < 52) {
				System.out.println("Bring light jacket or not at all");
			} else {
				System.out.println("ERROR");
			}
		}
		else
		{
			System.out.println("error");
		}

	}

}
