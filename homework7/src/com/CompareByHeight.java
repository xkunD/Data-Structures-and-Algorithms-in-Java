// CompareByHeight.java

package com;

import java.util.Comparator;

public class CompareByHeight implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		if(p1.height > p2.height) {
			return 1;
		}
		if(p1.height < p2.height) {
			return -1;
		}
		return 0;
	}
}