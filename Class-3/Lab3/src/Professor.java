import java.util.Objects;

public class Professor extends Employee implements Comparable<Professor> {
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

    @Override
    public int compareTo(final Professor professor) {
        if(this.teachingMajor.length() < professor.teachingMajor.length()) {
            return +120;
        } else {
            return -120;
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + super.getName() + '\'' +
                ", dressCode=" + DRESS_CODE +
                ", paidSalary=" + paidSalary +
                ", educationRequired=" + educationRequired +
                ", workVerb=" + workVerb +
                ", teachingMajor=" + teachingMajor +
                '}' + "\n";
    }

    @Override
    public boolean equals(final Object o)
    {
        if(this == o) return true;
        if(!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return teachingMajor.equals(professor.teachingMajor);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(teachingMajor);
    }
}
