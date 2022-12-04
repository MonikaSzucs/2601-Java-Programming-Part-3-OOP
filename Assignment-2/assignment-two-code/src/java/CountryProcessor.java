import javax.swing.text.html.Option;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

class CountryProcessor {
    private String countryCapitalListTitle;
    private static List<CountryCapital> allCountryCapital;

    CountryProcessor(final String countryCapitalListTitle)
            throws FileNotFoundException{
        this.countryCapitalListTitle = countryCapitalListTitle;
        allCountryCapital = new ArrayList<>();

        Scanner scanner;
        scanner = new Scanner(new File("files\\countries-and-capitals.txt"));

        while(scanner.hasNextLine()) {
            String line;
            CountryCapital newCountryCapital;

            line = scanner.nextLine();
            //System.out.println(line);
            newCountryCapital = parseCountryCapital(line);

            if(line != null){
                allCountryCapital.add(newCountryCapital);
            }
        }
        scanner.close();
    }



    public static void main(final String[] args) throws FileNotFoundException {
        CountryProcessor cp;
        cp = new CountryProcessor("All the Countries and Capitals in the world");

        System.out.println();
        System.out.println("Printing the longest capital city");
        printLongestCapitalCity();

        System.out.println();
        System.out.println("Printing the shortest country name");
        printShortestCountryName();

        System.out.println();
        System.out.println("Printing all the countries starting with the letter a");
        printAllCountriesStartingWith("a");

        System.out.println();
        System.out.println("Printing the longest combination of country and capital name");
        printLongestCombination();
    }

   private static void printLongestCapitalCity() {
       Optional<CountryCapital>longest = allCountryCapital.stream()
               .filter(n -> !n.getCapital().isBlank())
               .max(Comparator.comparing(n -> n.getCapital().length()));
       longest.ifPresent(n -> System.out.println("Longest capital is " + n.getCapital()));
   }

   private static void printShortestCountryName() {
       Optional<CountryCapital>shortest = allCountryCapital.stream()
               .filter(n -> !n.getCountry().isBlank())
               .min(Comparator.comparing(n -> n.getCountry().length()));
       shortest.ifPresent(n -> System.out.println("Shortest country is " + n.getCountry()));
   }

    private static void printAllCountriesStartingWith(final String substring) {
        List<CountryCapital> titleStartingWith = allCountryCapital.stream()
                .filter(n -> !n.getCountry().isBlank() && n.getCountry().toLowerCase().startsWith(substring)).toList();
        titleStartingWith.forEach(System.out::println);
    }

    private static void printLongestCombination() {

    }

   private static CountryCapital parseCountryCapital(final String commaSeparatedInfo) {
        try {
            String country;
            String capital;
            List<String> countryCapitalData;

            countryCapitalData = new ArrayList<>(List.of(commaSeparatedInfo.split(",")));
            //System.out.println("Here" + countryCapitalData);
            country =  countryCapitalData.get(0);
            capital = countryCapitalData.get(1);
            //System.out.println(country);
            //System.out.println(capital);
            return new CountryCapital(country, capital);

        } catch(final Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //
        }
   }
}
