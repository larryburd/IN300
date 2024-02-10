import java.util.*;
public class Expirement {
	public static void main(String[] args) {
		// Create a hash map
		HashMap<String, Integer> hmExample = new HashMap<String, Integer>();
		
		// Populate has map
		hmExample.put("Laurence", 35);
		hmExample.put("George", 28);
		hmExample.put("Sarah", 31);
		
		// Prints {George=28, Sarah=31, Laurence=35}
		// Note that original order is not preserved
		System.out.println(hmExample);
		
		// Prints 31
		System.out.println(hmExample.get("Sarah"));
	}
}
