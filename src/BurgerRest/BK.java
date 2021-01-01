package BurgerRestaurant;

import java.text.NumberFormat;
import java.util.Scanner;

public class BK {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Order order = new Order();
		NumberFormat numForm = NumberFormat.getCurrencyInstance();
		
		//print entire menu
		System.out.println(menu.toString());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello, my name is " +order.getServer()+"! What would you like to order ?");
		String choice = sc.next();
		char option = choice.charAt(0);
		int no = Character.getNumericValue(choice.charAt(1));
		
		while(true) {
			switch(option) {
				case 'B':
					order.addBurger(menu.getBurger(no-1));
					break;
				
				case 'C' : 
					order.addBurger(menu.getCafe(no-1));
					break;
					
				default:
					System.out.println("Sorry, the item you ordered is currently unavailable.");
			}
			
			System.out.println("Would you like to order anything else ? Y/N");
			String select = sc.next();
			if(select.equalsIgnoreCase("Y")) {
				System.out.println("What else you like to add ?");
				choice = sc.next();
				option = choice.charAt(0);
				no = Character.getNumericValue(choice.charAt(1));
			}
			
			else
				break;
		}
	

		while(true) {
			System.out.println("Would you like to make any changes to your order ? Y/N");
			String select = sc.next();
			if(select.equalsIgnoreCase("Y")) {
				System.out.println("What item do you want to remove ?");
				String choice1 = sc.next();
				char option1 = choice1.charAt(0);
				int no1 = Character.getNumericValue(choice1.charAt(1));
				if(option1 == 'B') {
					order.removeBurger(menu.getBurger(no1-1));
				}
				else {
					order.removeBurger(menu.getCafe(no1-1));
				}
			}
			else 
				break;
		}
		
		System.out.println("\n-------------------------------------------------");
		System.out.println("\t\tYour receipt");
		System.out.println("-------------------------------------------------");
		System.out.println(order.toString());
		order.incrementOrderNo();
		System.out.println("Your order number is "+order.getOrderNumber());
		System.out.println("Your order total is " +numForm.format(order.orderTotal()));
		System.out.println("\nThank you, Please visit again !!");
		System.out.println("-------------------------------------------------");
		sc.close();

	}

}
