import java.util.ArrayList;
public class Player {

	final int MAX_CREW_NUM = 20; // Only allow this many crew members
	int crewNum = MAX_CREW_NUM;
	int sanity = 100; // If sanity hits 0 then execute game over
	ArrayList<Officer> officersOnboard;
	ArrayList<String> cluesRevealed;
	int  mechanismsLocked = 4; // How many islands that need to be solved
	Island currentIsland;
	
	public Player() {
		
	}
	

}
