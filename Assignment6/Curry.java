/**
 * @author : Siphosethu Shumani
 * @Date : 27 January 2022
 * 
 */

public class Curry extends Food{ 
	private String curryType;

	public Curry(String serial, String size, String curryType) {
		super(serial, size);
		this.curryType = curryType;
	}

	public String toString() {
		return "Curry: " + menuItemNumber + ", " + size + ", " + curryType;
	}
} 
