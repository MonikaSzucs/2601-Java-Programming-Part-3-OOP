package ca.bc.bcit.comp2601.lab3.monikaszucsdavood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Employees.java
 *
 * A Employees Class
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Spring/Summer 2022
 * Lab 3
 * @author Monika Szucs
 * @author Davood Tabrizi
 *
 * @version 1.1
 */
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
                System.out.print("spends " + ((Parent) employee1).getNumberOfHoursSpentPerWeekWithKids() + " hours/week with kids \n");
            } else if (employee1 instanceof GasStationAttendant) {
                System.out.print("steals " + ((GasStationAttendant) employee1).getNumberOfDollarsStolenPerDay() + " dollars a day \n");
            }
        }

        System.out.println(" test ");
        List<GasStationAttendant> gasStationAttendantsList;
        gasStationAttendantsList = new ArrayList<>();

        gasStationAttendantsList.add(new GasStationAttendant("Joe Smith",  10));
        gasStationAttendantsList.add(new GasStationAttendant("Tony Baloney",  100));
        gasStationAttendantsList.add(new GasStationAttendant("Benjamin Franklin",  100));
        gasStationAttendantsList.add(new GasStationAttendant("Mary Fairy",  101));
        gasStationAttendantsList.add(new GasStationAttendant("Bee See",  1));
        System.out.println(gasStationAttendantsList);

        Collections.sort(gasStationAttendantsList);
        System.out.println(gasStationAttendantsList);


        List<HockeyPlayer> hockeyPlayerList;
        hockeyPlayerList = new ArrayList<>();

        hockeyPlayerList.add(new HockeyPlayer("Wayne Gretzky",  894));
        hockeyPlayerList.add(new HockeyPlayer("Who Ever",  0));
        hockeyPlayerList.add(new HockeyPlayer("Brent Gretzky",  1));
        hockeyPlayerList.add(new HockeyPlayer("Pavel Burey",  437));
        hockeyPlayerList.add(new HockeyPlayer("Jason Harrison",  0));
        System.out.println(hockeyPlayerList);

        Collections.sort(hockeyPlayerList);
        System.out.println(hockeyPlayerList);

        List<Parent> parentList;
        parentList = new ArrayList<>();

        parentList.add(new Parent("Tiger Woods",  1));
        parentList.add(new Parent("Super Mom",  168));
        parentList.add(new Parent("Lazy Larry",  20));
        parentList.add(new Parent("Ex Hausted",  168));
        parentList.add(new Parent("Super Dad",  167));
        System.out.println(parentList);

        Collections.sort(parentList);
        System.out.println(parentList);

        List<Professor> professorList;
        professorList = new ArrayList<>();

        professorList.add(new Professor("Albert Einstein",  "Physics"));
        professorList.add(new Professor("Jason Harrison",  "Computer Systems"));
        professorList.add(new Professor("Richard Feynman",  "Physics"));
        professorList.add(new Professor("BCIT Instructor",  "Computer Systems"));
        professorList.add(new Professor("Kurt Godel",  "Logic"));
        System.out.println(professorList);

        Collections.sort(professorList);
        System.out.println(professorList);
    }
}
