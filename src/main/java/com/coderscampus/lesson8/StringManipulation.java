package com.coderscampus.lesson8;

public class StringManipulation {

	public static void main (String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
			// 1,2,3,4,5 -> [0]="1", [1]="2", [2]="3", [3]="4", [4]="5"
			// String numbers = "48927-28374-5634-1454-34563"
			// numbers.split("-") -> [0] = "48927", [1] = "28374", [2] = "5634"...
			
			String[] numbersArray = arg.split(",");
			for (String number : numbersArray) {
				System.out.println(number);
			}
		}
		
		
	}
}
