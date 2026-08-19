package org.tnsif.acc.c2tc.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();//if we use arraylist instead of list it will fetch all the methods from list as well as arraylist
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon Fruit");
		
		System.out.println(fruits);
		System.out.println("Second Fruit : " +fruits.get(1));
		fruits.set(1,"Cherry");
		System.out.println(fruits);
		fruits.remove(2);
		System.out.println("After removing : "+fruits);
		
		if(fruits.contains("Mango"))
		{
			System.out.println("Requested fruit is present");
		}else {
			System.out.println("Requested fruit is not present");
		}
		
		//Using Iterable
		Iterable<String> iterableFruits = fruits;
		System.out.println("Traversing using Iterable:" +iterableFruits);
		
		//using for each loop also you can travese
		for(String fruit:fruits) {
			System.out.println(fruit);
		}

	}

}
