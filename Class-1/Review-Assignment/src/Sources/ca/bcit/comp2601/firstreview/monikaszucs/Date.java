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
        Integer stepZero;

        if ((getYear() & 3) == 0 && ((getYear() % 25) != 0 || (getYear() & 15) == 0)) {
            stepZero = 6;
        } else if(getYear()%2000 == 1) {
            stepZero = 6;
        } else if(getYear()%1800 == 1) {
            stepZero = 2;
        } else {
            stepZero = 0;
        }

        Integer gettingLastTwoDigitsOfYear = getYear() % 100;
        Integer stepOne = gettingLastTwoDigitsOfYear / 12;
        Integer stepTwo = gettingLastTwoDigitsOfYear - (stepOne * 12);
        Integer stepThree = stepTwo / 4;
        Integer stepFour;

        if(stepZero == 0) {
            stepFour = getDay() + stepThree + stepTwo + stepOne + stepZero;
        } else {
            stepFour = getDay();
        }

        Integer stepFive;
        if(getMonth() == 1) {
            stepFive = stepFour + 1;
        } else if(getMonth() == 2) {
            stepFive = stepFour + 4;
        } else if(getMonth() == 3) {
            stepFive = stepFour + 4;
        } else if(getMonth() == 4) {
            stepFive = stepFour + 0;
        } else if(getMonth() == 5) {
            stepFive = stepFour + 2;
        } else if(getMonth() == 6) {
            stepFive = stepFour + 5;
        } else if(getMonth() == 7) {
            stepFive = stepFour + 0;
        } else if(getMonth() == 8) {
            stepFive = stepFour + 3;
        } else if(getMonth() == 9) {
            stepFive = stepFour + 6;
        } else if(getMonth() == 10) {
            stepFive = stepFour + 1;
        } else if(getMonth() == 11) {
            stepFive = stepFour + 4;
        } else if(getMonth() == 12) {
            stepFive = stepFour + 6;
        } else {
            throw new IllegalArgumentException("Not a valid month");
        }

        Integer stepSix = stepFive % 7;
        String dayOfWeek;

        if(stepSix == 0) {
            dayOfWeek = "sat";
        } else if(stepSix == 1) {
            dayOfWeek = "sun";
        } else if(stepSix == 2) {
            dayOfWeek = "mon";
        } else if(stepSix == 3) {
            dayOfWeek = "tues";
        } else if(stepSix == 4) {
            dayOfWeek = "wed";
        } else if(stepSix == 5) {
            dayOfWeek = "thurs";
        } else if(stepSix == 6) {
            dayOfWeek = "fri";
        } else {
            throw new IllegalArgumentException("You got an illegal day of the week value");
        }

        return dayOfWeek;
    }
}
