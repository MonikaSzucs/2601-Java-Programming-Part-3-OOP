import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class BookStore {
    private final String bookStoreName;
    private static List<Novel> novels;

    BookStore(final String bookStoreName) throws FileNotFoundException {
        if(bookStoreName == null || bookStoreName.isBlank()) {
            throw new IllegalArgumentException("The bookstore name cannot be null or blank");
        }

        this.bookStoreName = bookStoreName;
        novels = new ArrayList<>();

        Scanner scanner = new Scanner(new File("files\\data_lab09.csv"), StandardCharsets.ISO_8859_1.toString());

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Novel newNovel = parseNovelData(line);
            if(newNovel != null) {
                novels.add(newNovel);
            } else {
                //
            }
        }
        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        BookStore bookStoreName;
        bookStoreName = new BookStore("BCIT Books");

        System.out.println("");
        System.out.println("--- Printing all book titles in uppercase ---");
        printAllTitles();

        System.out.println("");
        System.out.println("Printing all book titles that contain the word \"God\" in thier titles");
        printBookTitle("God");

        System.out.println("");
        System.out.println("Printing the titles in alphabetical order");
        printTitlesInAlphabeticalOrder();

        System.out.println("");
        System.out.println("Printing groups by decade");
        printGroupByDecade(1960);

        System.out.println("");
        System.out.println("Printing the longest bookstore name");
        getLongest();

        System.out.println("");
        System.out.println("Percentage Written between");
        double percentageWritten = whichPercentWrittenBetween(1960, 1970);
        System.out.println(percentageWritten);
    }

    private static Novel parseNovelData(final String commaSeparateLine) {
        try {
            String title;
            String authorName;
            int yearPublished;
            List<String> novelData;
            novelData = new ArrayList<>(List.of(commaSeparateLine.split(",")));
            //System.out.println(novelData);
            yearPublished = Integer.parseInt(novelData.get(novelData.size() + -1));
            authorName = novelData.get(novelData.size() + -2);
            novelData.remove(novelData.size() + -1);
            novelData.remove(novelData.size() + -1);
            title = removeNonPrintableChars(String.join(",", novelData));
            return  new Novel(title, authorName, yearPublished);
        } catch(Exception e) {
            return null;
        } finally {
            // do nothing
        }
    }

    private static String removeNonPrintableChars(final String inputString) {
        String result;
        // ^\x00-\x7F means values between 0 to 127
        result = inputString.replaceAll("[^\\x00-\\x7F]", ""); // strips off all non-ASCII characters
        result = result.replaceAll("[\\p{Cntrl}&&[^\n" + "\t]]", ""); // ASCII control characters
        result = result.replaceAll("\\p{C}", ""); // removes non-printable characters from Unicode
        return result.trim();
    }

    private static void printAllTitles() {
        novels.forEach(n -> System.out.println(n.getTitle().toUpperCase()));
    }

    private static void printBookTitle(final String title) {
        List<Novel> bookTitleMatch = novels.stream()
                .filter(n -> n.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    private static void printGroupByDecade(final int decade) {
        // print between 2000 to 2009
        int maxYear = decade + 9;
        Map<Integer, List<Novel>> novFiltered = novels.stream()
                .filter(n -> n.getYearPublished() >= decade && n.getYearPublished() <= maxYear)
                .sorted(Comparator.comparing(Novel::getYearPublished))
                .collect(Collectors.groupingBy(Novel::getYearPublished));
        novFiltered.forEach((yearPublished, novels) -> {
            System.out.println(yearPublished + " : ");
            String titleList;
            titleList = "";
            for(Novel novel: novels) {
                titleList += ((novel.getTitle()) + ",");
            }
            titleList = titleList.substring(0, titleList.length() - 2);
            System.out.println(titleList + System.lineSeparator());
        });
    }

    private static void getLongest() {
        Optional<Novel> longestTitle = novels.stream()
                .filter(n -> !n.getTitle().isBlank())
                .max(Comparator.comparing(n -> n.getTitle().length()));
        longestTitle.ifPresent(n -> System.out.println("Longest book title is " + n.getTitle()));
    }

    private static boolean isThereABookWrittenBetween(final int year) {
        boolean isBookFound = novels.stream()
                .anyMatch(n -> n.getYearPublished() == year);
        return isBookFound;
    }

    private static int howManyBooksContain(final String word) {
        List<Novel> numberBooksContain = novels.stream()
                .filter(n -> n.getTitle().contains(word))
                .collect(Collectors.toList());
        return numberBooksContain.size();
    }

    private static double whichPercentWrittenBetween(final int first, final int last) {
        int numBooks = novels.size();
        List<Novel> novFiltered = novels.stream()
                .filter(n-> n.getYearPublished() >= first && n.getYearPublished() < last)
                .sorted(Comparator.comparing(Novel::getYearPublished))
                .collect(Collectors.toList());
        double percentage = 1.0 * novFiltered.size() / numBooks * 100;
        return percentage;

    }

    private static void printTitlesInAlphabeticalOrder() {
        List<Novel> novelsContaining = novels.stream()
                .sorted(Comparator.comparing(n -> n.getTitle().replaceAll("\"", "")))
                .collect(Collectors.toList());
        novelsContaining.forEach(n -> System.out.println(n.getTitle()));
    }
}
