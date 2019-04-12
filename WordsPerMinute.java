import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;




public class WordsPerMinute {

	String filePath = "sampleText.txt";
	static double time = 0;
	
	// method to clear the console
	public final static void clearConsole()	{
		
		try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}

	}
	
	// present an introduction to the WPM test paragraph
	public final static void wpmIntro() {
		
		System.out.println("\nNext step: \n\n" +
							"You will soon be presented with a paragraph to read that will help\n" +
							"us determine your Words Per Minute (WPM).\n\n" +
							"Please grab a stopwatch. Begin timing as soon as you press the Enter key.\n");
		
	}
	
	 // method to hold the program until the Enter key is pressed
	 public final static void pressAnyKeyToContinue() {
		 
	        System.out.println("Press Enter key to continue...");
	        try {
	            System.in.read();
	        } 
	        
	        catch(Exception e) {}
	        
	 }
	
	// read the sample paragraph from a file
	public static String Paragraph() {
		
				
		String filePath = "sampleText.txt";
		String verse = "";
		
		try {
			verse = new String ( Files.readAllBytes( Paths.get(filePath) ) );
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		 
		return verse;
		
		
		
	}
	
	// pass the inputed time to the method
	
	public static void setTime (double newTime) {
		time = newTime;
	}
	
	// determine the WPM
	public static double WPM () {
		
		//247 words in paragraph
		
		return (247 / time) * 60;
	}
	
	
}
