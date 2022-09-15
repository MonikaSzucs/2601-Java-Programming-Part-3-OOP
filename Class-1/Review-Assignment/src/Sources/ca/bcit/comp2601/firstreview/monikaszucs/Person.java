package ca.bcit.comp2601.firstreview.monikaszucs;

/**
 * Person.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * First Review
 *
 * @author Monika Szucs
 * @author Tian Lan
 *
 * @version 1.0
 *
 * Creating a Person class with the name, birthDate, deathDate
 */
class Person {
    private Name name;
    private Date birthDate;
    private Date deathDate;

    private static final String LIFE_STATUS_ALIVE = "alive";

    private static final String SAT_ABBREVIATION = "sat";
    private static final String MON_ABBREVIATION = "mon";
    private static final String TUES_ABBREVIATION = "tues";
    private static final String WED_ABBREVIATION = "wed";
    private static final String THURS_ABBREVIATION = "thurs";
    private static final String FRI_ABBREVIATION = "fri";
    private static final String SUN_ABBREVIATION = "sun";

    private static final String SATURDAY_FULL = "saturday";
    private static final String MONDAY_FULL = "monday";
    private static final String TUESDAY_FULL = "tuesday";
    private static final String WEDNESDAY_FULL = "wednesday";
    private static final String THURSDAY_FULL = "thursday";
    private static final String FRIDAY_FULL = "friday";
    private static final String SUNDAY_FULL = "sunday";

    private static final Integer FIRST_MONTH = 1;
    private static final Integer SECOND_MONTH = 2;
    private static final Integer THIRD_MONTH = 3;
    private static final Integer FOURTH_MONTH = 4;
    private static final Integer FIFTH_MONTH = 5;
    private static final Integer SIXTH_MONTH = 6;
    private static final Integer SEVENTH_MONTH = 7;
    private static final Integer EIGHT_MONTH = 8;
    private static final Integer NINTH_MONTH = 9;
    private static final Integer TENTH_MONTH = 10;
    private static final Integer ELEVENTH_MONTH = 11;
    private static final Integer TWELFTH_MONTH = 12;

    private static final String JANUARY = "January";
    private static final String FEBRUARY = "February";
    private static final String MARCH = "March";
    private static final String APRIL = "April";
    private static final String MAY = "May";
    private static final String JUNE = "June";
    private static final String JULY = "July";
    private static final String AUGUST = "August";
    private static final String SEPTEMBER = "September";
    private static final String OCTOBER = "October";
    private static final String NOVEMBER = "November";
    private static final String DECEMBER = "December";

    /**
     * The Person Constructor
     *
     * @param name the Name of the Person as class
     * @param birthDate the date of birth as a Date class
     * @param deathDate the date of death as a Date class
     */
    Person(final Name name, final Date birthDate, final Date deathDate) {
        this.name       = name;
        this.birthDate  = birthDate;
        this.deathDate  = deathDate;
    }

    /**
     * The getter for getName that returns a Name Class
     * @return the Name class
     */
    public Name getName() {
        return name;
    }

    /**
     * The getter for the birth date
     *
     * @return the birth date as a Date class
     */
    public Date getBirthDate() {
        return  birthDate;
    }

    /**
     * The getter for the death date
     *
     * @return the death date as a Date class
     */
    public Date getDeathDate() {
        return deathDate;
    }

    /**
     * The method to get details of the person
     *
     * @return  will return the sentence containing the first name, last name, life status, when the person was born in
     *          terms of the day of the week, birth month, birth day, birth year
     */
    public String getDetails() {
        Boolean death;
        String lifeStatus;
        String birthDayOfWeek;
        String birthDayOfWeekExpanded;
        String deathDayOfWeek;
        String deathOfWeekExpanded;
        Integer deathMonth;
        String deathMonthFullString;
        Integer aliveMonth;
        String aliveMonthFullString;
        Integer birthMonth;
        String birthMonthFullString;

        death = true;
        lifeStatus = LIFE_STATUS_ALIVE;
        birthDayOfWeek = birthDate.getDayOfTheWeek();
        birthDayOfWeekExpanded = "";
        deathDayOfWeek = deathDate.getDayOfTheWeek();
        deathOfWeekExpanded = "";
        deathMonth = deathDate.getMonth();
        deathMonthFullString = null;
        aliveMonth = birthDate.getMonth();
        aliveMonthFullString = null;
        birthMonth = birthDate.getMonth();
        birthMonthFullString = null;

        if(birthDayOfWeek.equals(SAT_ABBREVIATION)) {
            birthDayOfWeekExpanded = SATURDAY_FULL;
        } else if(birthDayOfWeek.equals(SUN_ABBREVIATION)) {
            birthDayOfWeekExpanded = SUNDAY_FULL;
        } else if(birthDayOfWeek.equals(MON_ABBREVIATION)) {
            birthDayOfWeekExpanded = MONDAY_FULL;
        } else if(birthDayOfWeek.equals(TUES_ABBREVIATION)) {
            birthDayOfWeekExpanded = TUESDAY_FULL;
        } else if(birthDayOfWeek.equals(WED_ABBREVIATION)) {
            birthDayOfWeekExpanded = WEDNESDAY_FULL;
        } else if(birthDayOfWeek.equals(THURS_ABBREVIATION)) {
            birthDayOfWeekExpanded = THURSDAY_FULL;
        } else if(birthDayOfWeek.equals(FRI_ABBREVIATION)) {
            birthDayOfWeekExpanded = FRIDAY_FULL;
        }

        if(deathDayOfWeek.equals(SAT_ABBREVIATION)) {
            deathOfWeekExpanded = SATURDAY_FULL;
        } else if(deathDayOfWeek.equals(SUN_ABBREVIATION)) {
            deathOfWeekExpanded = SUNDAY_FULL;
        } else if(deathDayOfWeek.equals(MON_ABBREVIATION)) {
            deathOfWeekExpanded = MONDAY_FULL;
        } else if(deathDayOfWeek.equals(TUES_ABBREVIATION)) {
            deathOfWeekExpanded = TUESDAY_FULL;
        } else if(deathDayOfWeek.equals(WED_ABBREVIATION)) {
            deathOfWeekExpanded = WEDNESDAY_FULL;
        } else if(deathDayOfWeek.equals(THURS_ABBREVIATION)) {
            deathOfWeekExpanded = THURSDAY_FULL;
        } else if(deathDayOfWeek.equals(FRI_ABBREVIATION)) {
            deathOfWeekExpanded = FRIDAY_FULL;
        }

        if(deathMonth == FIRST_MONTH) {
            deathMonthFullString = JANUARY;
        } else if(deathMonth == SECOND_MONTH) {
            deathMonthFullString = FEBRUARY;
        } else if(deathMonth == THIRD_MONTH) {
            deathMonthFullString = MARCH;
        } else if(deathMonth == FOURTH_MONTH) {
            deathMonthFullString = APRIL;
        } else if(deathMonth == FIFTH_MONTH) {
            deathMonthFullString = MAY;
        } else if(deathMonth == SIXTH_MONTH) {
            deathMonthFullString = JUNE;
        } else if(deathMonth == SEVENTH_MONTH) {
            deathMonthFullString = JULY;
        } else if(deathMonth == EIGHT_MONTH) {
            deathMonthFullString = AUGUST;
        } else if(deathMonth == NINTH_MONTH) {
            deathMonthFullString = SEPTEMBER;
        } else if(deathMonth == TENTH_MONTH) {
            deathMonthFullString = OCTOBER;
        } else if(deathMonth == ELEVENTH_MONTH) {
            deathMonthFullString = NOVEMBER;
        } else if(deathMonth == TWELFTH_MONTH) {
            deathMonthFullString = DECEMBER;
        }

        if(aliveMonth == FIRST_MONTH) {
            aliveMonthFullString = JANUARY;
        } else if(aliveMonth == SECOND_MONTH) {
            aliveMonthFullString = FEBRUARY;
        } else if(aliveMonth == THIRD_MONTH) {
            aliveMonthFullString = MARCH;
        } else if(aliveMonth == FOURTH_MONTH) {
            aliveMonthFullString = APRIL;
        } else if(aliveMonth == FIFTH_MONTH) {
            aliveMonthFullString = MAY;
        } else if(aliveMonth == SIXTH_MONTH) {
            aliveMonthFullString = JUNE;
        } else if(aliveMonth == SEVENTH_MONTH) {
            aliveMonthFullString = JULY;
        } else if(aliveMonth == EIGHT_MONTH) {
            aliveMonthFullString = AUGUST;
        } else if(aliveMonth == NINTH_MONTH) {
            aliveMonthFullString = SEPTEMBER;
        } else if(aliveMonth == TENTH_MONTH) {
            aliveMonthFullString = OCTOBER;
        } else if(aliveMonth == ELEVENTH_MONTH) {
            aliveMonthFullString = NOVEMBER;
        } else if(aliveMonth == TWELFTH_MONTH) {
            aliveMonthFullString = DECEMBER;
        }

        if(birthMonth == FIRST_MONTH) {
            birthMonthFullString = JANUARY;
        } else if(birthMonth == SECOND_MONTH) {
            birthMonthFullString = FEBRUARY;
        } else if(birthMonth == THIRD_MONTH) {
            birthMonthFullString = MARCH;
        } else if(birthMonth == FOURTH_MONTH) {
            birthMonthFullString = APRIL;
        } else if(birthMonth == FIFTH_MONTH) {
            birthMonthFullString = MAY;
        } else if(birthMonth == SIXTH_MONTH) {
            birthMonthFullString = JUNE;
        } else if(birthMonth == SEVENTH_MONTH) {
            birthMonthFullString = JULY;
        } else if(birthMonth == EIGHT_MONTH) {
            birthMonthFullString = AUGUST;
        } else if(birthMonth == NINTH_MONTH) {
            birthMonthFullString = SEPTEMBER;
        } else if(birthMonth == TENTH_MONTH) {
            birthMonthFullString = OCTOBER;
        } else if(birthMonth == ELEVENTH_MONTH) {
            birthMonthFullString = NOVEMBER;
        } else if(birthMonth == TWELFTH_MONTH) {
            birthMonthFullString = DECEMBER;
        }

        if(deathDate != null){
            lifeStatus = "died "+ deathOfWeekExpanded + ", " + deathMonthFullString + " " + deathDate.getDay() + ", "+ deathDate.getYear();
        }

        return name.getFirst() + " " + name.getLast() + " (" + lifeStatus + ") was born on "
                + birthDayOfWeekExpanded + ", " + birthMonthFullString + " " + birthDate.getDay() + ", " + birthDate.getYear() + "!";
    }
}
