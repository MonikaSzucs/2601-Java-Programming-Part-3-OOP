package ca.bcit.comp2601.firstreview.monikaszucs;
import java.util.Deque;

/**
 * BankClient.java
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * First Review
 *
 * @author Monika Szucs
 * @author Tian Lan
 *
 * @version 1.0
 *
 * Creating the BlankClient that extends Person
 */
public class BankClient extends Person{
    private Date dateJoinedBank;
    private String clientID;

    private static final String SAT_ABBREVIATION    = "sat";
    private static final String MON_ABBREVIATION    = "mon";
    private static final String TUES_ABBREVIATION   = "tues";
    private static final String WED_ABBREVIATION    = "wed";
    private static final String THURS_ABBREVIATION  = "thurs";
    private static final String FRI_ABBREVIATION    = "fri";
    private static final String SUN_ABBREVIATION    = "sun";

    private static final String SATURDAY_FULL   = "saturday";
    private static final String MONDAY_FULL     = "monday";
    private static final String TUESDAY_FULL    = "tuesday";
    private static final String WEDNESDAY_FULL  = "wednesday";
    private static final String THURSDAY_FULL   = "thursday";
    private static final String FRIDAY_FULL     = "friday";
    private static final String SUNDAY_FULL     = "sunday";

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

    private static final String JANUARY     = "January";
    private static final String FEBRUARY    = "February";
    private static final String MARCH       = "March";
    private static final String APRIL       = "April";
    private static final String MAY         = "May";
    private static final String JUNE        = "June";
    private static final String JULY        = "July";
    private static final String AUGUST      = "August";
    private static final String SEPTEMBER   = "September";
    private static final String OCTOBER     = "October";
    private static final String NOVEMBER    = "November";
    private static final String DECEMBER    = "December";

    /**
     * The BankClient Constructor
     *
     * @param name the name with the Name Class value (Super value)
     * @param birthDate the birth date with the Date Class value
     * @param deathDate the death date with the Date Class value
     * @param dateJoinedBank the date when joined the bank with the Date Class value (Super value)
     * @param clientID the client ID with a String value (Super value)
     */
    BankClient(final Name name, final Date birthDate, final Date deathDate, final Date dateJoinedBank, final String clientID) {
        super(name, birthDate, deathDate);
        this.dateJoinedBank = dateJoinedBank;
        this.clientID = clientID;
    }

    /**
     * The getter for the client ID
     *
     * @return the client ID
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * The getter for the date joined the bank
     *
     * @return when the user joined the bank
     */
    public Date getDateJoinedBank() {
        return dateJoinedBank;
    }

    /**
     * The method to get the details of the person that has been overridden
     *
     * @return the information of the user
     */
    @Override
    public String getDetails() {
        String sentence;
        String dayOfWeekSentence;
        String monthString;
        sentence            = "";
        dayOfWeekSentence   = "";
        monthString         = "";

        if(getDateJoinedBank().getDayOfTheWeek().equals(SAT_ABBREVIATION)) {
            dayOfWeekSentence = SATURDAY_FULL;
        } else if(getDateJoinedBank().getDayOfTheWeek().equals(SUN_ABBREVIATION)) {
            dayOfWeekSentence = SUNDAY_FULL;
        } else if(getDateJoinedBank().getDayOfTheWeek().equals(MON_ABBREVIATION)) {
            dayOfWeekSentence = MONDAY_FULL;
        } else if(getDateJoinedBank().getDayOfTheWeek().equals(TUES_ABBREVIATION)) {
            dayOfWeekSentence = TUESDAY_FULL;
        } else if(getDateJoinedBank().getDayOfTheWeek().equals(WED_ABBREVIATION)) {
            dayOfWeekSentence = WEDNESDAY_FULL;
        } else if(getDateJoinedBank().getDayOfTheWeek().equals(THURS_ABBREVIATION)) {
            dayOfWeekSentence = THURSDAY_FULL;
        } else if(getDateJoinedBank().getDayOfTheWeek().equals(FRI_ABBREVIATION)) {
            dayOfWeekSentence = FRIDAY_FULL;
        }

        if(getDateJoinedBank().getMonth() == FIRST_MONTH) {
            monthString = JANUARY;
        } else if(getDateJoinedBank().getMonth() == SECOND_MONTH) {
            monthString = FEBRUARY;
        } else if(getDateJoinedBank().getMonth() == THIRD_MONTH) {
            monthString = MARCH;
        } else if(getDateJoinedBank().getMonth() == FOURTH_MONTH) {
            monthString = APRIL;
        } else if(getDateJoinedBank().getMonth() == FIFTH_MONTH) {
            monthString = MAY;
        } else if(getDateJoinedBank().getMonth() == SIXTH_MONTH) {
            monthString = JUNE;
        } else if(getDateJoinedBank().getMonth() == SEVENTH_MONTH) {
            monthString = JULY;
        } else if(getDateJoinedBank().getMonth() == EIGHT_MONTH) {
            monthString = AUGUST;
        } else if(getDateJoinedBank().getMonth() == NINTH_MONTH) {
            monthString = SEPTEMBER;
        } else if(getDateJoinedBank().getMonth() == TENTH_MONTH) {
            monthString = OCTOBER;
        } else if(getDateJoinedBank().getMonth() == ELEVENTH_MONTH) {
            monthString = NOVEMBER;
        } else if(getDateJoinedBank().getMonth() == TWELFTH_MONTH) {
            monthString = DECEMBER;
        }

        if(super.getDeathDate() == null) {
            sentence = super.getName().getFirst() + " " + super.getName().getLast() + " client #" + clientID + " (not alive) joined the bank on " +
                    dayOfWeekSentence + ", " + monthString + " " + getDateJoinedBank().getDay() +
                    ", " + getDateJoinedBank().getYear() + "!";
        } else {
            sentence = super.getName().getFirst() + " " + super.getName().getLast() + " client #" + clientID + " (alive) joined the bank on " +
                    dayOfWeekSentence + ", " + monthString + " " + getDateJoinedBank().getDay() +
                    ", " + getDateJoinedBank().getYear() + "!";
        }
        return sentence;
    }
}
