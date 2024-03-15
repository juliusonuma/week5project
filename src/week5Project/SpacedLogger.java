package week5Project;

public class SpacedLogger implements Logger {

	
	// Overrides the log method to display the message with spaces between characters
	@Override
	
	//A simple way can be to split the string on each character and join the parts using space as the delimiter.
	// delimiter is "  " and elements are the characters split using the function message.split("") 
	
	public void log(String message) {
		
		message  = String.join(" ", message.split(""));
	        System.out.println(message);
		       
	}
	// Overrides the error method to display the error message with spaces between characters
	@Override
	
	//Split the string on each character and join the parts using space as the delimiter
	// delimiter is "  " and elements are the characters split using the function  errMessage.split("")
	
	public void error(String errMessage) {
		
		
	  errMessage  = String.join(" ", errMessage.split(""));
		
	       System.out.println("ERROR: " + "" + (errMessage));

	        
	}

}
