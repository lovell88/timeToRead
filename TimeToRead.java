import java.util.*;

public class TimeToRead {
	
	public static void main(String[] args) {
		
		
		//ask for goal dates **TO BE ADDED BY ROBERT**
		
		//introduction to WPM test
		WordsPerMinute.wpmIntro();
		
		//pause for them to get ready to read
		WordsPerMinute.pressAnyKeyToContinue();
		
		//clear the console (only works when in the command line!)
		
		WordsPerMinute.clearConsole();
		
		//output file as string
		System.out.print(WordsPerMinute.Paragraph());
		
		//ask for the time it took to finish
		Scanner input = new Scanner(System.in);
		
		boolean continueInput = true;
		
		System.out.print("\n\n\nPlease enter the time in seconds the time it took to finish " + 
				"\nreading the selection: ");
		
		do {
				
			try {
				
				//ask for two integers
				
				double time = input.nextDouble();
				
				WordsPerMinute.setTime(time);
			
				System.out.printf("\nYour words per minute (WPM) is: %.2f", WordsPerMinute.WPM());
				
				continueInput = false;
			}
		
			//display exception if not integer
			catch (InputMismatchException ex) {
				System.out.print("That is not a number. Please try again: ");
				input.nextLine();
			}
		}	while (continueInput);
		
		
		//present the time needed to read and other stats **TO BE ADDED BY ROBERT**
		
		
		
		
		
	}
}
