package com.cab.fare;
import java.util.*;
public class CabFare1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name:");
		String name=scanner.next();
		
        System.out.print("Enter the km (1.Micro Rs.10/km)(2.Mini Rs.15/km)(3.Prime Rs.20/km): ");
        double distance = scanner.nextDouble();
        if(distance<0)
        {
        	System.out.print("Enter the km again(1.Micro Rs.10/km)(2.Mini Rs.15/km)(3.Prime Rs.20/km): ");
        	distance = scanner.nextDouble();
        }

        System.out.print("Enter Cab Type: ");
        String cabType = scanner.next();
        
        while(!cabType.equalsIgnoreCase("Micro") && !cabType.equalsIgnoreCase("Mini")&& !cabType.equalsIgnoreCase("prime"))
        {
        	System.out.print("Enter Cab Type again: ");
            cabType = scanner.next();
            
        }
        double cabFare = Fare.calculateCabFareAmount(distance,cabType);
        
        double discount = Fare.applyDiscountAmount(cabFare);
        double finalAmount = cabFare- discount;
        //double discount =f.applyDiscount(cabFare);
        System.out.println("Name:"+name);
        System.out.println("Cab Fare: Rs." + cabFare);
        //System.out.println("Total Bill Amount: Rs." + );
        System.out.println("Discount Applied: Rs." + discount);
        System.out.println("Final Bill Amount: Rs." + finalAmount);

        scanner.close();
    }

    /*public static double calculateCabFare(double distance, String cabType) {
        double cabRate = 0;
        switch (cabType) {
            case "Micro":
                cabRate = 10;
                break;
            case "Mini":
                cabRate = 15;
                break;
            case "Prime":
                cabRate = 20;
                break;
            default:
                return -1;
        }
        return distance * cabRate;
    }

    public static double applyDiscount(double cabFare) {
        double discount = 0;
        if (cabFare > 5000) {
            discount = 0.05 * cabFare;
        } else if (cabFare > 2000) {
            discount = 0.02 * cabFare;
        }
        return discount;*/

	}


