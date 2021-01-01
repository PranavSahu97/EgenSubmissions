package BurgerRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
	private static int orderNo = 0;
	private List<Burger> order = new ArrayList<>();
	
	public Order() {
		
	}
	
	/**
	 * get burger from order
	 */
	public Burger getBurger(int index) {
		return order.get(index);
	}
	
	/**
	 * Add burger to order list
	 * @param burger
	 */
	public void addBurger(Burger burger) {
		order.add(burger);
	}
	
	/**
	 * remove particular order item
	 */
	
	public void removeBurger(Burger burger) {
		order.remove(burger);
	}
	
	/**
	 * get order size
	 */
	public int getOrdersize() {
		return order.size();
	}
	/**
	 * Remove entire order in case person cancels
	 */
	
	public void clearOrder() {
		order.clear();
	}
	
	/**
	 * get order no
	 */
	public int getOrderNumber() {
		return orderNo;
	}
	
	/**
	 * increment order no
	 */
	public void incrementOrderNo() {
		orderNo++;
	}
	
	/**
	 * get Random server for order
	 */
	public String getServer() {
		Random random = new Random();
		int num = random.nextInt(10) + 1;
		switch(num) {
		case 1 : 
			return "A";
		case 2 : 
			return "B";
		case 3 : 
			return "C";
		case 4 : 
			return "D";
		case 5 : 
			return "E";
		case 6 : 
			return "F";
		default :
			return "No Server available at the moment.";
		}
	}
	
	public double orderTotal() {
		double total = 0;
		for(int i=0; i<order.size(); i++) {
			String s = order.get(i).toString();
			s = s.replaceAll("\\s", " ");
//			System.out.println(s);
			String str[] = s.split(" ");
			String amount = str[str.length-1];
			amount = amount.replace("$", "");
			
			total += Double.parseDouble(amount);
		}
		
		return total;
		
	}
	
	@Override
	public String toString() {
		String str = "";
		for(int i=0; i<order.size(); i++) {
			str += order.get(i).toString() + "\n";
		}
		
		return str;
	}
	
}
