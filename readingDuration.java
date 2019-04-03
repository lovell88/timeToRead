public class readingDuration {
    private int wordsPerMinute;
    private int wordsPerDay;

    public amountToRead() {}

    public amountToRead(int wordsPerMinute, int wordsPerDay, double chaptersPerDay) {
        this.wordsPerMinute = wordsPerMinute;
        this.wordsPerDay = wordsPerDay;
        this.chaptersPerDay = chaptersPerday;

    }

    public double getAmountOfTimeToRead() {
        double amountOfTimeToRead = wordsPerDay / wordsPerMinute;
        return amountOfTimeToRead;
    }

}
