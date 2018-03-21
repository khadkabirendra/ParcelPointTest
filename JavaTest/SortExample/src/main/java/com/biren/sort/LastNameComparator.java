package com.biren.sort;

import java.util.Comparator;

/**
 * 
 * @author Biren
 * This is comparator class for Employee to compare by their last name
 *
 */
public class LastNameComparator implements Comparator<Employee> {

	public int compare(Employee emp1 , Employee emp2) {
		return emp1.getLastName().compareTo(emp2.getLastName());  
	}

}
