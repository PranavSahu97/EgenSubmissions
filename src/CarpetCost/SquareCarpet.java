package CarpetCost;

public class SquareCarpet extends CarpetShape {
	private double lengthOfSquare;
	
	public SquareCarpet() {
		name = "Square";
		lengthOfSquare = 0.0;
	}
	
	public SquareCarpet(double lengthOfSquare) {
		name = "Square";
		this.lengthOfSquare = lengthOfSquare;
	}
	
	public void areaOfRoom() {
		area = this.lengthOfSquare * this.lengthOfSquare;
	}
	
}
