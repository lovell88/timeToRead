public class amountToRead {

    public amountToRead() {}

    public amountToRead(String StartDateGoal, String endDateGoal) {
        this.StartDateGoal = startDateGoal;
        this.EndDateGoal = endDateGoal;
    }

    public int getAmountOfDays() {
        /* TODO
        calculate the amount of days between the start date and the end date.
        */
        return 100;
    }

    public double getWordsPerDay() {
        /*TODO
        calculate amount of words to read in one day.
        */
        return 2680;
    }

    public int getChaptersPerDay() {
     /* TODO
     divide the amount of chapters in the Book of Mormon with how many days you are 
     reading. */
        return 239/100;
    }

    public void printResults() {

    }
}
