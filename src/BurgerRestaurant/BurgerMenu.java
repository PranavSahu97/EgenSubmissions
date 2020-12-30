package BurgerRestaurant;

import java.util.ArrayList;
import java.util.List;

public class BurgerMenu {
	public BurgerMenu() {
		
	}
	public List<String> completeMenu() {	
		List<String> menu = new ArrayList<>();
		
		menu.add("1. Cheese Burger $2");
	    menu.add("2. Chicken Burger $4");
	    menu.add("3. Crispy Chicken Burger $5");
	    menu.add("4. Coffee $3");
	    
	    return menu;
	}
	
	public List<String> toppingsMenu() {
		List<String> toppings = new ArrayList<>();
		
		toppings.add("1. Lettuce $0.50");
		toppings.add("2. Olives $2");
		toppings.add("3: Jalapenos $1.5");
		toppings.add("4: Cheese $1");
		toppings.add("5. Veggie Patty $4");
		toppings.add("6. Chicken Patty $5");
		
		return toppings;
	}
	
	public void displayMenu() {
		List<String> items = completeMenu();
		for(String item : items) {
			System.out.println(item);
		}
	}
	
	public void displayCustomMenu() {
		List<String> items = toppingsMenu();
		for(String item : items) {
			System.out.println(item);
		}
	}
}
