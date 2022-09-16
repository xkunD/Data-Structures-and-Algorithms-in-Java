// CompareByDescendingMPG.java

package com;

import java.util.Comparator;

public class CompareCarsByDescendingMPG implements Comparator<Car>{
	public int compare(Car c1, Car c2)
	{
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