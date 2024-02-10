/************************
#     Nested Loops      #
************************/
// Author:   Laurence Burden
// Date:     3 May 2021

import java.util.Scanner;

public class Unit2_NestedLoop {

	public static void main(String[] args) {
		// Initialize variables
		Scanner sc = new Scanner(System.in);
		int userNumber, usrNumHalved;
		
		// Get user number and it's half
		System.out.print("Enter a number between 1 and 10: ");
		userNumber = Integer.parseInt(sc.nextLine());
		usrNumHalved = userNumber / 2;
		
		// Clean up scanner
		sc.close();
		
		// Check for input in range
		if(userNumber >= 1 && userNumber <= 10) {
			// Outer loop
			for(int i=1; i<=userNumber; i++) {
				// Print outer loop step
				System.out.println("Outer loop Step: " + i);
				
				// Inner loop
				for(int j=1; j<=usrNumHalved; j++) {
					// Print inner loop step
					System.out.println("....Inner Loop Step: " + j);
				}
			}	
		} else {
			System.out.println("Invalid selection");
		}
		
	}

}
