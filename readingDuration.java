public class ReadingDuration {
    private static double wordsPerMinute = WordsPerMinute.WPM();

    public ReadingDuration() {
    }

    public static double getAmountOfTimeToRead(String startMonth, int startDay, String endMonth, int endDay) {
        // Calculate how long the user needs to read every day by dividing average words a day with the words per minute
        double wordsPerDay = AmountToRead.getWordsPerDay(startMonth, startDay, endMonth, endDay);
        double amountOfTimeToRead = wordsPerDay / wordsPerMinute;
        return amountOfTimeToRead;
    }
}
