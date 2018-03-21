package com.biren.sort;

import java.util.Comparator;

/**
 * 
 * @author Biren
 * This is comparator class for Employee to compare by their age
 *
 */


public class AgeComparator implements Comparator<Employee> {

	public int compare(Employee emp1 , Employee emp2) {
		if(emp1.getAge()==emp2.getAge()) {
			return 0;  
		}
		else if(emp1.getAge()>emp2.getAge()) { 
			return 1;  
		}
		else
		{
			return -1;
		}
	}

}
