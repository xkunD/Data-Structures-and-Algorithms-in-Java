// CompareByAge.java

package com;

import java.util.Comparator;

public class CompareByAge implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		if(p1.age > p2.age) {
			return 1;
		}
		if(p1.age < p2.age) {
			return -1;
		}
		return 0;
	}
}
