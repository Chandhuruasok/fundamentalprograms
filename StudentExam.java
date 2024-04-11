package com.task1.day1;
import java.util.*;
public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

        
        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();
        
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
        
        if (attendancePercentage < 75) {
            System.out.println("Student is not allowed to sit in the exam.");
            
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);
            
            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("Student is allowed to sit in the exam due to medical cause.");
            } else {
                System.out.println("Student is not allowed to sit in the exam.");
            }
        } else {
            System.out.println("Student is allowed to sit in the exam.");
        }
		
		
	}

}
