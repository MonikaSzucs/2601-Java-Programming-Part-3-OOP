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

        System.out.println();
        System.out.println("Printing the number of letters in all country names put together");
        printHowManyLettersInCountries();

        System.out.println();
        System.out.println("Printing capitals with a certain number of letters");
        printCapitalsWithThisManyLetters(4, 5);

        System.out.println();
        System.out.println("Printing all countries that do not end with a certain letter");
        printAllCountriesThatDoNotEndWith('n');

        System.out.println();
        System.out.println("Printing all capitals that contain the letter into a single string with no space");
        printAllCapitalsThatContainLetterIntoASingleStringNoSpaces('z');
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
        Optional<CountryCapital>longestCombination = allCountryCapital.stream()
                .filter(n -> !n.getCapital().isBlank())
                .max(Comparator.comparing(n -> n.getCountry().length() + n.getCapital().length()));
        longestCombination.ifPresent(n -> System.out.println("Longest combination of country and capital is " + n.getCountry() + ", " + n.getCapital()));
    }

    private static void printHowManyLettersInCountries() {
        long countAllLength = allCountryCapital.stream()
                .mapToInt(n -> n.getCountry().length()).sum();
        System.out.println(countAllLength);
    }

    private static void printCapitalsWithThisManyLetters(final int min, final int max) {
        List<CountryCapital> capitalLetterCountBetween = allCountryCapital.stream()
                .filter(n -> n.getCapital().length() >= min && n.getCapital().length() <= max)
                .collect(Collectors.toList());
        capitalLetterCountBetween.forEach(System.out::println);
    }

    private static void printAllCountriesThatDoNotEndWith(final char letter) {
        List<CountryCapital> countriesThatDoNotEndWithLetter = allCountryCapital.stream()
                .filter(n -> !n.getCountry().isBlank() && !n.getCountry().endsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
        countriesThatDoNotEndWithLetter.forEach(System.out::println);
    }

    private static void printAllCapitalsThatContainLetterIntoASingleStringNoSpaces(final char letter) {
        String countriesThatContain = allCountryCapital.stream()
                .filter(n -> !n.getCapital().isBlank() && n.getCapital().toLowerCase().contains(String.valueOf(letter)))
                .map(n -> n.getCapital())
                .collect(Collectors.joining(""));
        //countriesThatContain.forEach(System.out::println);

        System.out.println(countriesThatContain);
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
