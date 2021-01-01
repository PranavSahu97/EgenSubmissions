package BurgerRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Burger> burgers = new ArrayList<>();
	private List<Burger> cafe = new ArrayList<>();
	
	public Menu() {
		populateMenu();
	}
	
	public void populateMenu() {
		burgers.add(new Burger("Classic Cheese\t\t", "Burger", 5));
		burgers.add(new Burger("Grilled Chicken\t\t", "Burger", 7));
		burgers.add(new Burger("Veggie Delight\t\t", "Burger", 6));
		burgers.add(new Burger("House Special\t\t", "Burger", 8));
		
		cafe.add(new Burger("Mocha Frappucino\t", "Cafe", 4, "8oz"));
		cafe.add(new Burger("Hot Chocolate\t", "Cafe", 5, "8oz"));
		cafe.add(new Burger("Water\t\t", "Cafe", 0, "12oz"));
	}
	
	public Burger getBurger(int index) {
		return burgers.get(index);
	}
	
	public int getBurgerSize() {
		return burgers.size();
	}
	
	public String getAllBurgers() {
		String bMenu = "";
		bMenu += "\t\tOur Burgers\n";
		for(int i=0; i<burgers.size(); i++) {
			Burger b = burgers.get(i);
			bMenu += "B"+(i+1) + ". " + b.toString() + "\n"; 
		}
		
		return bMenu;
	}
	
	public Burger getCafe(int index) {
		return cafe.get(index);
	}
	
	public int getCafeSize() {
		return cafe.size();
	}
	
	public String getAllCafe() {
		String cMenu = "";
		cMenu += "\t\tOur Cafe\n";
		for(int i=0; i<cafe.size(); i++) {
			Burger c = cafe.get(i);
			cMenu += "C"+(i+1) + ". " + c.toString() + "\n"; 
		}
		
		return cMenu;
	}
	
	
	@Override
	public String toString() {
		String menu = "";
		menu += "\t\tTHE BURGER PLACE MENU\n" +
		"------------------------------------------------------------------------\n";
		menu += getAllBurgers() + "\n";
		menu += getAllCafe() + "\n";
		menu += "------------------------------------------------------------------------\n";
		
		return menu;
	}
}
