import java.util.*;
import java.util.stream.Collectors;

public class Canada {
    private static List<Province> provinces;

    public static final int NUMBER_OF_PROVINCES;
    public static final int MAX_PERCENTAGE;

    static {
        provinces = new ArrayList<>();
        NUMBER_OF_PROVINCES = 13;
        MAX_PERCENTAGE = 100;
    }

    public static void main(final String[] args) {
        provinces.add(new Province("British Columbia", 4400057));
        provinces.add(new Province("Alberta", 3645257));
        provinces.add(new Province("Manitoba", 1208268));
        provinces.add(new Province("Nunavut", 31906));
        provinces.add(new Province("Saskatchewan", 1033381));
        provinces.add(new Province("Nova Scotia", 921727));
        provinces.add(new Province("New Brunswick", 751171));
        provinces.add(new Province("Ontario", 12851821));
        provinces.add(new Province("Newfoundland and Labrador", 514356));
        provinces.add(new Province("Prince Edward Island", 140204));
        provinces.add(new Province("Quebec", 7903001));
        provinces.add(new Province("Northwest Territories", 41462));
        provinces.add(new Province("Yukon", 33897));

        System.out.println("-------------------");
        System.out.println("All province names with populations in alphabetical order");
        List<Province> allProvinces = provinces.stream()
                .sorted(Comparator.comparing(p -> p.getName()))
                .collect(Collectors.toList());

        allProvinces.forEach(p -> System.out.println(p.getName() + ", population: " + p.getPopulation()));

        System.out.println("--------------------");
        System.out.println("Total population of canada");
        Integer total = provinces.stream()
                .mapToInt(Province::getPopulation).sum();
        System.out.println("Total population is " +  total);

        System.out.println("--------------------");
        System.out.println("Number of provinces with fewer than 250,000 population");

        List<Province> smallProvinces = provinces.stream()
                .filter(p -> p.getPopulation() < 250000)
                .sorted(Comparator.comparing(Province::getName))
                .collect(Collectors.toList());

        System.out.println(smallProvinces.size());

        System.out.println("--------------------");
        System.out.println("Number of provinces with more than 250,000 population");

        List<Province> largeProvinces = provinces.stream()
                .filter(p -> p.getPopulation() > 250000)
                .collect(Collectors.toList());

        System.out.println(largeProvinces.size());
        int numLargeProvinces = largeProvinces.size();

        System.out.println("--------------------");
        System.out.println("Percentages of provences with more than 250,000 population");
        double percentage = 1.0 * numLargeProvinces/NUMBER_OF_PROVINCES * MAX_PERCENTAGE;
        System.out.printf("The percent of provinces in Canada that have > 250,000 people: %.2f%%", percentage);

        System.out.println("--------------------");
        System.out.println("all provinces with > 1 M population, sorted by population");
        List<Province> oneMillionPlus = provinces.stream()
                .filter(p -> p.getPopulation() > 1000000)
                .sorted(Comparator.comparing(Province::getPopulation))
                .collect(Collectors.toList());
        oneMillionPlus.forEach(p -> System.out.println(p.getName() + " has pop " + p.getPopulation()));

        System.out.println("--------------------");
        System.out.println("The province with the largest population:");

        provinces.stream()
                .max(Comparator.comparing(Province::getPopulation))
                .ifPresent(provWithMost -> System.out.println("province with max population is" + provWithMost.getName() + provWithMost.getName().toUpperCase() + " with pop " + provWithMost.getPopulation()));

        System.out.println("--------------------");
        System.out.println("The province with the smallest population:");

        provinces.stream()
                .min(Comparator.comparing(Province::getPopulation))
                .ifPresent(provWithLeast -> System.out.println("province with max population is" + provWithLeast.getName() + provWithLeast.getName().toUpperCase() + " with pop " + provWithLeast.getPopulation()));

        System.out.println("--------------------");
        System.out.println("The province with pop 3 to 8 million");
        List<Province> middle = provinces.stream()
                .filter(p -> ((p.getPopulation() > 3000000) && (p.getPopulation() < 8000000)))
                .sorted(Comparator.comparing(Province::getName))
                .collect(Collectors.toList());
        middle.forEach(p -> System.out.println(p.getName() + ", pop " + p.getPopulation()));

        System.out.println("--------------------");
        System.out.println("Grouping all prvinces by there first letter");
        Map<Character, List<Province>> provMap = provinces.stream()
                .filter(p -> !p.getName().trim().isBlank())
                .collect(Collectors.groupingBy(p -> p.getName().charAt(0)));

        provMap.forEach((firstLetter, provinceNames) -> {
            System.out.println(firstLetter + ":");
            provinceNames.forEach(p -> System.out.println(p.getName()));
            System.out.println();
        });

        System.out.println("--------------------");
        System.out.println("Longest province name: ");
        Optional<Province> longest = provinces.stream()
                .filter(p -> !p.getName().isBlank())
                .max(Comparator.comparing(p -> p.getName().length()));
        longest.ifPresent((p -> System.out.println("longest province name is + " + p.getName())));
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Shortest province name: ");
        Optional<Province> shortest = provinces.stream()
                .filter(p -> !p.getName().isBlank())
                .min(Comparator.comparing(p -> p.getName().length()));
        shortest.ifPresent((p -> System.out.println("shortest province name is + " + p.getName())));
        System.out.println();

        System.out.println("--------------------");
        System.out.println("Does canada have a province with more than 10,000,000 people?");
        boolean moreThan10M = provinces.stream()
                .anyMatch(p -> p.getPopulation() > 10000000);
        System.out.println("The answer is " + moreThan10M);

        System.out.println("--------------------");
        System.out.println("Do all provinces have 500,000+ people?");
        boolean allHave500K = provinces.stream()
                .allMatch(p -> p.getPopulation() > 500000);
        System.out.println("The answer " + allHave500K);

        System.out.println("--------------------");
        System.out.println("Is there a probince named Alberta? (any case)");
        System.out.println(provinces.stream()
                .filter(p -> !p.getName().isBlank())
                .anyMatch(p -> p.getName().equalsIgnoreCase("alberta")));

        System.out.println("--------------------");
        System.out.println("Get all provinces that begin with the letter B");
        List<Province> startsWithB = provinces.stream()
                .filter(p -> ((!p.getName().isBlank()) && (p.getName().startsWith("B"))))
                .collect(Collectors.toList());
        startsWithB.forEach((p -> System.out.println(p.getName())));

        System.out.println("--------------------");
        System.out.println("Percent of canada population for each province");
        List<Province> allTheProvinces = provinces.stream()
                .filter(p -> ((p.getName() != null) && (p.getName().isBlank())))
                .collect(Collectors.toList());
        // get total population
        int canadaPopulation = provinces.stream()
                .mapToInt(Province::getPopulation).sum();
        allTheProvinces.forEach(p -> System.out.printf("%s...%.2f%%\n", p.getName(),
                (((double)p.getPopulation()/canadaPopulation) * MAX_PERCENTAGE)));


    }
}
