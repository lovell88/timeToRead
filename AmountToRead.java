public class amountToRead {
    final int totalChaptersInBOM = 239;
    final int totalWordsInBOM = 267931;
    private String startDateGoal;
    private String endDateGoal;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public amountToRead() {}

    public amountToRead(String StartDateGoal, String endDateGoal) {
        this.StartDateGoal = startDateGoal;
        this.EndDateGoal = endDateGoal;
    }

    public int getAmountOfDays() {
        int AmountOfDays = -1;
        Date dateStart = simpleDateFormat.parse(startDateGoal);
        Date dateEnd = simpleDateFormat.parse(endDateGoal);
        AmountOfDays = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
        return AmountOfDays;
    }

    public double getWordsPerDay() {
        amountOfDays = getAmountOfDays();
        double wordsPerDay = totalWordsInBOM / amountOfDays;
        return wordsPerDay;
    }

    public int getChaptersPerDay() {
        int amountOfDays = getAmountOfDays();
        int chaptersPerDay = totalChaptersInBOM / amountOfDays;
        return chaptersPerDay;
    }

    public void printResults() {

    }
    
    
}
