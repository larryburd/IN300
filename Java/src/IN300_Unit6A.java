import java.util.Scanner;
import java.util.OptionalDouble;
import java.util.Arrays;
import java.io.File;

public class IN300_Unit6A {

	public static void main(String[] args) {
		// Read file into an array
		String filepath = "C://Users//laure//OneDrive//Documents//Purdue//IN300 - Programming for Data Analysis//Unit 7//IN300_Dataset2.txt";
		Scanner scanner = new Scanner(new File(filepath.trim()));
		int [] result = new int[25000];
		int i = 0;
		while(scanner.hasNextInt()) {
			result[i] = scanner.nextInt();
			i++;
		}
		
		// Find the mean
		OptionalDouble mean = Arrays.stream(result).average();
		
		

	}

}
