package week5Project;

public class AsteriskLogger implements Logger {
	
	// Overrides the log method to display the message surrounded by asterisks
	@Override
	public void log(String message) {
		
		System.out.println("***" + message + "***");
		
	}
	 // Overrides the error method to display the error message surrounded by asterisks
	@Override
	public void error(String errMessage) {
		String border = "****************"; // border for the error box
        System.out.println(border);
        System.out.println("***ERROR: " + errMessage + "***");
        System.out.println(border);
		
	}

	
	
	

}
