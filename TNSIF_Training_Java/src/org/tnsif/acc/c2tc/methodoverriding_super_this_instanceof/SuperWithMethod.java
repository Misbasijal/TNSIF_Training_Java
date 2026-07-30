package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class Payment1{
	void process() {
		System.out.println("Processing payment using standard gateway");
	}
}

class GPay extends Payment1{
	
	void process() {
		System.out.println("Processing payment via GPay");
	}
	
	void completePayment() {
		super.process();
		process();
	}
}

public class SuperWithMethod {

	public static void main(String[] args) {
		GPay obj = new GPay();
		obj.completePayment();

	}

}
