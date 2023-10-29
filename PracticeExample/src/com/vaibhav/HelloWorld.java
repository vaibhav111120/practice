package com.vaibhav;

public class HelloWorld {

	
	public static void main(String args[]) {
		System.out.println("Welcome to github");
		add(2,3);
		sub(5,4);
	}
	
	public static void add(int a, int b) {
		System.out.println(String.format("Sum= %s", (a+b)));
	}
	public static void sub(int x,int y) {
		System.out.println(String.format("sub =%s",(x-y)));
	}
	
}
