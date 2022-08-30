package com.coderscampus.arraylist;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		example4();
//		example3();
//		System.out.println("");		
//		example2();
//		System.out.println("");
//		example1();
	}
	
	private static void example4() {
		CustomList<Integer> numbersList = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbersList.add(i, i);
		}
		numbersList.add(1, 1000);
		for (int i = 0; i < 20; i++) {
			System.out.println(numbersList.get(i));
			
		}
		
	}

	private static void example3() {
		CustomList<Integer> numbersList = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbersList.add(i, i);
		}
		numbersList.add(5, 14);
		
		for (int i = 0; i < 20; i++) {
			System.out.println(numbersList.get(i));
			
		}
		
	}

	private static void example2() {
		String[] nameArray = { "John Doe", "Jane Doe", "The Rock", "Luke Skywalker", "Darth Vader", "Big Mike",
				"Santa Claus", "AHHHH!!!!", "Ryan Reynolds", "Hannah Montana", "Eleven", "Twelve", "LL CoolJ" };
		CustomList<String> names = new CustomArrayList<>();
		for (int i = 0; i < nameArray.length; i++) {
			names.add(nameArray[i]);
		}
		for (int i = 0; i < names.getSize(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names.getSize());

	}

	private static void example1() {
		CustomList<Integer> numbers = new CustomArrayList<>();

		// Add objects to CustomArrayList
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		// Get object at index in CustomArrayList
		for (int i = 0; i < numbers.getSize(); i++) {
			System.out.println(numbers.get(i));

		}
		System.out.println(numbers.getSize());
		System.out.println(numbers.get(9));
	}

}
