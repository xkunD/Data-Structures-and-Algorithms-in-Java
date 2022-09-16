// Homework4.java

package com;

import containers.Stack;

public class Homework4 {
	// Create three new stacks
	private static Stack<Integer> stack1 = new Stack<Integer>();
	private static Stack<Integer> stack2 = new Stack<Integer>();
	private static Stack<Integer> stackResult = new Stack<Integer>();
	
	// Implement the addLargeNumber method
	public static void addLargeNumber (String num1, String num2) {
		// Convert input strings to char array
		char[] arraynum1 = num1.toCharArray();
		char[] arraynum2 = num2.toCharArray();
		// Store input strings into stacks
		for(int i = 0; i<arraynum1.length; i++) {
			stack1.push(Integer.parseInt(String.valueOf(arraynum1[i])));
		}
		for(int i = 0; i < arraynum2.length; i++) {
			stack2.push(Integer.parseInt(String.valueOf(arraynum2[i])));
		}
		// Create variable result
		var result = 0;
		// Add two poped values to result
		while(!stack1.isEmpty() || !stack2.isEmpty()) {
			if(!stack1.isEmpty()) {
				result += stack1.pop();
			}
			if(!stack2.isEmpty()) {
				result += stack2.pop();
			}
			stackResult.push(result % 10);
			result = result / 10;
		}
		// Push the remaining carry part to the result
		if(result != 0) {
			stackResult.push(result);
		}
		// Print the result stack
		while(!stackResult.isEmpty()) {
			System.out.print(stackResult.pop());
		}
		System.out.println();
	}
	
	//main method demostration
	public static void main(String[] args) {
		addLargeNumber("3098", "234");
		addLargeNumber("239420952923", "592323434242");
		addLargeNumber("7777777777777", "999");
	}

}
