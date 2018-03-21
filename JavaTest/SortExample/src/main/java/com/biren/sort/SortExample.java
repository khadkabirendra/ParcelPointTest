package com.biren.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
	
	/**
	 * Sort List of employee provided in parameter by Age
	 * @param empList
	 * @return
	 */
	public List<Employee> sortEmployeeListByAge(List<Employee> empList)
	{
		Collections.sort(empList,new AgeComparator());  
		return empList;
	}
	/**
	 * Sort List of employee provided in parameter by Last Name
	 * @param empList
	 * @return
	 */
	public List<Employee> sortEmployeeListByLastName(List<Employee> empList)
	{
		Collections.sort(empList,new LastNameComparator());  
		return empList;
	}
	
	/**
	 * Main method just to test
	 * @param args
	 */
	public static void main(String[] args) {
		SortExample se=new SortExample();
		System.out.println(se.sortEmployeeListByAge(se.buildEmployeeList()));
		
		System.out.println(se.sortEmployeeListByLastName(se.buildEmployeeList()));
		
	}
	private  List<Employee> buildEmployeeList()
	{
		List<Employee> empList=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setFirstName("Biren");
		e1.setLastName("A");
		e1.setAge(30);
		empList.add(e1);
		
		
		Employee e2=new Employee();
		e2.setFirstName("Dipen");
		e2.setLastName("D");
		e2.setAge(30);
		empList.add(e2);
		
		Employee e3=new Employee();
		e3.setFirstName("Pramod");
		e3.setLastName("T");
		e3.setAge(32);
		empList.add(e3);
		
		Employee e4=new Employee();
		e4.setFirstName("Rakesh");
		e4.setLastName("Z");
		e4.setAge(4);
		empList.add(e4);
		
		Employee e5=new Employee();
		e5.setFirstName("Aarav");
		e5.setLastName("B");
		e5.setAge(7);
		empList.add(e5);
		
		return empList;
	}

}
