import java.util.Objects;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {
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
    }

    @Override
    public int compareTo(final HockeyPlayer hockeyPlayer) {
        if(numberOfGoals < hockeyPlayer.getGoals()) {
            return +120;
        } else {
            return -120;
        }
    }

    @Override
    public String toString() {
        return "HockeyPlayer{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + paidSalary +
                ", educationRequired=" + educationRequired +
                ", workVerb=" + workVerb +
                ", numberOfGoals=" + numberOfGoals +
                '}' + "\n";
    }

    @Override
    public boolean equals(final Object o)
    {
        if(this == o) return true;
        if(!(o instanceof HockeyPlayer)) return false;
        HockeyPlayer hockeyPlayer = (HockeyPlayer) o;
        return numberOfGoals == hockeyPlayer.numberOfGoals;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfGoals);
    }
}
