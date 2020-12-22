package CarpetCost;

import java.text.NumberFormat;

public abstract class CarpetShape {

	String name;
	double area;
	String totalCost;
	final double PRICE = 8.0;
	
	public CarpetShape() {
		name = "undetermined";
		area = 0.0;
		totalCost = "";
	}
	
	public abstract void areaOfRoom();
	
	public void calculateTotalCost() {
		double amount = (PRICE * area);
		totalCost = NumberFormat.getCurrencyInstance().format(amount);
	}
	
	public void display() {
		System.out.println("Cost of carpet of shape "+name+" of Area "+area+" square feet is "+totalCost);
	}
	
}
