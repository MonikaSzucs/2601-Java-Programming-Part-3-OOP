package ca.bcit.comp2601.firstreview.monikaszucs;

import java.time.Month;
import java.util.Objects;

class Date {
    private int     year;
    private int     month;
    private int     day;

    private int MIN_YEAR        = 1;
    private int MAX_YEAR        = 2022;
    private int MIN_MONTH       = 1;
    private int MAX_MONTH       = 12;

    private boolean IS_LEAPYEAR = false;

    Date(final int year, final int month, final int day) {
        setYear(year);
        setMonth(month);
        setDays(day);
    }

    public void setYear(int year) {
        if(year > MIN_YEAR && year < MAX_YEAR) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("The year is either smaller than " + MIN_YEAR + " or greater than " + MAX_YEAR);
        }
    }

    public void setMonth(int month) {
        if(month > MIN_MONTH && month < MAX_MONTH) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("The month is either smaller than " + MIN_MONTH+ " or greater than " + MAX_MONTH);
        }
    }

    public void setDays(int day) {
        if(month == 1) {
            Month month = Month.JANUARY;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 2) {
            Month month = Month.FEBRUARY;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 3) {
            Month month = Month.MARCH;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 4) {
            Month month = Month.APRIL;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 5) {
            Month month = Month.MAY;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 6) {
            Month month = Month.JUNE;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 7) {
            Month month = Month.JULY;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 8) {
            Month month = Month.AUGUST;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 9) {
            Month month = Month.SEPTEMBER;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 10) {
            Month month = Month.OCTOBER;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 11) {
            Month month = Month.NOVEMBER;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        } else if(month == 12) {
            Month month = Month.DECEMBER;
            Integer days = month.length(IS_LEAPYEAR);
            if(day >= 1 && day <= days) {
                this.day = day;
            }
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getYYYYMMDD() {
        String monthString;
        String dayString;

        monthString = "";
        dayString = "";

        if(getMonth() >= 10) {
            monthString = String.valueOf(getMonth());
        } else {
            monthString = "0" + String.valueOf(getMonth());
        }

        if(getDay() >= 10) {
            dayString = String.valueOf(getDay());
        } else {
            dayString = "0" + String.valueOf(getDay());
        }

        return getYear() + "-" + monthString + "-" + dayString;
    }

    public String getDayOfTheWeek() {
        
    }
}
