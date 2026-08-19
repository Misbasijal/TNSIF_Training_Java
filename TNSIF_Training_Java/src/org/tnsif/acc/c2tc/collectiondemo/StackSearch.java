package org.tnsif.acc.c2tc.collectiondemo;

import java.util.Stack;

public class StackSearch {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
       stack.push(34); //4
       stack.push(56); //3
       stack.push(78); //2
       stack.push(90); //1
       
       //searching (1- based index)
       
       System.out.println("Pos of 34 : "+stack.search(34));
       System.out.println("Pos of 56 : "+stack.search(56));
	}

}
