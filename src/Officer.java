
public class Officer {
	public String description; // "Name, Title"
	public String clue;
	public String flavour;

	public Officer(String des, String clu, String fla) {
		description = des;
		clue = clu;
		flavour = fla;
	}
	
	public boolean initOfficers() {
		Officer engineer = new Officer("some description", "some clue", "some flavour");
		return true;
	}
	
}
