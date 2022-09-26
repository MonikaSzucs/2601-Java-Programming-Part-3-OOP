public class HockeyPlayer extends Employee {
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private int numberOfGoals;

    private static final String DRESS_CODE = "jersey";
    private static final String WORK_VERB = "play";
    private static final double OVERTIME_PAY_RATE = 0.0;

    HockeyPlayer(final String name, int goalNumber)
    {
        super(name);
        this.dressCode = DRESS_CODE;
        this.paidSalary = true;
        this.educationRequired = false;
        this.workVerb = WORK_VERB;
        this.numberOfGoals = goalNumber;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getGoals()
    {
        return numberOfGoals;
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

    @Override
    public double getOverTimePayRate()
    {
        return OVERTIME_PAY_RATE;
    };
}
