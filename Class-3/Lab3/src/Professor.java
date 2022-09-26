public class Professor extends Employee {
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private String teachingMajor;

    private static final String DRESS_CODE = "fancy";
    private static final String WORK_VERB = "teach";
    private static final double OVERTIME_PAY_RATE = 2.0;


    Professor(final String name, final String teachingMajor)
    {
        super(name);
        this.dressCode = DRESS_CODE;
        this.paidSalary = true;
        this.educationRequired = true;
        this.workVerb = WORK_VERB;
        this.teachingMajor = teachingMajor;
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

    public String getTeachingMajor()
    {
        return teachingMajor;
    }
}
