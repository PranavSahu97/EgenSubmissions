package BurgerRestaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BurgerCart implements BurgerInterface {
	List<String> itemsInCart = new ArrayList<>();
	
	public void addToCart(int selection){
		BurgerMenu bm = new BurgerMenu();
		itemsInCart.add(bm.completeMenu().get(selection-1));
	}
	
	public void displayItemsInCart() {
		for(String orderItem : itemsInCart) {
			String[] str = orderItem.split(" ");
			String item = "";
			for(int i=1; i<str.length; i++) {
				item += str[i];
				item += " ";
			}
			System.out.println(item.trim());
		}
	}
	
	public void getOrderQuantity() {
		Map<String, Integer> map = new HashMap<>();
		for(String orderItem : itemsInCart) {
			String[] str = orderItem.split(" ");
			String item = "";
			for(int i=1; i<str.length; i++) {
				item += str[i];
				item += " ";
			}
			map.put(item, map.getOrDefault(item, 0) +1);
			item = "";
		}
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " x " + e.getValue());
		}
		
	}
	
	public double getBillAmount() {
		double amount = 0;
		for(String orderItem : itemsInCart) {
			String str = "";
			for(int i=2; i<orderItem.length(); i++) {
				if(Character.isDigit(orderItem.charAt(i)) || orderItem.charAt(i) == '.') {
					str += orderItem.charAt(i);
				}
			}
			
			amount += Integer.parseInt(str);
		}
		
		return amount;
	}
}
