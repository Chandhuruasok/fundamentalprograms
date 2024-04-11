package com.task1.day1;

import java.util.*;

public class Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Is it raining? (yes/no): ");
        String isRaining = scanner.nextLine();
        
        if (isRaining.equalsIgnoreCase("yes")) {
            System.out.println("It's raining. Get an umbrella.");
        }
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        
        if (temperature < 32) {
            System.out.println("It's cold. Bring a heavy jacket.");
        } else if (temperature >= 32 && temperature <= 50) {
            System.out.println("It's chilly. Bring a light jacket.");
        } else {
            System.out.println("It's warm. No jacket needed.");
        }

	}

}
