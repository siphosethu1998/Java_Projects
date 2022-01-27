public class Plane extends Vehicle {
	private String manufacturer;
	private int modelNumber;

	public Plane(String colour, int passengers, String manufacturer, int modelNumber) {
		super(passengers, colour);
		this.manufacturer = manufacturer;
		this.modelNumber = modelNumber;
	}

    public String toString() {
        return getColour() + " " + getPassengers() + " passengers" + " " +  manufacturer + " " + modelNumber;
    }
}
