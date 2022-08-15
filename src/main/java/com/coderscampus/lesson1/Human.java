package com.coderscampus.lesson1;

public class Human {
	// class variables
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// instance variable
	private int age;

	public int getAge () {
		return age;
	}
	
	public void setAge (int age) {
		if (age < 0 || age > 150) {
			System.out.println("No no no, that's not a valid age. A valid age is between 0 and 130.");
			return;
		}
		this.age = age;
	}
	
	public String getStageOfLife () {
		if (age < TEENAGER_AGE) {
			return "Child";
		} else if (age < ADULT_AGE) {
			return "Teenager";
		} else if (age < SENIOR_AGE) {
			return "Adult";
		} else {
			return "Senior";
		}
		
	}
	
}
