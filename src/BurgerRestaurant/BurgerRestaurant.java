package BurgerRestaurant;

import java.util.Scanner;

/**
 * 
 * @author Pranav Sahu
 *
 */

public class BurgerRestaurant {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Burger Place");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n 1) Menu \n 2) Create your own burger \n");
		int choice = sc.nextInt();
		
		BurgerMenu bm = new BurgerMenu();
		BurgerCart bCart = new BurgerCart();
		
		CustomBurger cb = new CustomBurger();
		
		switch(choice) {
			case 1 : 
				System.out.println("Menu");
				bm = new BurgerMenu();
				bm.displayMenu();
				int count = 0;
				while(true) {
					System.out.println("What would you like to order ?");
					if(count > 0) {
						bm.displayMenu();
					}
					int selection = sc.nextInt();
					bCart.addToCart(selection);
					//method to store selection
					System.out.println("Do you want to add anything else ?  Y/N");
					String option = sc.next();
					if(option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("N")) {
						count++;
						if(option.equalsIgnoreCase("N")) {
							count = 0;
							//display items in cart for confirmation
							System.out.println("You have the following items in your cart");
							bCart.displayItemsInCart();
							System.out.println("------------");
							System.out.println("Your receipt\n");
							bCart.getOrderQuantity();
							System.out.println("\nWould you like to add any sides (Fries or Coke). It only costs a dollar more! Y/N ?");
							String extra = sc.next();
							if(extra.equalsIgnoreCase("Y")) {
								double amount = bCart.getBillAmount() + 1;
								System.out.println("\nYour total bill amount is: $"+amount);
							}
							else {
								System.out.println("\nYour total bill amount is: $"+bCart.getBillAmount()); //add billing function
							}
							System.out.println("------------");
							break;
						}
					}
					else {
						System.out.println("Invalid choice");
						System.out.println("Do you want to add anything else ?  Y/N");
						option = sc.next();
						count++;
					}
				}
				break;
				
			case 2 :
				System.out.println("Custom menu");
				bm.displayCustomMenu();
				int counter = 0;
				while(true) {
					System.out.println("Select the toppings of choice !");
					if(counter > 0) {
						bm.displayCustomMenu();
					}
					int selection = sc.nextInt();
					cb.addToCart(selection);
					//method to store selection
					System.out.println("Do you want to add anything else ?  Y/N");
					String option = sc.next();
					if(option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("N")) {
						counter++;
						if(option.equalsIgnoreCase("N")) {
							counter = 0;
							//display items in cart for confirmation
							System.out.println("You have the following items in your cart");
							cb.displayItemsInCart();
							System.out.println("------------");
							System.out.println("Your receipt\n");
							cb.getOrderQuantity();
							System.out.println("\nWould you like to add any sides (Fries or Coke). It only costs a dollar more! Y/N ?");
							String extra = sc.next();
							if(extra.equalsIgnoreCase("Y")) {
								double amount = cb.getBillAmount() + 1;
								System.out.println("\nYour total bill amount is: $"+amount);
							}
							else {
								System.out.println("\nYour total bill amount is: $"+cb.getBillAmount()); //add billing function
							}
							System.out.println("------------");
							break;
						}
					}
					else {
						System.out.println("Invalid choice");
						System.out.println("Do you want to add anything else ?  Y/N");
						option = sc.next();
						counter++;
					}
				}
				break;
			
			default:
				System.out.println("Please leave a feedback to help us serve you better.");
		}
		
		sc.close();
		System.out.println("\nThank you. Please visit again!!");
	}
}
