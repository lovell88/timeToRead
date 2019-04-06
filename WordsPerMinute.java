import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.scanner;

public class WordsPerMinute {

	public static String Paragraph throws IOException () {
		
		/* TODO
		 * Read paragraph from file and display on console. Instruct user to time themselves
		 */
		
		String verse = "";
		
		verse = new String ( Files.readAllBytes( Paths.get(sampleText.txt) ) );
		
		
//		Scanner input = new Scanner(sampleText.txt);
//		
//		while (input.hasNext()) {
//			String verse = 
//		}
		
		
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
