import java.util.HashMap;

public class Officer {
	public String description; // "Name, Title"
	public String clue;
	static public HashMap<String, Officer> allOfficers = new HashMap<String, Officer>();

	public Officer(String des, String clu) {
		description = des;
		clue = clu;
	}
	
	static public boolean initOfficers() {
		Officer x = new Officer("The daughter of the mayor doesn't stop talking. /nShe is young, and she needs more stories. /nShe joined your ship as a Quartermaster.",
										"Your Quartermaster tells you of the place where all go to rest, somewhere north of the weather vane.");
		allOfficers.put("sealMaiden", x);
		return true;
	}
	
}
