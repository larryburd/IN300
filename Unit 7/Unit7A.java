package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Unit7A {
	public static void main(String[] args) {
		// Read file into an array
		Scanner scanner;
		int [] result = new int[250000];
		int i = 0, modeCnt = 0, tempCnt = 0, sdSum = 0;
		double median = 0, mid1 = 0, mid2 = 0, mode = 0;
		
		try {
			scanner = new Scanner(new File("C://Users//laure//OneDrive//Documents//Purdue//IN300 - Programming for Data Analysis//Unit 7//IN300_Dataset2.txt"));
			while(scanner.hasNextInt()) {
				result[i++] = scanner.nextInt();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		// Find the mean
		OptionalDouble mean = Arrays.stream(result).average();
		
		if(mean.isPresent()) {
			System.out.println("The mean is: " + mean.getAsDouble());
		} else {
			System.out.println("No values to average.");
		}
		
		// Median
		if(result.length % 2 == 0) {
			mid1 = result[(result.length/2) - 1];
			mid2 = result[(result.length/2)];
			median = (mid1 + mid2) / 2;
		} else {
			median = result[(result.length/2) - 1];
		}
		
		System.out.println("The median is: " + median);
		
		// Mode
		for(double intValue : result) {
			tempCnt = 0;
			for(double value : result) {
				if(intValue == value) {
					tempCnt++;
				}
			}
			if(tempCnt > modeCnt) {
				modeCnt = tempCnt;
				mode = intValue;
			}
		}
		
		System.out.println("Mode " + mode + " appears " + modeCnt + " times.");
		
		// Standard Deviation
		for(double dValue : result) {
			sdSum += Math.pow((dValue - mean.getAsDouble()), 2);
		}
		
		System.out.println("The standard deviation is: " + Math.sqrt(sdSum / ( result.length ) ));
		
		
		
	}
}
