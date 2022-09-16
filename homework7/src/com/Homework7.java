// Homework7.java

package com;

import java.util.Comparator;

public class Homework7 {
	
	public static <E> void outputSorted(Person[] arr, Comparator<? super Person> comparator) {
		
		// create a heap
		Heap<Person> heap = new Heap<Person>(comparator);
		
		// insert data into heap
		for(int i = 0; i < arr.length; i++) {
			heap.insert(arr[i]);
		}
		
		// print the sorted array
		while(!heap.isEmpty()) {
			System.out.print(heap.extract().name);
			System.out.print(" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// Create test cases
		Person[] persons = {
				new Person("David", 35, 170),
				new Person("Amelia", 20, 197),
				new Person("Olivia", 80, 154),
				new Person("Elwood", 66, 187),
				new Person("Bruce", 17, 198),
				new Person("Simon", 45, 179),
				
		};
		
		// test the results
		outputSorted(persons, new CompareByName());
		outputSorted(persons, new CompareByAge());
		outputSorted(persons, new CompareByHeight());
	}
	
}

