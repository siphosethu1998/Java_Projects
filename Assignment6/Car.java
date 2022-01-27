public class Car extends Vehicle{
	private int numDoors;

	public Car(String colour, int passengers, int numDoors){
		super(passengers, colour);
		this.numDoors = numDoors;
}

    public String toString() {
        return getColour() + " " + getPassengers() + " passengers" + " " + numDoors + " doors";
    }
}
