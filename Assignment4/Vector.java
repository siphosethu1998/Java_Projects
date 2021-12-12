public class Vector {
	
	// instance variables
	private double vx;
	private double vy;

	//Constructor
	public Vector(double vx, double vy) {
			
		this.vx = vx;
		this.vy = vy;
	}

	// Methods
	public double getMagnitude() {
			
		double x_squared = vx*vx;
		double y_squared = vy*vy;

		return Math.sqrt(x_squared + y_squared);
	}

	public Vector add(Vector other) {

		double newvx =	this.vx + other.vx;
		double newvy =	this.vy + other.vy;

		return new Vector(newvx, newvy);
	}

	public Vector multiply(double multiplier) {

		double  newvx = multiplier * vx;
		double  newvy = multiplier * vy;

		return new Vector(newvx, newvy);
	}
	
	public double dotProduct(Vector other) {

		return vx * other.vx + vy * other.vy;
	}

	public String toString() {

		return "v = (" + String.format("%.2f",vx) + ", " + String.format("%.2f",vy) + ")";
	}

}
