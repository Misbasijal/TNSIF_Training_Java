package org.tnsif.acc.c2tc.interfacedemo;


class SmartLight implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Smart Light is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Light is off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light is on standby mode");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		SmartLight smart = new SmartLight();
		smart.turnOn();
		smart.turnOff();
		smart.getStatus();

	}

}
