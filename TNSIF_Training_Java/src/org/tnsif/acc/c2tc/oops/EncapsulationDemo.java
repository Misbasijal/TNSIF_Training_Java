package org.tnsif.acc.c2tc.oops;

class Human{
//	variables
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
public class EncapsulationDemo {
	
	public static void main (String[] args) {
		Human obj=new Human();
		obj.setName("Misba");
		obj.setAge(21);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		 
		obj.setName("Hema");
		obj.setAge(34);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}
