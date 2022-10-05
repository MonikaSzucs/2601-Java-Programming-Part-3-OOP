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
        List<Employee> employee;
        List<GasStationAttendant> gasStationAttendantsList;
        List<HockeyPlayer> hockeyPlayerList;
        List<Parent> parentList;
        List<Professor> professorList;

        HockeyPlayer        hockeyPlayerOne;
        HockeyPlayer        hockeyPlayerTwo;
        HockeyPlayer        hockeyPlayerThree;
        HockeyPlayer        hockeyPlayerFour;
        HockeyPlayer        hockeyPlayerFive;

        Professor           professorOne;
        Professor           professorTwo;
        Professor           professorThree;
        Professor           professorFour;
        Professor           professorFive;

        Parent              parentOne;
        Parent              parentTwo;
        Parent              parentThree;
        Parent              parentFour;
        Parent              parentFive;

        GasStationAttendant gasStationAttendantOne;
        GasStationAttendant gasStationAttendantTwo;
        GasStationAttendant gasStationAttendantThree;
        GasStationAttendant gasStationAttendantFour;
        GasStationAttendant gasStationAttendantFive;

        list                        = new ArrayList();
        employee                    = new ArrayList<>();
        gasStationAttendantsList    = new ArrayList<>();
        hockeyPlayerList            = new ArrayList<>();
        parentList                  = new ArrayList<>();
        professorList               = new ArrayList<>();

        hockeyPlayerOne = new HockeyPlayer("Wayne Gretzky",  894);
        hockeyPlayerTwo = new HockeyPlayer("Who Ever",  0);
        hockeyPlayerThree = new HockeyPlayer("Brent Gretzky",  1);
        hockeyPlayerFour = new HockeyPlayer("Pavel Burey",  437);
        hockeyPlayerFive = new HockeyPlayer("Jason Harrison",  0);

        professorOne = new Professor("Albert Einstein",  "Physics");
        professorTwo = new Professor("Jason Harrison",  "Computer Systems");
        professorThree = new Professor("Richard Feynman",  "Physics");
        professorFour = new Professor("BCIT Instructor",  "Computer Systems");
        professorFive = new Professor("Kurt Godel",  "Logic");

        parentOne = new Parent("Tiger Woods",  1);
        parentTwo = new Parent("Super Mom",  168);
        parentThree = new Parent("Lazy Larry",  20);
        parentFour = new Parent("Ex Hausted",  168);
        parentFive = new Parent("Super Dad",  167);

        gasStationAttendantOne = new GasStationAttendant("Joe Smith",  10);
        gasStationAttendantTwo = new GasStationAttendant("Tony Baloney",  100);
        gasStationAttendantThree = new GasStationAttendant("Benjamin Franklin",  100);
        gasStationAttendantFour = new GasStationAttendant("Mary Fairy",  101);
        gasStationAttendantFive = new GasStationAttendant("Bee See",  1);

        employee.add(hockeyPlayerOne);
        employee.add(hockeyPlayerTwo);
        employee.add(hockeyPlayerThree);
        employee.add(hockeyPlayerFour);
        employee.add(hockeyPlayerFive);

        employee.add(professorOne);
        employee.add(professorTwo);
        employee.add(professorThree);
        employee.add(professorFour);
        employee.add(professorFive);

        employee.add(parentOne);
        employee.add(parentTwo);
        employee.add(parentThree);
        employee.add(parentFour);
        employee.add(parentFive);

        employee.add(gasStationAttendantOne);
        employee.add(gasStationAttendantTwo);
        employee.add(gasStationAttendantThree);
        employee.add(gasStationAttendantFour);
        employee.add(gasStationAttendantFive);


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

        gasStationAttendantsList.add(gasStationAttendantOne);
        gasStationAttendantsList.add(gasStationAttendantTwo);
        gasStationAttendantsList.add(gasStationAttendantThree);
        gasStationAttendantsList.add(gasStationAttendantFour);
        gasStationAttendantsList.add(gasStationAttendantFive);

        hockeyPlayerList.add(hockeyPlayerOne);
        hockeyPlayerList.add(hockeyPlayerTwo);
        hockeyPlayerList.add(hockeyPlayerThree);
        hockeyPlayerList.add(hockeyPlayerFour);
        hockeyPlayerList.add(hockeyPlayerFive);

        parentList.add(parentOne);
        parentList.add(parentTwo);
        parentList.add(parentThree);
        parentList.add(parentFour);
        parentList.add(parentFive);

        professorList.add(professorOne);
        professorList.add(professorTwo);
        professorList.add(professorThree);
        professorList.add(professorFour);
        professorList.add(professorFive);

        System.out.println(gasStationAttendantsList);
        Collections.sort(gasStationAttendantsList);
        System.out.println(gasStationAttendantsList);

        System.out.println(hockeyPlayerList);
        Collections.sort(hockeyPlayerList);
        System.out.println(hockeyPlayerList);

        System.out.println(parentList);
        Collections.sort(parentList);
        System.out.println(parentList);

        System.out.println(professorList);
        Collections.sort(professorList);
        System.out.println(professorList);

        //System.out.println(getEqual(employees));
    }
}
