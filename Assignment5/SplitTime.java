import java.util.Scanner;
/**
 * A SplitTime object represents a split time for an athlete in a particular race.
 * A spit time consist of a waypoint, described as a distance from the start line, and the time (according
 * to the race clock) to get there.
 * 
 * @author Stephan Jamieson
 * @version 10/08/16
 */
public class SplitTime {

    private int distance;
    private Time time;
    
    public SplitTime(Time time, int distance) {
        this.distance = distance;
        this.time = time;
    }
    
    public SplitTime(String data) {
        final Scanner scanner = new Scanner(data);
        scanner.useDelimiter("@");
        assert(scanner.hasNext());
        this.time = new Time(scanner.next());
        assert(scanner.hasNext());
        this.distance = scanner.nextInt();
    }
    
    public int getDistance() { return distance; }
    public Time getTime() { return time; }
    
    public String toString() { return time+"@"+distance; }
    
}
