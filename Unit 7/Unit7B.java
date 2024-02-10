package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Unit7B {

	public static void main(String[] args) {
		// Read file into an array
		Scanner scanner;
		int rows = 100, cols = 2500;
		int[][] my2dArray = new int[cols][rows];
		
		try {
			scanner = new Scanner(new File("C://Users//laure//OneDrive//Documents//Purdue//IN300 - Programming for Data Analysis//Unit 7//IN300_Dataset2.txt"));
			for(int i = 0; i < cols; i++) {
				for(int j = 0; j < rows; j++) {
					my2dArray[i][j] = scanner.nextInt();
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		// Copy a slice of the array
		int[][] newArray = Arrays.copyOfRange(my2dArray, 2, 5);
		
		for(int[] row : newArray) {
			System.out.println(Arrays.toString(row));
		}
		
		int[][] myNewArray = new int[3][];
		
		for(int i = 2, j = 0; i < 5; i++, j++) {
			myNewArray[j] = Arrays.copyOfRange(my2dArray[i], 2, 5);
			System.out.println(Arrays.toString(myNewArray[j]));
		}

	}

}
