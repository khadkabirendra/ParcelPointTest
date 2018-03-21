package com.biren.sort;


/**
 * 
 * @author Biren
 *
 */


/**
 * Create a class Employee with fields firstName, lastName, and age.

Should be sortable by age and sepaterly by lastName.

Please include unit tests and instructions on how to run the code and tests.

 * 
 *
 */


public class Employee{

	private String firstName;
	private String lastName;
	private int age;
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}


	
}
