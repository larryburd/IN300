
public class Unit4 {

	// Create Packet enumeration
	enum Packet {
		SOURCE_IP,
		DESTINATION_IP,
		PROTOCOL,
		INFO
	}
			
	public static void main(String[] args) {
		// Loop through each enumeration value
		for(Packet p: Packet.values()) {
			// Print enum value and ordinal
			System.out.println("Packet, " + p + ", has an ordinal value of " + p.ordinal());
		}

	}

}
