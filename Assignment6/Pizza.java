/**
 * @author : Siphosethu Shumani
 * @Date : 27 January 2022
 * 
 */

public class Pizza extends Food {
	private String base;	
	private String extraGarlic; 
	private String extraCheese; 

	public Pizza(String menuItemNumber, String size, String base, String extraCheese, String extraGarlic) {
		super(menuItemNumber, size);
		this.base = base;
		this.extraCheese = extraCheese;
		this.extraGarlic = extraGarlic;
	}

	public String toString() {
		return "Pizza: " + menuItemNumber + ", " + size + ", " + base + ", " + extraCheese + ", " + extraGarlic;
	}
}

