public class AmountToRead {
    final static int totalChaptersInBOM = 239;
    final static int totalWordsInBOM = 267931;

    public AmountToRead() {
    }

    public static int getAmountOfDays(String startMonth, int startDay, String endMonth, int endDay) {
        //configure what date was entered and then calculate the amount of days it will take to read the Book of Mormon
        int dayStartSum = 0;
        switch (startMonth) {
        case "January":
            dayStartSum = 0;
            break;
        case "February":
            dayStartSum = 31;
            break;
        case "March":
            dayStartSum = 59;
            break;
        case "April":
            dayStartSum = 90;
            break;
        case "May":
            dayStartSum = 120;
            break;
        case "June":
            dayStartSum = 151;
            break;
        case "July":
            dayStartSum = 181;
            break;
        case "August":
            dayStartSum = 212;
            break;
        case "September":
            dayStartSum = 243;
            break;
        case "October":
            dayStartSum = 273;
            break;
        case "November":
            dayStartSum = 304;
            break;
        case "December":
            dayStartSum = 334;
            break;
        }
        dayStartSum += startDay;
        int dayEndSum = 0;

        switch (endMonth) {
        case "January":
            dayEndSum = 0;
            break;
        case "February":
            dayEndSum = 31;
            break;
        case "March":
            dayEndSum = 59;
            break;
        case "April":
            dayEndSum = 90;
            break;
        case "May":
            dayEndSum = 120;
            break;
        case "June":
            dayEndSum = 151;
            break;
        case "July":
            dayEndSum = 181;
            break;
        case "August":
            dayEndSum = 212;
            break;
        case "September":
            dayEndSum = 243;
            break;
        case "October":
            dayEndSum = 273;
            break;
        case "November":
            dayEndSum = 304;
            break;
        case "December":
            dayEndSum = 334;
            break;
        }
        dayEndSum += endDay;
        int difference = dayEndSum - dayStartSum;
        return difference;
    }

    public static double getWordsPerDay(String startMonth, int startDay, String endMonth, int endDay) {
        //Calculate how many words in The Book or Mormon needs to be read per day (not to be seen by the user
        // but for calculations)
        int amountOfDays = getAmountOfDays(startMonth, startDay, endMonth, endDay);
        double wordsPerDay = totalWordsInBOM / (double) amountOfDays;
        return wordsPerDay;
    }

    public static double getChaptersPerDay(String startMonth, int startDay, String endMonth, int endDay) {
        // Calculate the average amount of chapters one needs to read every day.
        int amountOfDays = getAmountOfDays(startMonth, startDay, endMonth, endDay);
        double chaptersPerDay = (double) totalChaptersInBOM / (double) amountOfDays;
        return chaptersPerDay;
    }
}
