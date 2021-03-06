import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class TimeToRead {

	public static void main(String[] args) throws IOException {

		
		//intro to the program
		Scanner input = new Scanner(System.in);
		System.out.println(
				  "Hello. This is a program where you can find out both how\n"
				+ "much of the Book of Mormon you need to read to finish it\n"
				+ "according to your own goal, and how long you need to take\n"
				+ " each day to read, based on how fast your read.\n"
				+ "\nFirst, let's find out your goal.\n");
		
		// ask for goal dates
		System.out.print("Enter the start date for your goal (example, March 1): ");
		String startMonth = input.next();
		int startDay = input.nextInt();
		
		System.out.print("\nEnter the end date for your goal (example, August 3): ");
		String endMonth = input.next();
		int endDay = input.nextInt();

		// introduction to WPM test
		WordsPerMinute.wpmIntro();

		// pause for them to get ready to read
		WordsPerMinute.pressAnyKeyToContinue();

		// clear the console (only works when in the command line!)
				WordsPerMinute.clearConsole();
		
		// output file as string
		System.out.print(WordsPerMinute.Paragraph());

		// ask for the time it took to finish

		boolean continueInput = true;

		System.out.print(
				"\n\n\nPlease enter the time in seconds the time it took to finish " + "\nreading the selection: ");

		do {

			try {

				// ask for two integers

				double time = input.nextDouble();

				WordsPerMinute.setTime(time);

				System.out.println("\nHere are your results: \n");

				System.out.printf("Your words per minute (WPM) is: %.2f", WordsPerMinute.WPM());

				continueInput = false;
			}

			// display exception if not integer
			catch (InputMismatchException ex) {
				System.out.print("That is not a number. Please try again: ");
				input.nextLine();
			}
		} while (continueInput);

		// present the time needed to read and other stats 
		boolean ContinueLoop = true;
		do {
			try {
				double chaptersPerDay = AmountToRead.getChaptersPerDay(startMonth, startDay, endMonth, endDay);
				double timeToRead = ReadingDuration.getAmountOfTimeToRead(startMonth, startDay, endMonth, endDay);
				System.out.printf("\nYou should read about %.1f chapters per day to finish your goal.", chaptersPerDay);
				System.out.printf("\nYou should take about %.1f minutes every day to read that amount.\n", timeToRead);
				PrintWriter myfile = new PrintWriter("outputText.txt");
				myfile.println("\nHere are your results:");
				myfile.printf("Your words per minute (WPM) is: %.2f", WordsPerMinute.WPM());
				myfile.printf("\nYou should read about %.2f chapters per day to finish your goal.", chaptersPerDay);
				myfile.printf("\nYou should take about %.2f minutes every day to read that amount.\n", timeToRead);

				System.out.println("\nThe data has been put in a file for you to print/use.\n" + "Have a great day!");
				myfile.close();
				input.close();
				ContinueLoop = false;
			} catch (ArithmeticException e) {
				System.out.println("Error. Please re-enter your start and end goal dates.");
				System.out.print("Start date (example, March 1: ");
				startMonth = input.next();
				startDay = input.nextInt();
				System.out.print("End date (example, August 3): ");
				endMonth = input.next();
				endDay = input.nextInt();
				input.nextLine();

			}
		} while (ContinueLoop);

	}
}
