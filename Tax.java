package com.task1.day1;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your gross salary: ");
		if (!scanner.hasNextDouble()) {
			System.err.println("Invalid input. Please enter a numeric value for gross salary.");
			scanner.close();
			return;
		}
		double grossSalary = scanner.nextDouble();

		System.out.print("Enter your total saving: ");
		if (!scanner.hasNextDouble()) {
			System.err.println("Invalid input. Please enter a numeric value for total saving.");
			scanner.close();
			return;
		}
		double totalSaving = scanner.nextDouble();

		// Validate inputs
		if (grossSalary < 0 || totalSaving < 0) {
			System.err.println("Invalid input. Salary and savings cannot be negative.");
			scanner.close();
			return;
		}

		// Deduct savings from gross salary
		double taxableIncome = grossSalary - Math.min(totalSaving, 100000);

		// Tax slabs
		double slab1Limit = 100000;
		double slab2Limit = 200000;
		double slab3Limit = 500000;

		// Tax rates
		double slab1Rate = 0.10;
		double slab2Rate = 0.20;
		double slab3Rate = 0.30;

		// Tax calculation
		double tax = 0;
		if (taxableIncome <= slab1Limit) {
			tax = 0;
		} else if (taxableIncome <= slab2Limit) {
			tax = (taxableIncome - slab1Limit) * slab1Rate;
		} else if (taxableIncome <= slab3Limit) {
			tax = (slab1Limit - 0) * slab1Rate + (taxableIncome - slab2Limit) * slab2Rate;
		} else {
			tax = (slab1Limit - 0) * slab1Rate + (slab2Limit - slab1Limit) * slab2Rate
					+ (taxableIncome - slab3Limit) * slab3Rate;
		}

		// Print tax
		System.out.println("Your tax is: " + tax);

	}

}
