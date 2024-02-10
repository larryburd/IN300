import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Map.Entry;

public class Unit9 {

	public static void main(String[] args) {
		try(Scanner csvData = new Scanner(
				new File("C:\\Users\\laure\\OneDrive\\Documents\\Purdue\\IN300 - Programming for Data Analysis\\Unit9\\IN300_Dataset1.csv"))) {
			
			List<String> dataList = new ArrayList<String>();
			
			while(csvData.hasNext()) {
				dataList.add(csvData.nextLine());
			}
			
			String[] tempArray = dataList.toArray(new String[1]);
			String[][] csvArray = new String[tempArray.length][];
			
			// Array to slice data
			String sourceList[] = new String[tempArray.length];
			String destList[] = new String[tempArray.length];
			String protocolList[] = new String[tempArray.length];
			
			String sourceIP = null, destIP = null, protocol = null;
			
			// Fill the arrays
			for(int i = 0; i < tempArray.length; i++) {
				// Skip header row (first iteration)
				if(i == 0) continue;
				
				csvArray[i] = tempArray[i].split(",");
				sourceIP = csvArray[i][2];
				destIP = csvArray[i][3];
				protocol = csvArray[i][4];
				
				sourceList[i] = sourceIP;
				destList[i] = destIP;
				protocolList[i] = protocol;
			}
			
			// Get counts
			getOccurances("Source IP", sourceList);
			getOccurances("Destination IP", destList);
			getOccurances("Protocol", protocolList);
			
			
		} catch(Exception e) {
			System.out.println(e);
		}
				
	}
	
	private static void getOccurances(String message, String[] listData) {
		// Place array into a hash map for sorting
		Map<String, Integer> map = new HashMap<>();
		for(String key : listData) {
			if(map.containsKey(key)) {
				int occurance = map.get(key);
				occurance++;
				map.put(key,  occurance);
			} else {
				map.put(key, 1);
			}
		}
		
		Map<String, Integer> sortedMap = 
				map.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,
						(e1, e2) -> e2, LinkedHashMap::new));
		
		printMap(message, sortedMap);
	}
	
	private static void printMap(String message, Map<String, Integer> map) {
		System.out.println("\r\n \r\n" + "Printing " + message + "\r\n");
		
		// Print the sorted map
		map.forEach((key, value) ->
				System.out.println(key + " appeared " + value + " time(s)"));
	}

}
