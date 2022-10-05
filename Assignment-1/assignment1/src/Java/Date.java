class Date {
    private int day;
    private int month;
    private int year;

    Date(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getYyyyMmDd() {
        return "";
    }

//    public String toString() {
//        do this later
//    }

    public Date previous() {
        return Date;
    }

    public Date next() {
        return Date;
    }

    public int compareTo(final Date d) {
        return "";
    }

    public String getDateOfTheWeek() {
        return "";
    }

    private int getNumberOfDaysPerMonth(final int month, final int year) {
        return 2;
    }

    private boolean isLeapYear() {
        return true;
    }
}
