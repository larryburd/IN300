import java.util.ArrayList;

public class Unit3 {

	public static void main(String[] args) {
		// Create array list and assign values
		ArrayList<String> trains = new ArrayList<String>();
		trains.add("Locomotive1");
		trains.add("Steam");
		trains.add("Locomotive2");
		trains.add("Diesel");
		trains.add("Locomotive3");
		trains.add("Electric");
		trains.add("Locomotive4");
		trains.add("Coal");
		trains.add("Locomotive5");
		trains.add("Wood");
		trains.add("Common");
		trains.add("Combined Engines");
		
		// Loop through each element
		// and print the locomotive number and the name
		for(int i = 0; i < trains.size(); i = i + 2) {
			System.out.println(trains.get(i) + ": " + trains.get(i + 1));
		}

	}

}
