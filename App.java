package week05Assignment;



public class App {

	public static void main(String[] args) {
	
		Logger logger = new AsteriskLogger();
		
		logger.log("Hi");
		logger.error("Hello");
		
	
		Logger logger1 = new SpacedLogger();
		logger1.log("My name");
		logger1.error("hello!!!");

	}

}
