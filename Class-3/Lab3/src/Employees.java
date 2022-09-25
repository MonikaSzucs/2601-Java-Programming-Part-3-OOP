import java.util.ArrayList;
import java.util.List;

public class Employees {

    public static void main(final String[] args) {
        List l;
        l = new ArrayList();

        List<Employee> employee;
        employee = new ArrayList<>();
        employee.add(new HockeyPlayer("Wayne Gretzky",  894));
        employee.add(new HockeyPlayer("Who Ever",  0));
        employee.add(new HockeyPlayer("Brent Gretzky",  1));
        employee.add(new HockeyPlayer("Pavel Burey",  437));
        employee.add(new HockeyPlayer("Jason Harrison",  0));

        employee.add(new Professor("Albert Einstein",  "Physics"));
        employee.add(new Professor("Jason Harrison",  "Computer Systems"));
        employee.add(new Professor("Richard Feynman",  "Physics"));
        employee.add(new Professor("BCIT Instructor",  "Computer Systems"));
        employee.add(new Professor("Kurt Godel",  "Logic"));

        employee.add(new Parent("Tiger Woods",  1));
        employee.add(new Parent("Super Mom",  168));
        employee.add(new Parent("Lazy Larry",  20));
        employee.add(new Parent("Ex Hausted",  168));
        employee.add(new Parent("Super Dad",  167));

        employee.add(new GasStationAttendant("Joe Smith",  10));
        employee.add(new GasStationAttendant("Tony Baloney",  100));
        employee.add(new GasStationAttendant("Benjamin Franklin",  100));
        employee.add(new GasStationAttendant("Mary Fairy",  101));
        employee.add(new GasStationAttendant("Bee See",  1));
    }
}
