// Homework5.java

package com;

public class Homework5 {
	public static void main(String[] args) {
		// Create a new hashtable
		ChainedHashTable<Integer, Double> testTable = new ChainedHashTable<> (5, 0.5, 2);
		// Insert three elements
		testInsert(1, 5.0, testTable);
		testInsert(2, 6.0, testTable);
		testInsert(3, 7.0, testTable);
	}
	
	// Method to insert and display the result
	private static <K, V> void testInsert(K key, V value, ChainedHashTable<K, V> testTable) {
		testTable.insert(key, value);
		System.out.printf(
				"buckets %d, elements %d, lf %.2f, max lf %.2f, resize mult %.2f\n",
				testTable.getLength() ,
				key, 
				(double)testTable.getSize()/testTable.getLength() , 
				testTable.getMaxLoadFactor(), 
				testTable.getResizeMultiplier()
		);
	}
}
