public abstract class Employee implements Employable {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getOverTimePayRate()
    {
        return 0;
    };
}
