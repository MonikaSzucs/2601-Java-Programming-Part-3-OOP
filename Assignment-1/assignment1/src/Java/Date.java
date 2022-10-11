abstract class Date implements Orderable, Comparable {
    private final int day;
    private final int month;
    private final int year;

    Date(final int day, final int month, final int year) {
        if(year <= 0) {
            throw new IllegalArgumentException("The year cannot be less can or equal to zero");
        }
        if(month > 12 || month < 1) {
            throw new IllegalArgumentException("The month is out of bounds");
        }

        // check day out of bounds

        this.day = day;
        this.month = month;
        this.year = year;
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

    public String getYyyyMmDd() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

//    public String toString() {
//        do this later
//    }

    public Date previous() {
        int dayBefore = getDay() - 1;
        int month = getMonth();
        int year = getYear();

        if(dayBefore == 0) {
            month = getMonth() - 1;
            if (month == 0) {
                month = 12;
                year = getYear() - 1;
            }
            dayBefore = getNumberOfDaysPerMonth(getMonth() - 1, getYear());
        }

        return new Date(dayBefore, month, year) {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    public Date next() {
        int dayNext= getDay() - 1;
        int month = getMonth();
        int year = getYear();


        if(dayNext > getNumberOfDaysPerMonth(getMonth() + 1, getYear())) {
            month = getMonth() + 1;
            if (month == 13) {
                month = 1;
                year = getYear() + 1;
            }
            dayNext = getNumberOfDaysPerMonth(getMonth(), getYear());
        }

        return new Date(dayNext, month, year) {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

//    public int compareTo(final Date d) {
//        return d.getDay();
//    }

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

    private int getNumberOfDaysPerMonth(final int month, final int year) {
        return 2;
    }

    private boolean isLeapYear() {
        return true;
    }
}
