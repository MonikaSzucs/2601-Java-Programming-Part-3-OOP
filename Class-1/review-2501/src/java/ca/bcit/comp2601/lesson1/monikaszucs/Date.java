package ca.bcit.comp2601.lesson1.monikaszucs;

public class Date {
    private String month;

    Date(final String month) {
        setMonth(month);
    }

    public void setMonth(String month) {
        this.month = month;
    }

    String getMonth() {
        return month;
    }
}
