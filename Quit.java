package com.task1.day1;
import java.util.*;
public class Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int sum = 0;
        int product = 1;
        int count = 0;

        System.out.println("Enter integers (press 'q' to quit):");

        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                product *= num;
                count++;
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
                }
            }
        }

        // Calculate average
        double average = count == 0 ? 0 : (double) sum / count;

        // Print the average and product
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);

		
		

	}

}
