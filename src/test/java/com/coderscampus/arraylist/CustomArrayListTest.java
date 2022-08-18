package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Test-Driven Development Methodology
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make the test pass
	// Step 3 - Refactor your code
	// Step 4 - repeat

	// Three A's
	// Arrange, Act, Assert

	// Arrange
	private CustomList<Integer> sut; // sut = system under test
										// (the variable in which you are acting on)

	@BeforeEach
	void before_each_test() {
		sut = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			sut.add(i + 1);
//			sut.add(i);
		}
	}

	@Test
	void should_return_size() {

		// act
		Integer expectedSize = sut.getSize();

		//assert
		assertEquals(20, expectedSize);
	}

	@Test
	void should_return_item_at_index() {

		Integer expectedItem = sut.get(5);

		assertEquals(6, expectedItem);
	}

	@Test
	void should_return_item_at_beginning_of_list() {
		
		Integer expectedItem = sut.get(0);

		assertEquals(1, expectedItem);

	}

	@Test
	void should_return_item_at_end_of_list() {

		Integer expectedItem = sut.get(19);

		assertEquals(expectedItem, 20);

	}

	@Test
	void should_add_item_at_beginning_of_list() {

		sut.add(0, -5);

		Integer expectedItem = sut.get(0);

		assertEquals(-5, expectedItem);
	}

	@Test
	void should_add_item_at_middle_and_end_of_list() {

		sut.add(10, 821);
		sut.add(20, 420);

		Integer expectedItem = sut.get(10);
		Integer expectedItem2 = sut.get(20);
		Integer expectedSize = sut.getSize();
				
		assertEquals(expectedSize, 22);
		assertEquals(expectedItem, 821);
		assertEquals(expectedItem2, 420);
		
	}


	@Test
	void should_remove_item_at_index() {
		
		Integer removedItem = sut.remove(9);
		
		assertEquals(10, removedItem);
		assertEquals(19, sut.getSize());
		assertEquals(1, sut.get(0));
		
	}
	
	@Test
	void should_remove_from_beginning_of_list() {
		Integer itemRemoved = sut.remove(0);

 		assertEquals(1, itemRemoved);
 		assertEquals(19, sut.getSize());
 		assertEquals(2, sut.get(0));
 		assertEquals(20, sut.get(sut.getSize()-1));
	}
	
	@Test
 	void should_remove_from_middle_of_large_list() {
 		// Arrange
 		for (int i=0; i<100000; i++) {
 			sut.add(i);
 		}

 		Integer itemRemoved = sut.remove(50000);

 		assertEquals(49980, itemRemoved);
 		assertEquals(100019, sut.getSize());
 		assertEquals(1, sut.get(0));
 		assertEquals(99999, sut.get(sut.getSize()-1));
 	}
	

	@Test
	void should_throw_exception_when_getting_out_of_bounds() {
		try {
			sut.get(20);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");
	}
	
	@Test
	void should_throw_exception_when_removing_out_of_bounds() {
		try {
			sut.remove(20);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");
	}
	
	@Test
 	void should_throw_exception_when_adding_out_of_bounds () {
 		try {
 			sut.add(21, -5);
 			fail("Expected an IndexOutOfBoundsException but did not get one.");
 		} catch (IndexOutOfBoundsException e) {
 			return;
 		}
 		fail("Expected an IndexOutOfBoundsException but did not get one.");
 	}
}