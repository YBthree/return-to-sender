import java.util.ArrayList;
public class Island {
	
	Officer officerOnIsland;

	public Island(Officer off) {
		officerOnIsland = off;
	}
	

	static public boolean initIsland() {
		Island seal = new Island(Officer.allOfficers.get("sealMaiden"));
		return true;
	}
}
