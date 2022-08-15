package com.coderscampus.lesson9;

public class ExceptionsExamples {

	public static void main (String[] args) {
		
		String someString = null;
		
		try {
			String[] stringArray = someString.split(",");
			System.out.println(stringArray);
		} catch (NullPointerException e) {
			System.out.println("Oops, there was a null pointer exception");
		}
		
		
	}
}
