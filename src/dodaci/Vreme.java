package dodaci;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Vreme {

	public static void main(String[] args) {
		LocalTime vrijeme = LocalTime.now (); // dobijte trenutno vrijeme
	    System.out.println ("Trenutno je: " + vrijeme); // ispišite vrijeme
	    vrijeme = vrijeme.truncatedTo (ChronoUnit.MINUTES); // odbacite milisekunde i nanosekunde
	    System.out.println ("Trenutno je: " + vrijeme); // ispišite vrijeme

	}

}
