package wk5_CodingAssignment;


public class Application {
	
	static Logger Logger;

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("\n***Good-bye***");
		logger.Error(
		"\n********************" 
		+ "\nError: Good-bye\n" 
		+ "********************");
		
		setLogger(new AsteriskLogger());
		setLogger(new SpacedLogger());
	}
	
	private static void setLogger(Logger l) {
		Logger = l;
	}

}
