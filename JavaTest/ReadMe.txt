Read Me********

Current folder contains SortExample folder which is eclipse project
This is java/maven project using jdk 1.8.
Import this  project into your eclipse.
In the project, we have two packages as below:


com.biren.sort
	This package contains Employee.java,AgeComparator.java, LastNameComparator.java and SortExample.java file
	 that demonstrate the sorting of Employee based on Age or last name
	SortExample.java is executable class because this class contains main method. 
	We have buildEmployeeList() in SortExample.java class that prepare list of employee. You can change the value and save it before execution.
	When you execute SortExample.java, you will see the employee details in required way in the console.

Respective JUnit test case is written for above file.
	The Test case can be found under com.biren.sort with in src/test/java.
	 We have buildEmployeeList() method in SortExampleTest.java class
	We can run these test cases by modifying the value in buildEmployeeList() in SortExampleTest.java and save it before execution.
	Once we run the test cases we can see the result.




com.biren.ramrs
	This package contains Rarms.java file that handle RobotArms program.
	This file can be executable by the way we execute any normal file because this file contain main method. 
	Once you execute this class, it will ask inputs from user, once inputs is provided, 
	the boxes column will get filled with provided box as explained in requirements.
	PLEASE provide the input with specific format because this program have minimum validation. 
	Ex: FD{foo}FFD{bar}RFFD{Foo}RFFD{World}

Respective JUnit test case is written for above file.
	The Test case can be found under com.biren.rarms with in src/test/java.
	We can run these test cases by modifying the inputs and display the test results.
	Please be aware that if valid inputs is not provide then test case may failed.


