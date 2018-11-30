/** 
  * Starter File for Contest Problems
  * like the Baldwin Wallace or BYTE competitions
  */
  
import java.util.Scanner;
  
public class ContestProblem
{
	/* ----------------------------------
	   Here, write a method to solve the given problem.
	   It should take the parameters of the question,
	   passed from the main method.
	   ----------------------------------  */
	 
	 
	 /* ---------------------------------
	    The main method first reads the number of cases
	    to solve, then reads the parameters for each case.
		---------------------------------  */
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for (int i = 1; i <= numCases; i++)
		{
			// Read any parameters for the problem.
			// If reading a String after an int, you
			// may need to clear the line first with input.nextLine();
			
			
			// Call your method that solves the problem.
			// Pass it the parameters you just read.
			
			
			// Write the output to your problem.
		}
		input.close();
	}
}