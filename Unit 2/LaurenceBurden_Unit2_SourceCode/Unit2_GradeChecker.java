/************************
#     Grade Checker     #
************************/
// Author:   Laurence Burden
// Date:     3 May 2021

import java.util.Scanner;

public class Unit2_GradeChecker {

	public static void main(String[] args) {
		// Scanner to receive user input
		Scanner sc = new Scanner(System.in);
		
		// Variable initialization
		int gradePercent = 0;
		String letterGrade = "";
		
		// Get grade percent from user
		System.out.println("Enter the grade percent: ");
		gradePercent = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		// Set relevant letter grade
		if (gradePercent <= 100 && gradePercent >= 90) {
			letterGrade = "A";
		} else if(gradePercent <= 89 && gradePercent >= 80) {
			letterGrade = "B";
		} else if(gradePercent <= 79 && gradePercent >= 70) {
			letterGrade = "C";
		} else if(gradePercent <= 69 && gradePercent >= 60) {
			letterGrade = "D";
		} else if(gradePercent <= 59 && gradePercent >=0) {
			letterGrade = "F";
		} else {
			letterGrade = "INVALID GRADE";
		}
		
		// Print letter grade to user
		System.out.println("You recieved an " + letterGrade);
		
	}

}
