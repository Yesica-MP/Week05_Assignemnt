package week05Assignment;

public class SpacedLogger implements Logger{


	@Override
	public void log(String log) {
		
		System.out.print("\n" + log.replaceAll("", " ")+"\n");

			
	}

	@Override
	public void error(String error) {
		System.out.print("\n" + "ERROR:" + error.replaceAll("", " "));
		
		
	}

}
