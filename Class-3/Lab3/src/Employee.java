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
    }

    @Override
    public boolean equals(final Object o) {
        if(o == null) {
            return false;
        }

        if(this == o) return true;

        if(!(o instanceof Employee)) {
            return false;
        }

        Employee employee = (Employee) o;
        return (this.name.equals(employee.name));
    }
}
