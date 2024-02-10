/************************
#     Book Categories   #
************************/
// Author:   Laurence Burden
// Date:     3 May 2021

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Unit2_BookCategories {

	public static void main(String[] args) {
		// Initial variables
		Scanner sc = new Scanner(System.in);
		int userSelection = 0;
		Map<Integer, String> menuOptions = new HashMap<Integer, String>();
		
		// Build menu items map
		menuOptions.put(1, "Science Fiction");
		menuOptions.put(2, "Computers and Technology");
		menuOptions.put(3, "Cooking");
		menuOptions.put(4, "Business");
		menuOptions.put(5, "Comics");
		menuOptions.put(6, "Exit");
		
		// Display program title
		System.out.println("BOOK CATEGORY SELECTOR");
		
		// Main system loop
		while(true) {
			// Print menu
			System.out.println("***Select from the following options***");
			for(Map.Entry<Integer, String> entry : menuOptions.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
			
			// Get user selection
			System.out.print("Your selection: ");
			userSelection = Integer.parseInt(sc.nextLine());
			
			// Blank line
			System.out.println();
			
			// Provide feedback based on selection
			if (userSelection == 1) {
				System.out.println("You have selected Science Fiction.  Check out Stranger in a Strange Land.");
			} else if (userSelection == 2) {
				System.out.println("You have selected Computers and Technology.  *Beep Boop*");
			} else if (userSelection == 3) {
				System.out.println("You have selected Cooking.  Be sure not to burn the water!");
			} else if (userSelection == 4) {
				System.out.println("You have selected Business.  Charts and graphs everywhere!");
			} else if (userSelection == 5) {
				System.out.println("You have selected Comics.  Faster than a speeding bullet!");
			  // Exit condition
			} else if (userSelection == 6) {
				System.out.println("Exiting...");
				break;
			} else {
				System.out.println("Invalid Selection");
			}
			
			// Blank lin
			System.out.println();
		}
		
		// Cleanup Scanner
		sc.close();
	}

}
