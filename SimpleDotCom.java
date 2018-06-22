import java.util.ArrayList;

public class SimpleDotCom {
	//private static int [] locations;
	//private int noOfHits=0;
	private static ArrayList<String> locations;
	
	public static void setLocations(ArrayList<String> loc) {
		locations = loc;
	}
	
	public String checkYourself(String userGuess) {
		//int guess = Integer.parseInt(userGuess);
		String result = "miss";
		int index = locations.indexOf(userGuess);
		if(index>=0) {
			locations.remove(index);
			if(locations.isEmpty()) {
				result = "kill";
			}
			else {
				result = "hit";
			}
		}
		
		System.out.println(result);
		return result;
	}
}
