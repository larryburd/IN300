import java.util.Scanner;

public class Unit1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstNumber, secondNumber, thirdNumber;
		int sum, average;
		
		// Prompt for first number
		System.out.println("Enter your first number: ");
		firstNumber = sc.nextLine();
		
		// Prompt for second number
		System.out.println("Enter your second number: ");
		secondNumber = sc.nextLine();
		
		// Prompt for third number
		System.out.println("Enter your third number: ");
		thirdNumber = sc.nextLine();
		
		sc.close();
		
		// Get sum and average
		sum = Integer.parseInt(firstNumber) + 
			Integer.parseInt(secondNumber) + 
			Integer.parseInt(thirdNumber);
		
		average = sum / 3;
		
		// Display final results to user
		System.out.println("The sum of your numbers is: " + sum);
		System.out.println("The average of your numbers is: " + average);

	}

}
