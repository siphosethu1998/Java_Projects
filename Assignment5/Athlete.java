import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

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
	
	public Athlete(String dataLine) {
		// Create an Athlete object using the data in the given String.
		// The String should have the form <race number> [<split time>, ..., <split time>]
		// i.e. a race number, followed by a space, followed in square brackets by a list
		// of zero or more comma separated split time strings.
		// e.g. 131005 [00:06:57@2, 00:10:05@4]

		/*
		raceNumber = dataLine.substring(0,7);
		String splitTimeLine = dataLine.substring(7);
		splitTimeLine = splitTimeLine.substring(1,splitTimeLine.indexOf("]")); // string will be like "00:06:57@2, 00:01:05@4"
		System.out.println(splitTimeLine); 
		String[] splitTimeArray = splitTimeLine.split(",");
		System.out.println(Arrays.toString(splitTimeArray));
		splitTimes = new ArrayList<SplitTime>();

		for (int i=0; i<splitTimeArray.length; i++) {
			String splitTime = splitTimeArray[i];
			
			splitTimes.add(new SplitTime(splitTime));
		}
		*/
		this.raceNumber = dataLine.substring(0, dataLine.indexOf("[")).trim();
		dataLine = dataLine.substring(dataLine.indexOf("[")+1, dataLine.length()-1).trim();
		Scanner scanner = new Scanner(dataLine);
		scanner.useDelimiter("\\s*,\\s*");
		this.splitTimes = new ArrayList<SplitTime>();
		while (scanner.hasNext()) {
			this.splitTimes.add(new SplitTime(scanner.next()));
		}
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

	public Time getTimeAtWaypoint(int distanceA) {
		// Obtain the time taken by the athlete to reach the waypoint at the given distance.
		// Returns null if there is no data for the given distance.
		for(int i=0; i<splitTimes.size(); i++) {
			if(distanceA == splitTimes.get(i).getDistance()) {
				return splitTimes.get(i).getTime();
			} 
		}
		return null;
	}
	
	public Time getWaypointInterval(int distanceA, int distanceB) {
		// Obtain the time taken by the athlete to run from the waypoint at distance A
		// to the waypoint at distance B.
		// Assume that distanceA≤distanceB.
		// Returns null if there is no data for one or other of the given distances.
		Time a = getTimeAtWaypoint(distanceA);
		Time b = getTimeAtWaypoint(distanceB);

		if(a != null & b != null) {
			return b.subtract(a);
		}

		return null;
	}

	public String toString() {
		// Obtain a String representation of this object in the form
		// "<race number> [<split time>, <split time, …, <split time>]".
		// A split time consist of an integer, followed by a minus sign, followed by a time.
		// e.g. "104578 [00:06:57@2, 00:13:54@4, 00:20:59@6]".
		return raceNumber + " " + splitTimes.toString();
	}
	
	// main method is just for testing the program
	public static void main(String[] args) {
		 /*ArrayList<SplitTime> t = new ArrayList<SplitTime>();
		 t.add(new SplitTime(new Time(0, 6, 57), 2));
		 t.add(new SplitTime(new Time(0, 13, 54), 4));
		 Athlete athlete = new Athlete("104566", t);
		 System.out.println(athlete.getNumTimes());
		 System.out.println(athlete); */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a line of athlete data:");

		String line = input.nextLine();

		Athlete athlete = new Athlete(line);
		
		System.out.println("The time at distance 2 is : "+athlete.getWaypointInterval(2, 4));
		System.out.println("Creating Athlete object.");
		System.out.println("Printing Athlete object:");
		System.out.println(athlete);
		System.out.println("Done.");

	}	
}
