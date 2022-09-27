public class Parent extends Employee implements Comparable<Parent> {
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private int numberOfHoursSpentPerWeekWithKids;

    private static final String DRESS_CODE = "anything";
    private static final String WORK_VERB = "care";
    private static final double OVERTIME_PAY_RATE = -2.0;

    Parent(final String name, final int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
        this.dressCode = DRESS_CODE;
        this.paidSalary = false;
        this.educationRequired = false;
        this.workVerb = WORK_VERB;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDressCode() {
        return DRESS_CODE;
    }

    @Override
    public boolean isPaidSalary() {
        return paidSalary;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return educationRequired;
    }

    @Override
    public String getWorkVerb() {
        return WORK_VERB;
    }

    public int getNumberOfHoursSpentPerWeekWithKids()
    {
        return numberOfHoursSpentPerWeekWithKids;
    }

    @Override
    public int compareTo(final Parent parent) {
        if(numberOfHoursSpentPerWeekWithKids > parent.getNumberOfHoursSpentPerWeekWithKids()) {
            return +120;
        } else {
            return -120;
        }
    }
}
