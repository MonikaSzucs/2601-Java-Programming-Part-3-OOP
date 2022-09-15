package ca.bcit.comp2601.firstreview.monikaszucs;

import java.time.Month;
import java.util.Objects;

/**
 * Date.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * First Review
 *
 * @author Monika Szucs
 * @author Tian Lan
 *
 * @version 1.0
 *
 * Creating the date containing the year, month, and day
 */
class Date {
    private int     year;
    private int     month;
    private int     day;

    private int MIN_YEAR        = 1;
    private int MAX_YEAR        = 2022;
    private int MIN_MONTH       = 1;
    private int MAX_MONTH       = 12;

    private boolean IS_LEAPYEAR                 = false;
    private static final Integer FIRST_DAY      = 1;
    private static final Integer TWO_DIGITS     = 10;

    private static final Integer FIRST_MONTH    = 1;
    private static final Integer SECOND_MONTH   = 2;
    private static final Integer THIRD_MONTH    = 3;
    private static final Integer FOURTH_MONTH   = 4;
    private static final Integer FIFTH_MONTH    = 5;
    private static final Integer SIXTH_MONTH    = 6;
    private static final Integer SEVENTH_MONTH  = 7;
    private static final Integer EIGHT_MONTH    = 8;
    private static final Integer NINTH_MONTH    = 9;
    private static final Integer TENTH_MONTH    = 10;
    private static final Integer ELEVENTH_MONTH = 11;
    private static final Integer TWELFTH_MONTH  = 12;

    private static final String SAT_ABBREVIATION    = "sat";
    private static final String MON_ABBREVIATION    = "mon";
    private static final String TUES_ABBREVIATION   = "tues";
    private static final String WED_ABBREVIATION    = "wed";
    private static final String THURS_ABBREVIATION  = "thurs";
    private static final String FRI_ABBREVIATION    = "fri";
    private static final String SUN_ABBREVIATION    = "sun";

    private static final Integer STEP_ZERO_SIX      = 6;
    private static final Integer STEP_ZERO_TWO      = 2;
    private static final Integer STEP_ZERO_ZERO     = 0;

    private static final Integer MIN_YEAR_TWO_THOUSANDS     = 2000;
    private static final Integer MAX_YEAR_TWO_THOUSANDS     = 2999;
    private static final Integer MIN_YEAR_EIGHTEEN_HUNDREDS = 1800;
    private static final Integer MAX_YEAR_EIGHTEEN_HUNDREDS = 1899;

    private static final Integer LEAP_YEAR_CALCULATION_FOUR = 4;
    private static final Integer LEAP_YEAR_CALCULATION_ZERO = 0;

    private static final Integer GRABBING_LAST_TWO_DIGITS_OF_YEAR   = 100;
    private static final Integer NUMBER_OF_TWELVES_CALCULATION      = 12;
    private static final Integer NUMBER_OF_FOURS_CALCULATION        = 4;

    private static final Integer JANUARY_MONTH_CODE     = 1;
    private static final Integer FEBRUARY_MONTH_CODE    = 4;
    private static final Integer MARCH_MONTH_CODE       = 4;
    private static final Integer APRIL_MONTH_CODE       = 0;
    private static final Integer MAY_MONTH_CODE         = 2;
    private static final Integer JUNE_MONTH_CODE        = 5;
    private static final Integer JULY_MONTH_CODE        = 0;
    private static final Integer AUGUST_MONTH_CODE      = 3;
    private static final Integer SEPTEMBER_MONTH_CODE   = 6;
    private static final Integer OCTOBER_MONTH_CODE     = 1;
    private static final Integer NOVEMBER_MONTH_CODE    = 4;
    private static final Integer DECEMBER_MONTH_CODE    = 6;

    private static final Integer SATURDAY_DAY_OF_WEEK   = 0;
    private static final Integer SUNDAY_DAY_OF_WEEK     = 1;
    private static final Integer MONDAY_DAY_OF_WEEK     = 2;
    private static final Integer TUESDAY_DAY_OF_WEEK    = 3;
    private static final Integer WEDNESDAY_DAY_OF_WEEK  = 4;
    private static final Integer THURSDAY_DAY_OF_WEEK   = 5;
    private static final Integer FRIDAY_DAY_OF_WEEK     = 6;

    private static final Integer MODULAR_VALUE_SEVEN    = 7;

    /**
     * The date constructor
     *
     * @param year the year in Integer value
     * @param month the month in Integer value
     * @param day the day in Integer value
     */
    Date(final int year, final int month, final int day) {
        setYear(year);
        setMonth(month);
        setDays(day);
    }

    /**
     * Setter that sets the year for the date
     *
     * @param year in integer value
     * @throws IllegalArgumentException If the year is lower or higher than the year range
     */
    public void setYear(int year) {
        if(year > MIN_YEAR && year < MAX_YEAR) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("The year is either smaller than " + MIN_YEAR + " or greater than " + MAX_YEAR);
        }
    }

    /**
     * Setter that sets the month
     *
     * @param month of the given date
     * @throws IllegalArgumentException If the month is lower or higher than the month range
     */
    public void setMonth(int month) {
        if(month > MIN_MONTH && month < MAX_MONTH) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("The month is either smaller than " + MIN_MONTH+ " or greater than " + MAX_MONTH);
        }
    }

    /**
     * Setter that sets the day
     *
     * @param day of the given date
     * @throws IllegalArgumentException If the day is lower or higher than the day range
     */
    public void setDays(int day) {
        if(month == FIRST_MONTH) {
            Month month;
            Integer days;
            month = Month.JANUARY;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == SECOND_MONTH) {
            Month month;
            Integer days;
            month = Month.FEBRUARY;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == THIRD_MONTH) {
            Month month;
            Integer days;
            month = Month.MARCH;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == FOURTH_MONTH) {
            Month month;
            Integer days;
            month = Month.APRIL;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == FIFTH_MONTH) {
            Month month;
            Integer days;
            month = Month.MAY;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == SIXTH_MONTH) {
            Month month;
            Integer days;
            month = Month.JUNE;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == SEVENTH_MONTH) {
            Month month;
            Integer days;
            month = Month.JULY;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == EIGHT_MONTH) {
            Month month;
            Integer days;
            month = Month.AUGUST;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == NINTH_MONTH) {
            Month month;
            Integer days;
            month = Month.SEPTEMBER;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == TENTH_MONTH) {
            Month month;
            Integer days;
            month = Month.OCTOBER;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == ELEVENTH_MONTH) {
            Month month;
            Integer days;
            month = Month.NOVEMBER;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        } else if(month == TWELFTH_MONTH) {
            Month month;
            Integer days;
            month = Month.DECEMBER;
            days = month.length(IS_LEAPYEAR);

            if(day >= FIRST_DAY && day <= days) {
                this.day = day;
            }
        }
    }

    /**
     * The getter for the day
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * The getter for the month
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * The getter for the year
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * The method for the year, month, day formatter
     *
     * @return the format as YEAR-MONTH-DAY
     */
    public String getYYYYMMDD() {
        String monthString;
        String dayString;

        monthString = "";
        dayString = "";

        if(getMonth() >= TENTH_MONTH) {
            monthString = String.valueOf(getMonth());
        } else {
            monthString = "0" + String.valueOf(getMonth());
        }

        if(getDay() >= TWO_DIGITS) {
            dayString = String.valueOf(getDay());
        } else {
            dayString = "0" + String.valueOf(getDay());
        }

        return getYear() + "-" + monthString + "-" + dayString;
    }

    /**
     * The method for the day of the week calculator
     *
     * @return the day of the week
     * @throws IllegalArgumentException if any values are out of bounds
     */
    public String getDayOfTheWeek() {
        int stepZero;
        int gettingLastTwoDigitsOfYear;
        int stepOne;
        int stepTwo;
        int stepThree;
        int stepFour;
        int stepFive;
        int stepSix;
        String dayOfWeek;

        if( (getMonth() == FIRST_MONTH || getMonth() == SECOND_MONTH) && (getYear() % LEAP_YEAR_CALCULATION_FOUR == LEAP_YEAR_CALCULATION_ZERO)){
            stepZero = STEP_ZERO_SIX;
        } else if(getYear() >= MIN_YEAR_TWO_THOUSANDS && getYear() <= MAX_YEAR_TWO_THOUSANDS) {
            stepZero = STEP_ZERO_SIX;
        } else if(getYear() >= MIN_YEAR_EIGHTEEN_HUNDREDS && getYear() <= MAX_YEAR_EIGHTEEN_HUNDREDS) {
            stepZero = STEP_ZERO_TWO;
        } else {
            stepZero = STEP_ZERO_ZERO;
        }

        gettingLastTwoDigitsOfYear = getYear() % GRABBING_LAST_TWO_DIGITS_OF_YEAR;
        stepOne = gettingLastTwoDigitsOfYear / NUMBER_OF_TWELVES_CALCULATION;
        stepTwo = gettingLastTwoDigitsOfYear - (stepOne * NUMBER_OF_TWELVES_CALCULATION);
        stepThree = stepTwo / NUMBER_OF_FOURS_CALCULATION;
        stepFour = getDay() + stepThree + stepTwo + stepOne + stepZero;

        if(getMonth() == FIRST_MONTH) {
            stepFive = stepFour + JANUARY_MONTH_CODE;
        } else if(getMonth() == SECOND_MONTH) {
            stepFive = stepFour + FEBRUARY_MONTH_CODE;
        } else if(getMonth() == THIRD_MONTH) {
            stepFive = stepFour + MARCH_MONTH_CODE;
        } else if(getMonth() == FOURTH_MONTH) {
            stepFive = stepFour + APRIL_MONTH_CODE;
        } else if(getMonth() == FIFTH_MONTH) {
            stepFive = stepFour + MAY_MONTH_CODE;
        } else if(getMonth() == SIXTH_MONTH) {
            stepFive = stepFour + JUNE_MONTH_CODE;
        } else if(getMonth() == SEVENTH_MONTH) {
            stepFive = stepFour + JULY_MONTH_CODE;
        } else if(getMonth() == EIGHT_MONTH) {
            stepFive = stepFour + AUGUST_MONTH_CODE;
        } else if(getMonth() == NINTH_MONTH) {
            stepFive = stepFour + SEPTEMBER_MONTH_CODE;
        } else if(getMonth() == TENTH_MONTH) {
            stepFive = stepFour + OCTOBER_MONTH_CODE;
        } else if(getMonth() == ELEVENTH_MONTH) {
            stepFive = stepFour + NOVEMBER_MONTH_CODE;
        } else if(getMonth() == TWELFTH_MONTH) {
            stepFive = stepFour + DECEMBER_MONTH_CODE;
        } else {
            throw new IllegalArgumentException("Not a valid month");
        }

        stepSix = stepFive % MODULAR_VALUE_SEVEN;

        if(stepSix == SATURDAY_DAY_OF_WEEK) {
            dayOfWeek = SAT_ABBREVIATION;
        } else if(stepSix == SUNDAY_DAY_OF_WEEK) {
            dayOfWeek = SUN_ABBREVIATION;
        } else if(stepSix == MONDAY_DAY_OF_WEEK) {
            dayOfWeek = MON_ABBREVIATION;
        } else if(stepSix == TUESDAY_DAY_OF_WEEK) {
            dayOfWeek = TUES_ABBREVIATION;
        } else if(stepSix == WEDNESDAY_DAY_OF_WEEK) {
            dayOfWeek = WED_ABBREVIATION;
        } else if(stepSix == THURSDAY_DAY_OF_WEEK) {
            dayOfWeek = THURS_ABBREVIATION;
        } else if(stepSix == FRIDAY_DAY_OF_WEEK) {
            dayOfWeek = FRI_ABBREVIATION;
        } else {
            throw new IllegalArgumentException("You got an illegal day of the week value");
        }
        return dayOfWeek;
    }
}
