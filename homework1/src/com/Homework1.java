package com;
import java.util.Random;


public class Homework1 {
	public static void main(String[] args) {
		// Setting to allow fine-tuning the granularity of the readings
		int NUM_READINGS = 60;
		int INSERTS_PER_READING = 8000;
		
		// Start with an array containing 1 element
		int[] array = new int[1];
		array[0]=0;

		System.out.format("%-15s%-15s\n", "Array length","Seconds per insert");
		
		// Take NUM_READINGS readings
		for (int t=0; t < NUM_READINGS; t++) {
			
			// Each reading will be taken after INSERTS_PER_READING inserts
		    long startTime = System.currentTimeMillis();
		    
			for (int p=0; p < INSERTS_PER_READING; p++) {
				Random rn = new Random();
				int index = rn.nextInt(array.length);
				int value = rn.nextInt();
				array = Homework1.insert(array, index, value);
			}
			
			long stopTime = System.currentTimeMillis();
			
			//long timePerInsert = (stopTime - startTime) / INSERTS_PER_READING ;
			
			// Output reading in tabular format
			//System.out.println(array.length);
			//System.out.printf("0x%016X",timePerInsert/1000);
			//System.out.format("%15d%-15f\n", array.length, timePerInsert*1000);
			System.out.println(String.format("%15d\t%15f", array.length, (stopTime - startTime) / (1000. * INSERTS_PER_READING)));
		}

	}
	
	private static int[] insert(int[] array, int index, int value) {
		// create new array one larger than original array
		int[] newArray;                                     // O(1)
		newArray = new int[(array.length + 1)];             // O(1)
				
		//copy elements up to insert point from original array to new array
		for (int i=0; i<index; i++) {                       // O(n)
			newArray[i] = array[i];                         // O(1)
		}
		
		//place insert value into new array
		newArray[index] = value;                            // O(1)
		
		//copy elements after insert point from original array to new array
		for(int i=index; i<=array.length-1; i++) {          // O(N)
			newArray[i+1] = array[i];                       // O(1)
		}
		
		return newArray;                                    // O(1)
	}
	

}
