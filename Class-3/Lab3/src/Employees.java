import java.util.ArrayList;
import java.util.List;

public class Employees {

    public static void main(final String[] args) {
        List list;
        list = new ArrayList();

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


        for(Employee employee1: employee) {
            System.out.print(employee1.getClass().getName() + " " + employee1.getName() + " " );

            if(employee1 instanceof HockeyPlayer) {
                System.out.print("has scored " + ((HockeyPlayer) employee1).getGoals() + " goals \n");
            } else if (employee1 instanceof  Professor) {
                System.out.print("teaches " + ((Professor) employee1).getTeachingMajor() + "\n");
            } else if (employee1 instanceof Parent) {
                System.out.print("spends " + ((Parent) employee1).getNumberOfHoursSpentPerWeekWithKids() + " hours/week with kids");
            } else if (employee1 instanceof GasStationAttendant) {
                System.out.print("steals " + ((GasStationAttendant) employee1).getNumberOfDollarsStolenPerDay() + " dollars a day");
            }
        }
    }
}
