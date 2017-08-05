package studentOrientation.util;
/**
 * @author Saurabh Chaudhari
 * @author Sagar Kale
 * Logger Class for Result display.
 */

public class Logger {
	private static int debugValue;
	
	/**
	 * Constructor of Logger initializes data members.
	 * @param debugValueIn
	 */
	public Logger(int debugValueIn){
		setDebugValue(debugValueIn);
		Logger.writeOutput("Constructor of Logger class is called.", 4);
	}
	
	/**
	 * Prints to the screen according the value of debug value.
	 * @param print
	 * @param debugValueIn
	 */
	public static void writeOutput(String print, int debugValueIn){
		if(getDebugValue() == debugValueIn){
			System.out.println(print);
		}
	}

	public static int getDebugValue() {
		return debugValue;
	}

	public void setDebugValue(int debugValue) {
		Logger.debugValue = debugValue;
	}
}
