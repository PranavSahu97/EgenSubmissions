package CarpetCost;

import java.util.Scanner;

public class CarpetCostCalculator {
	public static void main(String[] args) {
		System.out.println("Program to calculate cost of carpet per room");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select shape of carpet");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Square");
		int shape = sc.nextInt();
		
		CarpetShape carpetShape = null;
		
		switch(shape) {
			case 1:
				double [] dimension = new double[2];
				System.out.println("Enter length of space");
				dimension[0] = sc.nextDouble();
						
				System.out.println("Enter width of space");
				dimension[1] = sc.nextDouble();
				
				carpetShape = new RectangularCarpet(dimension); 
				break;
				
			case 2:
				System.out.println("Enter radius of circle");
				double radius = sc.nextDouble();
				
				carpetShape = new CircularCarpet(radius);
				break;
			
			case 3:
				System.out.println("Enter length of square");
				double lengthOfSquare = sc.nextDouble();
				
				carpetShape = new SquareCarpet(lengthOfSquare);
				break;
							
			default:
				System.out.println("Invalid shape. Enter a valid shape");
		}
		
		if(carpetShape != null) {
			carpetShape.areaOfRoom();
			carpetShape.calculateTotalCost();
			carpetShape.display();
		}
		
		sc.close();
	}
}
