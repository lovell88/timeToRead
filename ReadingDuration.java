public class ReadingDuration extends WordsPerMinute {
    private static double wordsPerMinute = WordsPerMinute.WPM();

    public ReadingDuration() {
    }

    public static double getAmountOfTimeToRead(String startMonth, int startDay, String endMonth, int endDay) {
        double wordsPerDay = AmountToRead.getWordsPerDay(startMonth, startDay, endMonth, endDay);
        double amountOfTimeToRead = wordsPerDay / wordsPerMinute;
        return amountOfTimeToRead;
    }
}
