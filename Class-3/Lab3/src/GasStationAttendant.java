public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {
    private final String dressCode;
    private boolean paidSalary;
    private final boolean educationRequired;
    private final String workVerb;

    private int numberOfDollarsStolenPerDay;

    private static final String DRESS_CODE = "uniform";
    private static final String WORK_VERB = "pump";
    private static final double OVERTIME_PAY_RATE = 1.5;

    GasStationAttendant(final String firstName, final int numberOfDollarsStolenPerDay) {
        super(firstName);
        this.dressCode = DRESS_CODE;
        this.paidSalary = false;
        this.educationRequired = false;
        this.workVerb = WORK_VERB;
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
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

    public int getNumberOfDollarsStolenPerDay()
    {
        return numberOfDollarsStolenPerDay;
    }

    @Override
    public int compareTo(final GasStationAttendant gasStationAttendant) {
        if(numberOfDollarsStolenPerDay > gasStationAttendant.getNumberOfDollarsStolenPerDay()) {
            return +120;
        } else {
            return -120;
        }
    }
}
