// CompareCarsByMakeThenDescendingMPG.java

package com;

import java.util.Comparator;

public class CompareCarsByMakeThenDescendingMPG implements Comparator<Car>{
	public int compare(Car c1, Car c2) {
		int result;
		result = c1.make.compareTo(c2.make);
		if (result != 0) {
			return result;
		}
		if (c1.mpg < c2.mpg) {
			return 1;
		}
		if (c1.mpg > c2.mpg)
		{
			return -1;
		}
		return 0;
	}
	
}