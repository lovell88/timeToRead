public class readingDuration {
    private int wordsPerMinute;
    private int wordsPerDay = amountToRead.getWordsPerDay;

    public readingDuration() {}

    public readingDuration(int wordsPerMinute, int wordsPerDay) {
        this.wordsPerMinute = wordsPerMinute;
        this.wordsPerDay = wordsPerDay;
    }

    public double getAmountOfTimeToRead() {
        double amountOfTimeToRead = wordsPerDay / wordsPerMinute;
        return amountOfTimeToRead;
    }

}
