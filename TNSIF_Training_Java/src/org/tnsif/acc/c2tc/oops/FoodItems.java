package org.tnsif.acc.c2tc.oops;

public class FoodItems {
	
//	variable
	String name;
	double price;
	String category;
	
//	method
	
	void displayDetails() {
		System.out.println("Food name : "+name);
		System.out.println("Price :" +price);
		System.out.println("Category : "+category);
		System.out.println("-----------");
	}

	public static void main(String[] args) {
//		classname objectname = new constructor();
		FoodItems fooditem1 = new FoodItems();
		fooditem1.name = "Biryani";
		fooditem1.price=299.99;
		fooditem1.category="Rice";
		fooditem1.displayDetails();
		
		FoodItems fooditem2 = new FoodItems();
		fooditem2.name = "Pizza";
		fooditem2.price=199.99;
		fooditem2.category="Snacks";
		fooditem2.displayDetails();
		
	}

}
