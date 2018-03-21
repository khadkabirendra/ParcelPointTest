package com.biren.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SortExampleTest {

	@Test
	public void testSortByAge() {
		
		List<Employee> empList=buildEmployeeList();
		
		SortExample sortExample = new SortExample();
		empList=sortExample.sortEmployeeListByAge(empList);
		
		//test if age of first object is lowest or not,  buildEmployeeList method has created a Employee
		//with age 4 and added at index 3.
		//After calling sortEmployeeListByAge() method of SortExample class, employee added at index 3 should come at index 0 because of lowest age
		
		Assert.assertEquals(4, empList.get(0).getAge());
		
		
	}
	@Test
	public void testSortByLastName() {
		
		List<Employee> empList=buildEmployeeList();
		
		SortExample sortExample = new SortExample();
		empList=sortExample.sortEmployeeListByLastName(empList);
		
		
		//test if last name of first object is A  or not, because buildEmployeeList method has created a Employee
		//with last name A and added at index 1.
		//But after calling sortEmployeeList() method of SortExample class, employee added at index 1 should come at index 0.
		//For example 'Dipen' is added at index 1 with last name A. So, after sorting, this employee should come at index 0.
		
		Assert.assertEquals("Dipen", empList.get(0).getFirstName());
		
		
	}
	
	/*
	 * Following method will build a list with information of 5 employees and return it.
	 */
	

	private  List<Employee> buildEmployeeList()
		{
			List<Employee> empList=new ArrayList<Employee>();
			
			Employee e1=new Employee();
			e1.setFirstName("Biren");
			e1.setLastName("D");
			e1.setAge(20);//age
			empList.add(e1);
			
			
			Employee e2=new Employee();
			e2.setFirstName("Dipen");
			e2.setLastName("A");//last name - After sorting, this should come first in the list
			e2.setAge(31);//age
			empList.add(e2);
			
			Employee e3=new Employee();
			e3.setFirstName("Pramod");
			e3.setLastName("T");//last name
			e3.setAge(32);//age
			empList.add(e3);
			
			Employee e4=new Employee();
			e4.setFirstName("Rakesh");
			e4.setLastName("Z");//last name
			e4.setAge(4);//age--LOWEST
			empList.add(e4);
			
			Employee e5=new Employee();
			e5.setFirstName("Aarav");
			e5.setLastName("B");//last name
			e5.setAge(7);//age
			empList.add(e5);
			
			return empList;
		}

}
