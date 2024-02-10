import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class IN300_Unit6 {
	public static void main(String[] args) {
		try {
			// Read data into variable
			Scanner csvData = new Scanner(new File("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit 6\\IN300_Dataset1.csv"));
			
			ArrayList<String> dataList = new ArrayList<String>();
			
			// Loop through data and add to array list
			while (csvData.hasNext()) {
				dataList.add(csvData.nextLine());
			}
			
			// Convert the array list to multidimensional array
			String[] tempArr = dataList.toArray(new String[1]);
			String[][] csvArray = new String[tempArr.length][];
			
			// Print row num, source, and destination IP
			for(int i=0; i < tempArr.length; i++) {
				csvArray[i] = tempArr[i].split(",");
				System.out.println("Row: " + csvArray[i][0] + " " +
									"Source IP: " + csvArray[i][2] + " " +
									"Dest IP: " + csvArray[i][3]);
			}
		} catch (Exception ex) {
			// Print error message
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}
