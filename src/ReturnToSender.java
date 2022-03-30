import java.util.Scanner;


public class ReturnToSender {
	
	Player player;
	Island currentIsland;

	public static void main(String[] args) {
		new ReturnToSender();
	}
	
	ReturnToSender(){
		boolean playing = true;
		String command = "";
		
		setUp();
		
		Scanner sc = new Scanner(System.in);
		
		while (playing) {
			playing = parseCommand(getCommand(sc));
		}
		
		sc.close();
		
		

		
	}
	
	static void setUp() {
		//initialize player (ask name?)
		
		
		Officer.initOfficers();
		
		//initialize islands
		
		currentIsland = Island.allIslands.get("leifair");
		
		//print out intro text
		System.out.println("Your ship, The Acheron, drifts wistfully on the familiar Blighted Sea. \n"
				+ "You don't remember much other than that your captain led you on a dangerous mission. \n"
				+ "As soon as you shake off the grogginess, you rush into the captain's quarters. \n"
				+ "Nothing remains other than a pile of ash on the bed, and a half-burnt letter on the dresser. \n"
				+ "It reads: \"Take care of []. Bring it to []. Please.\" The edges of the burned holes in the paper are still searing. \n"
				+ "The letter continues: \"The ship is yours, " + Player.name + ". Be a better captain than I was.\""
				+ "There is no time to grieve, as the waters of the Blighted Sea is filled with danger, ever lurking. \n"
				+ "As you check the ship for damages, you notice a tall, black, looming box in the storage. It wasn't there before. \n"
				+ "Upon closer inspection, there is an inconspicious locking mechanism on one side, surrounded by four rings of gears. \n"
				+ "Otherwise, the box is completely sealed."
				+ "You go out on the deck, and breath a sigh of relief when you see the familiar faint glow of a lighthouse. \n"
				+ "Your remaining fuel just about gets you back to the capital city of District 21, Leifair. Its steam and soot welcomes you. \n");
		System.out.println();
		System.out.println("Game tip: read your journal to see the current state of your ship, and your progess. \n"
				+ "Maybe your crew will know what to do next. Ask them for clues. \n"
				+ "You can visit interesting locations on different islands. \n"
				+ "When you're ready, set sail to go back to the sea. \n"
				+ "There are multiple endings to this story. Have fun, and solve the mystery of the endowed box! \n");
		
		
		
	}
	
	String getCommand(Scanner sc1) {	
		String text = sc1.nextLine();
		if (text.length() == 0) text = "qwerty"; //default command
		return text;
	}
	
	boolean parseCommand(String in) {
		in = in.toLowerCase();
		
		String[] words = in.split(" ");
		
		switch (words[0]) {
		case "ask": //invoke player ask method
			break;
		case "set": //invoke player navigate method
			break;
		case "read": //invoke player toString method
			break;
		case "visit": //invoke island visit location method
			break;
		case "look": //invoke island/location toString method
			break;
		}
		
		return true;
	}
	
	
	
	

}
