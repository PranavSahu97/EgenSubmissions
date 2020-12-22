package CarpetCost;

public class CircularCarpet extends CarpetShape {
	private double radius = 0.0;
	
	public CircularCarpet() {
		name = "Circle";
		radius = 0.0;
	}
	
	public CircularCarpet(double radius) {
		name = "Circle";
		this.radius = radius;
	}
	
	public void areaOfRoom() {
		area = Math.PI * this.radius * this.radius;
	}
	
}
