package CarpetCost;

public class RectangularCarpet extends CarpetShape {
	private double length;
	private double width;
	
	public RectangularCarpet() {
		name = "Rectangle";
		length = width = 0.0;
	}
	
	public RectangularCarpet(double []dimension) {
		name = "Rectangle";
		this.length = dimension[0];
		this.width = dimension[1];
	}
	
	public void areaOfRoom() {
		area = (this.length)*(this.width);
	}
	
}
