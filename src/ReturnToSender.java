
public class ReturnToSender {
	
	Player player;

	public static void main(String[] args) {
		new ReturnToSender();
	}
	
	ReturnToSender(){
		boolean playing = true;
		String command = "";
		
		setUp();
		
		while (playing) {
			command = getCommand();
			playing = parseCommand(command);
		}
		
	}
	
	

}
