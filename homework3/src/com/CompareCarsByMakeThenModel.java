// CompareCarsByMakeThenModel.java

package com;

import java.util.Comparator;

public class CompareCarsByMakeThenModel implements Comparator<Car>{
	public int compare(Car c1, Car c2) {
		int result;
		// compare by make first
		result = c1.make.compareTo(c2.make);
		if (result != 0) {
			return result;
		}
		// then compare by model
		return c1.model.compareTo(c2.model);
	}
}
