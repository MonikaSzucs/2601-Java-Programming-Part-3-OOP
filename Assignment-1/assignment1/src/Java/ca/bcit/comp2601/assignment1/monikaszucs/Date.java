package ca.bcit.comp2601.assignment1.monikaszucs;

/**
 * Date.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Assignment 1
 *
 * @author Monika Szucs
 * @version 1.1
 *
 * @Implements Orderable
 * @Implements Comparable
 */
class Date implements Orderable, Comparable {
    private final int day;
    private final int month;
    private final int year;

    /**
     * @param day the day of the month
     * @param month the month numerical value
     * @param year the year of the date
     */
    Date(final int day, final int month, final int year) {
        if(year <= 0) {
            throw new IllegalArgumentException("invalid year");
        }
        if(month > 12 || month < 1) {
            throw new IllegalArgumentException("invalid month");
        }
        this.day = day;
        this.month = month;
        this.year = year;

        if(day > getNumberOfDaysPerMonth(month, year)) {
            throw new IllegalArgumentException("invalid day of the month");
        }
    }

    /**
     * @return the day of the month
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month in numerical value
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the year of the date
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the formatted date in YYYY-MM-DD
     */
    public String getYyyyMmDd() {
        String formattedDate;
        String formattedMonth;
        String formattedDay;

        formattedMonth = Integer.toString(getMonth());
        formattedDay = Integer.toString(getDay());

        if(getMonth() < 10) {
            formattedMonth = "0" + getMonth();
        }
        if(getDay() < 10) {
            formattedDay = "0" + getDay();
        }

        formattedDate = String.format("%s-%s-%s",getYear(),formattedMonth,formattedDay);

        return formattedDate;
    }

    /**
     * @return the previous Date
     */
    public Date previous() {
        int dayBefore;
        int month;
        int year;

        dayBefore = getDay() - 1;
        month = getMonth();
        year = getYear();

        if(dayBefore == 0) {
            month = getMonth() - 1;
            if (month == 0) {
                month = 12;
                year = getYear() - 1;
            }
            dayBefore = getNumberOfDaysPerMonth(month, year);
        }

        return new Date(dayBefore, month, year) {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    /**
     * @return the next date in Date format
     */
    public Date next() {
        int dayNext;
        int month;
        int year;

        dayNext = getDay() + 1;
        month = getMonth();
        year = getYear();

        if(dayNext > getNumberOfDaysPerMonth(getMonth(), getYear())) {
            month = getMonth() + 1;
            if (month == 13) {
                month = 1;
                year = getYear() + 1;
            }
            dayNext = 1;
        }

        return new Date(dayNext, month, year) {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    /**
     * @return the day of the week;
     */
    public String getDayOfTheWeek() {
        String dayOfTheWeek = null;

        int grabbingLastTwoDigitsOfTheYear;
        int stepOne;
        int stepTwo;
        int stepThree;
        int stepFour;
        int stepFive;

        int stepSix;

        grabbingLastTwoDigitsOfTheYear = getYear() % 100;
        stepOne = grabbingLastTwoDigitsOfTheYear / 12;
        stepTwo = grabbingLastTwoDigitsOfTheYear - (stepOne * 12);
        stepThree = stepTwo / 4;
        stepFour = getDay();
        stepFive = getCodeForMonth(getMonth());

        // calculating leap year
        if((getMonth() == 1 || getMonth() == 2) && (getYear() % 4 == 0)) {
            stepFive += 6;
        } else if(getYear() >= 1600 && getYear() < 1700) {
            stepFive += 6;
        } else if(getYear() >= 1700 && getYear() < 1800) {
            stepFive += 4;
        } else if(getYear() >= 1800 && getYear() < 1900) {
            stepFive += 2;
        } else if(getYear() >= 2000 && getYear() < 2100) {
            stepFive += 6;
        } else if(getYear() >= 2100 && getYear() < 2200) {
            stepFive += 4;
        }

        stepSix = (stepOne + stepTwo + stepThree + stepFour + stepFive) % 7;

        if(stepSix == 0) {
            dayOfTheWeek = "Saturday";
        } else if(stepSix == 1) {
            dayOfTheWeek = "Sunday";
        } else if(stepSix == 2) {
            dayOfTheWeek = "Monday";
        } else if(stepSix == 3) {
            dayOfTheWeek = "Tuesday";
        } else if(stepSix == 4) {
            dayOfTheWeek = "Wednesday";
        } else if(stepSix == 5) {
            dayOfTheWeek = "Thursday";
        } else if(stepSix == 6) {
            dayOfTheWeek = "Friday";
        }

        return dayOfTheWeek;
    }

    private int getCodeForMonth(int month) {
        int codeForMonth = 0;

        if(month == 1) {
            codeForMonth = 1;
        } else if(month == 2) {
            codeForMonth = 4;
        } else if(month == 3) {
            codeForMonth = 4;
        } else if(month == 4) {
            codeForMonth = 0;
        } else if(month == 5) {
            codeForMonth = 2;
        } else if(month == 6) {
            codeForMonth = 5;
        } else if(month == 7) {
            codeForMonth = 0;
        } else if(month == 8) {
            codeForMonth = 3;
        } else if(month == 9) {
            codeForMonth = 6;
        } else if(month == 10) {
            codeForMonth = 1;
        } else if(month == 11) {
            codeForMonth = 4;
        } else if(month == 12) {
            codeForMonth = 6;
        }

        return codeForMonth;
    }

    /**
     * @param month the month
     * @param year the year
     * @return the number of days per month based on the year
     */
    private int getNumberOfDaysPerMonth(final int month, final int year) {
        if(month == 2) {
            if(isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    /**
     * @return if the year is a leap year or not
     */
    private boolean isLeapYear() {
        return (((getYear() % 4 == 0) && (getYear() % 100 != 0)) || (getYear() % 400 == 0));
    }

    /**
     * @return the date information in toString format
     */
    @Override
    public String toString() {
        return "Date{" +
                "day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear() +
                '}';
    }

    /**
     * @param o the Object
     * @return if the date year, month or day is the previous, next or same as the current objects
     */
    @Override
    public int compareTo(final Object o) {
        if(o.getClass() != Date.class){
            throw new IllegalArgumentException("Comparing date object to an object of a different class.");
        }
        Date temp = (Date) o;
        if(temp.getYear()>this.getYear()){
            return -1;
        }
        else if(temp.getYear()<this.getYear()){
            return 1;
        }
        else if(temp.getMonth()>this.getMonth()) {
            return -1;
        }
        else if(temp.getMonth()<this.getMonth()) {
            return 1;
        }
        else if(temp.getDay()>this.getDay()) {
            return -1;
        }
        else if(temp.getDay()<this.getDay()) {
            return 1;
        }
        return 0;
    }
}
