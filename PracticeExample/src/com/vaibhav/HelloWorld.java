package com.vaibhav;

public class HelloWorld {

	
	public static void main(String args[]) {
		System.out.println("Welcome to github");
		add(2,3);
	}
	
	public static void add(int a, int b) {
		System.out.println(String.format("Sum= %s", (a+b)));
	}
	
}
