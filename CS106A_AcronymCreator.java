//CS106A_AcronymCreator
/**
 * File: CS106A_AcronymCreator.java
 * -----------------------------------
 * The CS106A_AcronymCreator class creates an 
 * acronym from a client provided string.
 *
 * */

import acm.program.*;
import java.util.*; //for the StringTokenizer

public class CS106A_AcronymCreator extends ConsoleProgram
{
	/* Named constants */
	private static final String SENTINEL = "exit";
	private static final String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	
	public void run()
	{
		introduceApp();
		while (true){
			String clientString = readLine("Enter a string: ");
			if (clientString.equals(SENTINEL)){
				println("goodbye");
				break;
			}
				
			println(createAcronymFrom(clientString));
		}
	}
	
	
	/**
	 * Introduces the app an its deactivating SENTINEL value.
	 * */
	private void introduceApp()
	{
		println("The CS106A_AcronymCreator class creates an " +
				"acronym from a client provided string. This will" +
				" go indefinitely; Type 'exit' to end program.");
	}
	
	
	/**
	 * Creates an acronym based on every first letter of a 
	 * client provided String.
	 * @param clientString The string to be made into an acronym
	 * @return The acronym created from the client's input
	 * */
	private String createAcronymFrom(String clientString)
	{
		String acronym = "";
		
		StringTokenizer tokenizer = new StringTokenizer(clientString, DELIMITERS);
		while (tokenizer.hasMoreTokens()){
			String token = tokenizer.nextToken();
			acronym += token.toUpperCase().charAt(0);
		}
		
		return acronym;
	}
	
	/* Instance variables */
}
