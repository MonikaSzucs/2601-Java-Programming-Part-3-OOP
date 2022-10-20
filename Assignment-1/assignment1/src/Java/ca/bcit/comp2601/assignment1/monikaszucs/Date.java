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

    private static final int MIN_YEAR = 0;
    private static final int MAX_MONTH = 12;
    private static final int MIN_MONTH = 1;
    private static final int DOUBLE_DIGITS_BREAK_POINT_MONTHS = 10;
    private static final int DOUBLE_DIGITS_BREAK_POINT_DAYS = 10;

    private static final int GET_DAY_BEFORE = 1;
    private static final int GET_DAY_AFTER = 1;
    private static final int DAY_INVALID_LOW_NUMBER = 0;

    private static final int GET_MONTH_BEFORE = 1;
    private static final int GET_MONTH_AFTER = 1;
    private static final int GET_MONTH_ROLLOVER = 13;

    private static final int MONTH_INVALID_LOW_NUMBER = 0;
    private static final int GET_YEAR_BEFORE = 1;
    private static final int GET_YEAR_AFTER = 1;

    private static final int ZEROTH_STEP_GETTING_LAST_TWO_DIGITS_OF_YEAR = 100;
    private static final int ZEROTH_STEP_YEAR_DIVISIBLE_FOUR_HUNDRED = 400;
    private static final int ZEROTH_STEP_REMAINDER_EMPTY = 0;
    private static final int FIRST_STEP_ALGORITHM = 12;
    private static final int THIRD_STEP_ALGORITHM = 4;

    private static final int GET_FIRST_MONTH = 1;
    private static final int GET_SECOND_MONTH = 2;
    private static final int YEAR_DIVISIBLE_BY_FOUR = 4;
    private static final int YEAR_DIVISIBLE_BY_FOUR_IS_ZERO = 0;

    private static final int FIFTH_STEP_ALGORITHM_INCREMENT_BY_SIX = 6;
    private static final int FIFTH_STEP_ALGORITHM_INCREMENT_BY_FOUR = 4;
    private static final int FIFTH_STEP_ALGORITHM_INCREMENT_BY_TWO = 2;

    private static final int SIXTEEN_HUNDREDS = 1600;
    private static final int SEVENTEEN_HUNDREDS = 1700;
    private static final int EIGHTEEN_HUNDREDS = 1800;
    private static final int NINETEEN_HUNDREDS = 1900;
    private static final int TWO_THOUSANDS = 2000;
    private static final int TWENTY_ONE_HUNDREDS = 2100;
    private static final int TWENTY_TWO_HUNDREDS = 2200;

    private static final int SIXTH_STEP_MODULE = 7;

    private static final int SATURDAY_NUMERIC_VALUE = 0;
    private static final int SUNDAY_NUMERIC_VALUE = 1;
    private static final int MONDAY_NUMERIC_VALUE = 2;
    private static final int TUESDAY_NUMERIC_VALUE = 3;
    private static final int WEDNESDAY_NUMERIC_VALUE = 4;
    private static final int THURSDAY_NUMERIC_VALUE = 5;
    private static final int FRIDAY_NUMERIC_VALUE = 6;

    private static final int JANUARY_NUMERIC_VALUE = 1;
    private static final int FEBRUARY_NUMERIC_VALUE = 2;
    private static final int MARCH_NUMERIC_VALUE = 3;
    private static final int APRIL_NUMERIC_VALUE = 4;
    private static final int MAY_NUMERIC_VALUE = 5;
    private static final int JUNE_NUMERIC_VALUE = 6;
    private static final int JULY_NUMERIC_VALUE = 7;
    private static final int AUGUST_NUMERIC_VALUE = 8;
    private static final int SEPTEMBER_NUMERIC_VALUE = 9;
    private static final int OCTOBER_NUMERIC_VALUE = 10;
    private static final int NOVEMBER_NUMERIC_VALUE = 11;
    private static final int DECEMBER_NUMERIC_VALUE = 12;

    private static final int STARTING_CODE_FOR_MONTH_VALUE = 0;
    private static final int JANUARY_CODE_VALUE = 1;
    private static final int FEBRUARY_CODE_VALUE = 4;
    private static final int MARCH_CODE_VALUE = 4;
    private static final int APRIL_CODE_VALUE = 0;
    private static final int MAY_CODE_VALUE = 2;
    private static final int JUNE_CODE_VALUE = 5;
    private static final int JULY_CODE_VALUE = 0;
    private static final int AUGUST_CODE_VALUE = 3;
    private static final int SEPTEMBER_CODE_VALUE = 6;
    private static final int OCTOBER_CODE_VALUE = 1;
    private static final int NOVEMBER_CODE_VALUE = 4;
    private static final int DECEMBER_CODE_VALUE = 6;

    private static final int TWENTY_EIGHTH = 28;
    private static final int TWENTY_NINETH = 29;
    private static final int THIRTYTH = 30;
    private static final int THIRTY_FIRST = 31;

    private static final int NEGATIVE_COMPARE_TO = -1;
    private static final int POSITIVE_COMPARE_TO = 1;
    private static final int NEUTRAL_COMPARE_TO = 0;

    /**
     * @param day the day of the month
     * @param month the month numerical value
     * @param year the year of the date
     */
    Date(final int day, final int month, final int year) {
        if(year <= MIN_YEAR) {
            throw new IllegalArgumentException("invalid year");
        }
        if(month > MAX_MONTH || month < MIN_MONTH) {
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

        if(getMonth() < DOUBLE_DIGITS_BREAK_POINT_MONTHS) {
            formattedMonth = "0" + getMonth();
        }
        if(getDay() < DOUBLE_DIGITS_BREAK_POINT_DAYS) {
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

        dayBefore = getDay() - GET_DAY_BEFORE;
        month = getMonth();
        year = getYear();

        if(dayBefore == DAY_INVALID_LOW_NUMBER) {
            month = getMonth() - GET_MONTH_BEFORE;
            if (month == MONTH_INVALID_LOW_NUMBER) {
                month = MAX_MONTH;
                year = getYear() - GET_YEAR_BEFORE;
            }
            dayBefore = getNumberOfDaysPerMonth(month, year);
        }

        return new Date(dayBefore, month, year) {
            @Override
            public int compareTo(Object o) {
                return NEUTRAL_COMPARE_TO;
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

        dayNext = getDay() + GET_DAY_AFTER;
        month = getMonth();
        year = getYear();

        if(dayNext > getNumberOfDaysPerMonth(getMonth(), getYear())) {
            month = getMonth() + GET_MONTH_AFTER;
            if (month == GET_MONTH_ROLLOVER) {
                month = MIN_MONTH;
                year = getYear() + GET_YEAR_AFTER;
            }
            dayNext = GET_DAY_AFTER;
        }

        return new Date(dayNext, month, year) {
            @Override
            public int compareTo(Object o) {
                return NEUTRAL_COMPARE_TO;
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

        grabbingLastTwoDigitsOfTheYear = getYear() % ZEROTH_STEP_GETTING_LAST_TWO_DIGITS_OF_YEAR;
        stepOne = grabbingLastTwoDigitsOfTheYear / FIRST_STEP_ALGORITHM;
        stepTwo = grabbingLastTwoDigitsOfTheYear - (stepOne * FIRST_STEP_ALGORITHM);
        stepThree = stepTwo / THIRD_STEP_ALGORITHM;
        stepFour = getDay();
        stepFive = getCodeForMonth(getMonth());

        // calculating leap year
        if((getMonth() == GET_FIRST_MONTH || getMonth() == GET_SECOND_MONTH) && (getYear() % YEAR_DIVISIBLE_BY_FOUR == YEAR_DIVISIBLE_BY_FOUR_IS_ZERO)) {
            stepFive += FIFTH_STEP_ALGORITHM_INCREMENT_BY_SIX;
        } else if(getYear() >= SIXTEEN_HUNDREDS && getYear() < SEVENTEEN_HUNDREDS) {
            stepFive += FIFTH_STEP_ALGORITHM_INCREMENT_BY_SIX;
        } else if(getYear() >= SEVENTEEN_HUNDREDS && getYear() < EIGHTEEN_HUNDREDS) {
            stepFive += FIFTH_STEP_ALGORITHM_INCREMENT_BY_FOUR;
        } else if(getYear() >= EIGHTEEN_HUNDREDS && getYear() < NINETEEN_HUNDREDS) {
            stepFive += FIFTH_STEP_ALGORITHM_INCREMENT_BY_TWO;
        } else if(getYear() >= TWO_THOUSANDS && getYear() < TWENTY_ONE_HUNDREDS) {
            stepFive += FIFTH_STEP_ALGORITHM_INCREMENT_BY_SIX;
        } else if(getYear() >= TWENTY_ONE_HUNDREDS && getYear() < TWENTY_TWO_HUNDREDS) {
            stepFive += FIFTH_STEP_ALGORITHM_INCREMENT_BY_FOUR;
        }

        stepSix = (stepOne + stepTwo + stepThree + stepFour + stepFive) % SIXTH_STEP_MODULE;

        if(stepSix == SATURDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Saturday";
        } else if(stepSix == SUNDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Sunday";
        } else if(stepSix == MONDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Monday";
        } else if(stepSix == TUESDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Tuesday";
        } else if(stepSix == WEDNESDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Wednesday";
        } else if(stepSix == THURSDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Thursday";
        } else if(stepSix == FRIDAY_NUMERIC_VALUE) {
            dayOfTheWeek = "Friday";
        }

        return dayOfTheWeek;
    }

    private int getCodeForMonth(int month) {
        int codeForMonth = STARTING_CODE_FOR_MONTH_VALUE;

        if(month == JANUARY_NUMERIC_VALUE) {
            codeForMonth = JANUARY_CODE_VALUE;
        } else if(month == FEBRUARY_NUMERIC_VALUE) {
            codeForMonth = FEBRUARY_CODE_VALUE;
        } else if(month == MARCH_NUMERIC_VALUE) {
            codeForMonth = MARCH_CODE_VALUE;
        } else if(month == APRIL_NUMERIC_VALUE) {
            codeForMonth = APRIL_CODE_VALUE;
        } else if(month == MAY_NUMERIC_VALUE) {
            codeForMonth = MAY_CODE_VALUE;
        } else if(month == JUNE_NUMERIC_VALUE) {
            codeForMonth = JUNE_CODE_VALUE;
        } else if(month == JULY_NUMERIC_VALUE) {
            codeForMonth = JULY_CODE_VALUE;
        } else if(month == AUGUST_NUMERIC_VALUE) {
            codeForMonth = AUGUST_CODE_VALUE;
        } else if(month == SEPTEMBER_NUMERIC_VALUE) {
            codeForMonth = SEPTEMBER_CODE_VALUE;
        } else if(month == OCTOBER_NUMERIC_VALUE) {
            codeForMonth = OCTOBER_CODE_VALUE;
        } else if(month == NOVEMBER_NUMERIC_VALUE) {
            codeForMonth = NOVEMBER_CODE_VALUE;
        } else if(month == DECEMBER_NUMERIC_VALUE) {
            codeForMonth = DECEMBER_CODE_VALUE;
        }

        return codeForMonth;
    }

    /**
     * @param month the month
     * @param year the year
     * @return the number of days per month based on the year
     */
    private int getNumberOfDaysPerMonth(final int month, final int year) {
        if(month == GET_SECOND_MONTH) {
            if(isLeapYear()) {
                return TWENTY_NINETH;
            } else {
                return TWENTY_EIGHTH;
            }
        } else if (month == APRIL_NUMERIC_VALUE || month == JUNE_NUMERIC_VALUE || month == SEPTEMBER_NUMERIC_VALUE || month == NOVEMBER_NUMERIC_VALUE) {
            return THIRTYTH;
        } else {
            return THIRTY_FIRST;
        }
    }

    /**
     * @return if the year is a leap year or not
     */
    private boolean isLeapYear() {
        return (((getYear() % YEAR_DIVISIBLE_BY_FOUR == YEAR_DIVISIBLE_BY_FOUR_IS_ZERO) && (getYear() % ZEROTH_STEP_GETTING_LAST_TWO_DIGITS_OF_YEAR != ZEROTH_STEP_REMAINDER_EMPTY)) || (getYear() % ZEROTH_STEP_YEAR_DIVISIBLE_FOUR_HUNDRED == ZEROTH_STEP_REMAINDER_EMPTY));
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
            return NEGATIVE_COMPARE_TO;
        }
        else if(temp.getYear()<this.getYear()){
            return POSITIVE_COMPARE_TO;
        }
        else if(temp.getMonth()>this.getMonth()) {
            return NEGATIVE_COMPARE_TO;
        }
        else if(temp.getMonth()<this.getMonth()) {
            return POSITIVE_COMPARE_TO;
        }
        else if(temp.getDay()>this.getDay()) {
            return NEGATIVE_COMPARE_TO;
        }
        else if(temp.getDay()<this.getDay()) {
            return POSITIVE_COMPARE_TO;
        }
        return NEUTRAL_COMPARE_TO;
    }
}
