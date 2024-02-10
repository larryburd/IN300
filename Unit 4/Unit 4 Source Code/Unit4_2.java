
public class Unit4_2 {
	
	// Create Packet enumeration
	enum Packet {
		SOURCE_IP,
		DESTINATION_IP,
		PROTOCOL,
		INFO
	}

	public static void main(String[] args) {
		// Declare the packet variables
		Packet p1, p2, p3, p4, p5;
		
		// Instantiate the variables
		p1 = Packet.INFO;
		p2 = Packet.DESTINATION_IP;
		p3 = Packet.PROTOCOL;
		p4 = Packet.SOURCE_IP;
		p5 = Packet.INFO;
		
		// Check p1's ordinal position to that of p3's and inform the user
		if(p3.compareTo(p1) < 0) {
			System.out.println("p1 comes before p3");
		} else {
			System.out.println("p1 does not comes before p3");
		}
		
		// Check if p1 and p5 are equal to each other and inform the user
		if(p1.equals(p5)) {
			System.out.println("p1 and p5 are equal");
		} else {
			System.out.println("p1 is NOT equal to p5");
		}
		
	}

}
