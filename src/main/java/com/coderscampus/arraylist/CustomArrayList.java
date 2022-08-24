package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10]; // array of 10 item objects
	int size = 0; // size of the list

	@Override
	public boolean add(T item) { // add method takes in a T (type) and item
		if (size == items.length) { // if the size of the list equals the length of the array then
			items = doubleSizeOfBackingArray();	// items array equals doubling method which is same array
		}										// just with a doubled size
		items[size++] = item; // item array at new size = item at that index of size
//		size++; // increase the size of the array after each add
		return true; // returns true if item was added
	}

	public Object[] doubleSizeOfBackingArray() { // new object array
		Object[] newArray = new Object[size * 2]; // newArray that doubles the size
		for (int i = 0; i < size; i++) { // for every item in item array, newArray takes that while
										 // doubling the size of the backing array
			newArray[i] = items[i];
		}
		return newArray; // same array just the size doubled
	}

	@Override
	public int getSize() {
		return size;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException { // takes in a type (array type) and an integer (items.get(10))
		if (index >= size)	// if the integer you inputed as the index is greater 
		throw new IndexOutOfBoundsException("The index, " + index + ", is out of the bounds of the array with size " + size);

		return (T) items[index]; 
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > size) {
			throw new IndexOutOfBoundsException("The item '" + item + "' cannot be added at the index: " + index);
		}
		if (size == items.length)  {
			items = doubleSizeOfBackingArray();
		}
		
		for (int i = size-1; i > index; i--) {
			items[i] = items[i];
		}
		items[index] = item;
		size++;
		
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", is out of bounds");
		}
		
		T removedItem = (T) items[index];
		
		for (int i = index; i<size-1; i++) {
			items[i] = items[i + 1];
		}
		size--;
		return removedItem;
	}

}
