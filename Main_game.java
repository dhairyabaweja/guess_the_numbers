import java.util.Scanner;
import java.util.ArrayList;

public class Main_game {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		Scanner scan = new Scanner(System.in);
		
		SimpleDotCom theDot = new SimpleDotCom();
		
		int random = (int)(Math.random()*15);
		String val = String.valueOf(random);
		String valu = String.valueOf(random+1);
		String value = String.valueOf(random+2);
		ArrayList<String> locations = new ArrayList<String>();
		locations.add(val);
		locations.add(valu);
		locations.add(value);
		SimpleDotCom.setLocations(locations);
		boolean isalive  = true;
		
		while(isalive == true) {
			System.out.println("enter a number");
			String guess = scan.nextLine();
			String result = theDot.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("kill")) {
				isalive = false;
				System.out.println("you took " + numOfGuesses + " guesses.");
			}
		}
	}

}
