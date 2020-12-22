package FtToCm;

import java.util.Scanner;

public class FtToCm {
	public static void main(String[] args) {
		System.out.println("Feet to Cm converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in feet to be converted");
		double value = sc.nextDouble();
		
		FeetConverter fc = new FeetConverter();
		double res = fc.feetToCm(value);
		boolean flag = true;
		
		while(flag) {
			if(res == -1) {
				System.out.println("Invalid number. Give a positive number");
				System.out.println("Enter a positive value");
				value = sc.nextDouble();
				res = fc.feetToCm(value);
			}
			else {
				System.out.println(value+" feet is "+res +" cms");
				flag = false;
			}
		}
		
		sc.close();
	}
}
