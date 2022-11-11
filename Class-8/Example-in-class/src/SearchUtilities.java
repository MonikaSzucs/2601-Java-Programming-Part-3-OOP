import java.util.List;

public class SearchUtilities
{
    private static List<Celebrity> list = PersonFrame.getTheInstance().getList();

    public static List<Celebrity> byJob(String job)
    {
        List<Celebrity> matches = list.stream()
                .filter(person->person.getOccupation().toLowerCase().contains(job.toLowerCase()))
                .toList();

        System.err.println("displaying all people with this job: " + job + "----------");
        matches.forEach(System.err::println);

        //PersonFrame.getTheInstance().setList(matches);


        return matches;
    }


    public static List<Celebrity> byName(String name)
    {
        List<Celebrity> matches = list.stream()
                .filter(person->person.getFullName().toLowerCase().contains(name.toLowerCase()))
                .toList();

        System.err.println("displaying all people with this name: " + name + "----------");
        list.stream()
                .filter(person->person.getFullName().toLowerCase().contains(name.toLowerCase()))
                .forEach(System.err::println);

        return matches;
    }
}
