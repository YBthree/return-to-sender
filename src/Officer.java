import java.util.ArrayList;

public class Officer {
	public String name;
	public String description; // "Name, Title"
	public String clue;
	static public ArrayList<Officer> allOfficers = new ArrayList<Officer>();

	public Officer(String nam, String des, String clu) {
		name = nam;
		description = des;
		clue = clu;
	}
	
	static public boolean initOfficers() {
		Officer x = new Officer("sealMaiden", "The daughter of the mayor rarely speaks. /nShe is young, and she needs more stories. /nShe joined your ship as a Quartermaster.",
										"Your Quartermaster tells you of the place where all go to rest, somewhere north of the weather vane.");
		allOfficers.add(x);
		return true;
	}
	
}
