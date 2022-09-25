public abstract class Employee implements Employable {
    private final String name;

    @Override
    public double getOverTimePayRate() {
        System.out.println("$0");
    }
}
