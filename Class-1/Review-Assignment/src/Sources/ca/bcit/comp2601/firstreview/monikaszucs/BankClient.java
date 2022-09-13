package ca.bcit.comp2601.firstreview.monikaszucs;

import java.util.Deque;

public class BankClient extends Person{
    private Date dateJoinedBank;
    private String clientID;

    BankClient(final Name name, final Date birthDate, final Date deathDate, final Date dateJoinedBank, final String clientID) {
        super(name, birthDate, deathDate);
        this.dateJoinedBank = dateJoinedBank;
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public Date getDateJoinedBank() {
        return dateJoinedBank;
    }

    @Override
    public String getDetails() {
        String sentence = "";
        String dayOfWeekSentence = "";


        if(getDateJoinedBank().getDayOfTheWeek().equals("sat")) {
            dayOfWeekSentence = "saturday";
        } else if(getDateJoinedBank().getDayOfTheWeek().equals("sun")) {
            dayOfWeekSentence = "sunday";
        } else if(getDateJoinedBank().getDayOfTheWeek().equals("mon")) {
            dayOfWeekSentence = "monday";
        } else if(getDateJoinedBank().getDayOfTheWeek().equals("tues")) {
            dayOfWeekSentence = "tuesday";
        } else if(getDateJoinedBank().getDayOfTheWeek().equals("wed")) {
            dayOfWeekSentence = "wednesday";
        } else if(getDateJoinedBank().getDayOfTheWeek().equals("thurs")) {
            dayOfWeekSentence = "thursday";
        } else if(getDateJoinedBank().getDayOfTheWeek().equals("fri")) {
            dayOfWeekSentence = "friday";
        }

        String monthString = "";

        if(getDateJoinedBank().getMonth() == 1) {
            monthString = "January";
        } else if(getDateJoinedBank().getMonth() == 2) {
            monthString = "February";
        } else if(getDateJoinedBank().getMonth() == 3) {
            monthString = "March";
        } else if(getDateJoinedBank().getMonth() == 4) {
            monthString = "April";
        } else if(getDateJoinedBank().getMonth() == 5) {
            monthString = "May";
        } else if(getDateJoinedBank().getMonth() == 6) {
            monthString = "June";
        } else if(getDateJoinedBank().getMonth() == 7) {
            monthString = "July";
        } else if(getDateJoinedBank().getMonth() == 8) {
            monthString = "August";
        } else if(getDateJoinedBank().getMonth() == 9) {
            monthString = "September";
        } else if(getDateJoinedBank().getMonth() == 10) {
            monthString = "October";
        } else if(getDateJoinedBank().getMonth() == 11) {
            monthString = "November";
        } else if(getDateJoinedBank().getMonth() == 12) {
            monthString = "December";
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
