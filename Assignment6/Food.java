/**
 * @author : Siphosethu Shumani
 * @Date : 27 January 2022
 * 
 */

public class Food {
	String menuItemNumber;
	String size;

	public Food(String menuItemNumber, String size) {
		this.menuItemNumber = menuItemNumber;
		this.size = size;
	}

	public String getItemNumber() {
		return menuItemNumber;
	}
	
	public String getSize() {
		return size;
	}

	public String toString() {
		return "Food: " + menuItemNumber + ", " + size;
	}

}  
