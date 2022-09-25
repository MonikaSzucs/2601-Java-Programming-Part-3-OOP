public class HockeyPlayer extends Employee {
    private final String firstName;
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private int numberOfGoals;

    private static final String DRESS_CODE = "jersey";
    private static final String WORK_VERB = "play";
    private static final double OVERTIME_PAY_RATE = 0.0;

    HockeyPlayer(final String firstName, final String dressCode, final boolean paidSalary, final boolean educationRequired, final String workVerb) {
        this.firstName = firstName;
        this.dressCode = dressCode;
        this.paidSalary = paidSalary;
        this.educationRequired = educationRequired;
        this.workVerb = workVerb;
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
}
