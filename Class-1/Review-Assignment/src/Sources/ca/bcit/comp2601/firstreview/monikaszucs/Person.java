package ca.bcit.comp2601.firstreview.monikaszucs;

class Person {
    private Name name;
    private Date birthDate;
    private Date deathDate;

    Person(final Name name, final Date birthDate, final Date deathDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public Name getName() {
        return name;
    }

    public Date getBirthDate() {
        return  birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public String getDetails() {
        Boolean death = true;
        String lifeStatus = "alive";

        ////Albert Einstein (died monday, April 18, 1955) was born on friday, March 14, 1879!”
        String birthDayOfWeek = birthDate.getDayOfTheWeek();
        String birthDayOfWeekExpanded = "";

        if(birthDayOfWeek.equals("sat")) {
            birthDayOfWeekExpanded = "saturday";
        } else if(birthDayOfWeek.equals("sun")) {
            birthDayOfWeekExpanded = "sunday";
        } else if(birthDayOfWeek.equals("mon")) {
            birthDayOfWeekExpanded = "monday";
        } else if(birthDayOfWeek.equals("tues")) {
            birthDayOfWeekExpanded = "tuesday";
        } else if(birthDayOfWeek.equals("wed")) {
            birthDayOfWeekExpanded = "wednesday";
        } else if(birthDayOfWeek.equals("thurs")) {
            birthDayOfWeekExpanded = "thursday";
        } else if(birthDayOfWeek.equals("fri")) {
            birthDayOfWeekExpanded = "friday";
        }

        String deathDayOfWeek = deathDate.getDayOfTheWeek();
        String deathOfWeekExpanded = "";

        if(deathDayOfWeek.equals("sat")) {
            deathOfWeekExpanded = "saturday";
        } else if(deathDayOfWeek.equals("sun")) {
            deathOfWeekExpanded = "sunday";
        } else if(deathDayOfWeek.equals("mon")) {
            deathOfWeekExpanded = "monday";
        } else if(deathDayOfWeek.equals("tues")) {
            deathOfWeekExpanded = "tuesday";
        } else if(deathDayOfWeek.equals("wed")) {
            deathOfWeekExpanded = "wednesday";
        } else if(deathDayOfWeek.equals("thurs")) {
            deathOfWeekExpanded = "thursday";
        } else if(deathDayOfWeek.equals("fri")) {
            deathOfWeekExpanded = "friday";
        }

        Integer deathMonth = deathDate.getMonth();
        String deathMonthFullString = null;

        if(deathMonth == 1) {
            deathMonthFullString = "January";
        } else if(deathMonth == 2) {
            deathMonthFullString = "February";
        } else if(deathMonth == 3) {
            deathMonthFullString = "March";
        } else if(deathMonth == 4) {
            deathMonthFullString = "April";
        } else if(deathMonth == 5) {
            deathMonthFullString = "May";
        } else if(deathMonth == 6) {
            deathMonthFullString = "June";
        } else if(deathMonth == 7) {
            deathMonthFullString = "July";
        } else if(deathMonth == 8) {
            deathMonthFullString = "August";
        } else if(deathMonth == 9) {
            deathMonthFullString = "September";
        } else if(deathMonth == 10) {
            deathMonthFullString = "October";
        } else if(deathMonth == 11) {
            deathMonthFullString = "November";
        } else if(deathMonth == 12) {
            deathMonthFullString = "December";
        }

        Integer aliveMonth = birthDate.getMonth();
        String aliveMonthFullString = null;

        if(aliveMonth == 1) {
            aliveMonthFullString = "January";
        } else if(aliveMonth == 2) {
            aliveMonthFullString = "February";
        } else if(aliveMonth == 3) {
            aliveMonthFullString = "March";
        } else if(aliveMonth == 4) {
            aliveMonthFullString = "April";
        } else if(aliveMonth == 5) {
            aliveMonthFullString = "May";
        } else if(aliveMonth == 6) {
            aliveMonthFullString = "June";
        } else if(aliveMonth == 7) {
            aliveMonthFullString = "July";
        } else if(aliveMonth == 8) {
            aliveMonthFullString = "August";
        } else if(aliveMonth == 9) {
            aliveMonthFullString = "September";
        } else if(aliveMonth == 10) {
            aliveMonthFullString = "October";
        } else if(aliveMonth == 11) {
            aliveMonthFullString = "November";
        } else if(aliveMonth == 12) {
            aliveMonthFullString = "December";
        }

        Integer birthMonth = birthDate.getMonth();
        String birthMonthFullString = null;

        if(birthMonth == 1) {
            birthMonthFullString = "January";
        } else if(birthMonth == 2) {
            birthMonthFullString = "February";
        } else if(birthMonth == 3) {
            birthMonthFullString = "March";
        } else if(birthMonth == 4) {
            birthMonthFullString = "April";
        } else if(birthMonth == 5) {
            birthMonthFullString = "May";
        } else if(birthMonth == 6) {
            birthMonthFullString = "June";
        } else if(birthMonth == 7) {
            birthMonthFullString = "July";
        } else if(birthMonth == 8) {
            birthMonthFullString = "August";
        } else if(birthMonth == 9) {
            birthMonthFullString = "September";
        } else if(birthMonth == 10) {
            birthMonthFullString = "October";
        } else if(birthMonth == 11) {
            birthMonthFullString = "November";
        } else if(birthMonth == 12) {
            birthMonthFullString = "December";
        }

        if(deathDate != null){
            lifeStatus = "died "+ deathOfWeekExpanded + ", " + deathMonthFullString + " " + deathDate.getDay() + ", "+ deathDate.getYear();
        }


        return name.getFirst() + " " + name.getLast() + " (" + lifeStatus + ") was born on "
                + birthDayOfWeekExpanded + ", " + birthMonthFullString + " " + birthDate.getDay() + ", " + birthDate.getYear() + "!";

        //Albert Einstein (died mon ,4 18, 1955) was born on fri, 3 14, 1879!
    }



}
