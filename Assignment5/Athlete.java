import java.util.*;

public class Athlete {
/*
	An Athlete object represents an athlete from the perspective of their performance in a particular race.
	It stores their race number and a list of their split times.
*/
	// instance variables
	private String  raceNumber;
	private ArrayList<SplitTime> splitTimes;

	// Constructor
	public Athlete(String raceNumber, ArrayList<SplitTime> splitTimes) {
		// Create an Athlete object that represents the athlete with the given race number
		// and list of split times (ordered by distance).

		this.raceNumber = raceNumber;
		this.splitTimes = splitTimes;
	}	

	// Methods
	public String getRaceNumber() {
		// Obtain the race number.
		return raceNumber;
	}

	public int getNumTimes() {
		// Obtain the number of split times recorded for this Athlete (i.e. length of split times list.)
		return splitTimes.size();
	}

	public String toString() {
		/*
			// Obtain a String representation of this object in the form
			// "<race number> [<split time>, <split time, …, <split time>]".
			// A split time consist of an integer, followed by a minus sign, followed by a time.
			// e.g. "104578 [00:06:57@2, 00:13:54@4, 00:20:59@6]".
		*/
		return raceNumber + " " + splitTimes.toString();
	}
	
	// main method is just for testing the program
	public static void main(String[] args) {
		 ArrayList<SplitTime> t = new ArrayList<SplitTime>();
		 t.add(new SplitTime(new Time(0, 6, 57), 2));
		 t.add(new SplitTime(new Time(0, 13, 54), 4));
		 Athlete athlete = new Athlete("104566", t);
		 System.out.println(athlete.getNumTimes());
		 System.out.println(athlete);
	}	
}
