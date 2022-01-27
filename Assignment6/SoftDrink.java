/**
 * @author : Siphosethu Shumani
 * @Date : 27 January 2022
 * 
 */

public class SoftDrink extends Food {
	private String flavour;
	private String bottleOrCan;

	public SoftDrink(String serial, String size, String flavour, String bottleOrCan) {
		super(serial, size);
		this.flavour = flavour;
		this.bottleOrCan = bottleOrCan;

	}

	public String toString() {
		return "Soft Drink: " + menuItemNumber + ", " + size + ", " + flavour + ", " + bottleOrCan;
	}


}
