import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class WordsPerMinute {

	String filePath = "sampleText.txt";
	
	public static String Paragraph() {
		
		/* TODO
		 * Read paragraph from file and display on console. Instruct user to time themselves
		 */
//		
		
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
	
	public double wPM () {
		
		double wordsPerMinute = 0;
		
		/* TODO 
		 * Have the user enter how many seconds it took to read it, and then calculate file TEST ADDED!!
		 */
		
		return wordsPerMinute;
	}
	
	
}
