// Main.java

package com;

import containers.QuickSort;

public class Main {
	
	// Create test case
	private static Car[] cars = {
            new Car("Toyota", "Camry", 33),
            new Car("Ford", "Focus", 40),
            new Car("Honda", "Accord", 34),
            new Car("Ford", "Mustang", 31),
            new Car("Honda", "Civic", 39),
            new Car("Toyota", "Prius", 48),
            new Car("Honda", "Fit", 35),
            new Car("Toyota", "Corolla", 35),
            new Car("Ford", "Taurus", 28)
	};
	
	// Implement a display method to display the array of cars
	static void display(Car[] cars) {
		for(int i=0 ; i<cars.length; i++ ) {
			System.out.printf("%s %s %d \n", 
					cars[i].make,cars[i].model, cars[i].mpg);;
		}
	}
	
	// main method for testing
	public static void main(String[] args) {
		
		// display in original unsorted order
		System.out.println("\ncars in original unsorted order:");
		display(cars);
		
		// display cars sorted by make then model
		QuickSort.quickSort(cars, new CompareCarsByMakeThenModel());
		System.out.println("\nCars sorted by make then model:");
		display(cars);
		
		// display cars sorted by descending MPG
		QuickSort.quickSort(cars, new CompareCarsByDescendingMPG());
		System.out.println("\nCars sorted by descending MPG:");
		display(cars);
		
		// display cars sorted by make then descending MPG
		QuickSort.quickSort(cars, new CompareCarsByMakeThenDescendingMPG());
		System.out.println("\nCars sorted by make then descending MPG:");
		display(cars);

		}
	}
	
	
	
	
	
	
	
	

