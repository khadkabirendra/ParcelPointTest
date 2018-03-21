package com.biren.rarms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Rarms {
	 Scanner scan = new Scanner(System.in);//Initializing scanner
	 int currentPositionX=-1;//keeps the track of current position
	 String[] arm = new String[]{"","","","",""};//Array to store boxes
	 Map<Integer,Integer> columnMapCount=new HashMap<Integer,Integer>();//store the boxes stored for each column(index)
	 String finalPosition="";
	
	
	/**
	 * A robotic arm places boxes in 5 columns (A, B, C, D, E) each with height 10 boxes.
	 *  The default position for the arm is before column A. 
	 *  The command F makes the arm move forward along the rows. 
	 *  The command D causes the load to be dropped, the load will be a string value surrounded by {}. 
	 *  The command R causes the arm to go back to default position.

		Dropping the load on a full column leads to nothing happening. 
		Once a load is successfully dropped the arm moves forward one position except when in the last column. 
		The arm cannot move ahead of the last column and will stay there if it receives a forward command.
		
		Any other command is ignored and the robot stays in its current position.
		
		Write 2 methods: 
		    public static void simulateArm(String commandInput)
		
		which accepts the commands as a string and prints out the current status of the columns.
		Ex: FD{foo}FFD{bar}RFFD{Foo}RFFD{World} --> {A --> ["foo"], B --> ["Foo","World"], C --> [], D --> ["bar"], E --> []]}
		
		Please include unit tests and instructions on how to run the code and tests.

	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Rarms arm=new Rarms();
		arm.initialCommand();
	}
	/**
	 * Main executing method
	 * @param args
	 */
	public  String initialCommand() {		
		
		do
		{
			String	commandInput=askInput();
			
			simulateArm(commandInput);
			
			System.out.println(finalPosition);
			System.out.println("Do you want to continue? Y/N");
			String result=scan.next().trim();
			if(result.equalsIgnoreCase("Y"))
			{
				//commandInput=askInput();
			}
			else
			{

				System.out.println("Exited Successfully !");
				break;	
			}
			
		}
		while(true);
		
		return finalPosition;
	}
	
	public   String simulateArm(String commandInput)
	{
		
		String[] arr=commandInput.split("}");
		for(String s:arr)
		{
			String eachCommandInput=s+"}";
					
			boolean status=validateInputString(eachCommandInput);
			if(status)
			{
				finalPosition=simulateArmForEach(eachCommandInput);
				//System.out.println("res"+finalPosition);
				
			}
			else
			{
				System.out.println("Invalid Inputs, Please correct it");
				
			}
		}
		return finalPosition;
	}
	
	/**
	 * This method prints the current status 
	 */
	public  String prepareCurrentStatus()
	{
		String currentPosition="{A -- >["+arm[0]+"],B -- >["+arm[1]+"],C -- >["+arm[2]+"],D -- >["+arm[3]+"],E -- >["+arm[4]+"]}";
		return currentPosition;
	}
	
	/**
	 * This method start loading the boxes based on given command Input
	 * @param commandInput
	 * @return 
	 */
	public  String simulateArmForEach(String commandInput)
	{
		String boxes=getBox(commandInput);
		String finalCommnd=getCommand(commandInput);
		for(char c:finalCommnd.toCharArray()){
			if(c=='F'){
				currentPositionX++;
				if(currentPositionX>3)
				{
					currentPositionX=3;
				}
			} 
			else if(c=='R'){
				currentPositionX=-1;
			}
			else if(c=='D'){
				if(columnMapCount.get(currentPositionX)==null || columnMapCount.get(currentPositionX)<10)//Check the limit of boxex to 10
				{
					//update column count in map
					if(columnMapCount.get(currentPositionX)==null)
					{
						columnMapCount.put(currentPositionX,1);
					}
					else
					{
						columnMapCount.put(currentPositionX,columnMapCount.get(currentPositionX)+1);
					}
					
					//System.out.println("adding ("+boxes+")");
					//update column count data
					if(arm[currentPositionX].trim().length()==0)
					{
						arm[currentPositionX]="\""+boxes+"\"";
					}
					else
					{
						arm[currentPositionX]=arm[currentPositionX]+",\""+boxes+"\"";
					}
					currentPositionX++;
					if(currentPositionX>3)
					{
						currentPositionX=3;
					}
				}
			}
			
		}
		return prepareCurrentStatus();
		
		
	}
	
	/**
	 * Ask input from user
	 * @return
	 */
	private  String askInput()
	{
		
		String inputFromUser="";
		System.out.println("Please provide the input from user");
		
		inputFromUser=scan.next().trim();
		
		
		return inputFromUser.trim();
	}
	
	/**
	 * Extract only command character from input
	 * @param inputFromUser
	 * @return
	 */
	private  String getCommand(String inputFromUser)
	{
		if(inputFromUser.contains("D"))//expecting that last command character is D
		{
			inputFromUser=inputFromUser.substring(0,inputFromUser.indexOf("D"))+"D";
		}
		return inputFromUser.toUpperCase();
	}
	/**
	 * Extract only box character from input
	 * @param inputFromUser
	 * @return
	 */
	private  String getBox(String commandInput)
	{
		if(commandInput.contains("{")) 
		{
			
			commandInput=commandInput.substring(commandInput.indexOf("{")+1,commandInput.length()-1);
		}
		return commandInput;
	}
	
	/**
	 * Validate each characters provided by user 
	 * @param inputFromUser
	 * @return
	 */
	private  boolean validateInputString(String inputFromUser)
	{
		String finalCommand=getCommand(inputFromUser);
		boolean status=true;
		
		for(char c:finalCommand.toCharArray())
		{
			if(Pattern.matches("[FRD]", Character.toString(c)))
			{
				//System.out.println(c);
			}
			else
			{
				System.out.println("Invalid chanracter :"+c);
				status=false;
				break;
			}
		}
		return status;
	}
}
