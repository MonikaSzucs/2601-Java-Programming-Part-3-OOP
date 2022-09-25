public interface Employable {
    public String getDressCode();

    public boolean isPaidSalary();

    public boolean postSecondaryEducationRequired();

    public String getWorkVerb();

    default public boolean getsPaid(){
        return true;
    }
}
