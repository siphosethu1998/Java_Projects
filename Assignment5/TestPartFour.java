import java.util.Iterator;
import java.util.Scanner;
/**
 * Write a description of class AutoTestOne here.
 * 
 * @author Siphosethu
 * @version 26 Jan 2022
 */

public class TestPartFour {

    private TestPartFour() {}
    
    public static void printAthlete(final Athlete athlete) {
        System.out.printf("Athlete number: %s\n", athlete.getRaceNumber());
		final Iterator<SplitTime> iter = athlete.iterator();
        if (iter.hasNext()) {
            while (iter.hasNext()) {
                final SplitTime splittime = iter.next();
                System.out.printf("%4d km : %s\n", splittime.getDistance(), splittime.getTime());
            }
        }
        else {
            System.out.println("No times recorded.");
        }
		/*
		* Your code here.
		*/
	}
        
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of athlete data in the form '<race number> [<split time>, ..., <split time>] ':");
        Athlete athlete = new Athlete(input.nextLine());
        TestPartFour.printAthlete(athlete);
    }
}
