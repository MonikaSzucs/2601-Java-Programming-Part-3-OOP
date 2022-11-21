package ca.bcit.comp2601.lab09.group;

import java.util.*;
import java.util.stream.Collectors;

/**
 * BookStore Class
 *
 * @author Guilherme Trevison, Monika Szucs, Davood Tabrizi Nejad
 * @version 1.1
 * @since 2022-11-20
 */
class BookStore {
    private String name;
    private static List<Novel> novels;

    static {
        novels = new ArrayList<>();
    }

    BookStore(final String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be blank");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        novels.add(new Novel("The Adventure of Augie March", "Saul Bellow", 1953));
        novels.add(new Novel("All the King's Men", "Robert Penn Warren", 1946));
        novels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novels.add(new Novel("Animal Farm", "George Orwell", 1946));
        novels.add(new Novel("Appointment in Samarra", "Jogn O'Hara", 1934));
        novels.add(new Novel("Are You There God? It's Me, Margaret", "Judy Blume", 1970));
        novels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novels.add(new Novel("Atonement", "Ian McEwan", 2002));
        novels.add(new Novel("Beloved", "Toni Morrison", 1987));
        novels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novels.add(new Novel("A Death in the Family", "James Agee", 1958));
        novels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novels.add(new Novel("Deliverance", "James Dickey", 1970));
        novels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novels.add(new Novel("Falconer", "John Cheever", 1977));
        novels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novels.add(new Novel("Herzog", "Saul Bellow", 1964));
        novels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novels.add(new Novel("Light in August", "William Faulkner", 1932));
        novels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novels.add(new Novel("Loving", "Henry Green", 1945));
        novels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novels.add(new Novel("Money", "Martin Amis", 1984));
        novels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novels.add(new Novel("Native Son", "Richard Wright", 1940));
        novels.add(new Novel("Neuromancer", "William Gibson", 1984));
        novels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novels.add(new Novel("1984", "George Orwell", 1948));
        novels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novels.add(new Novel("Possession", "A.S. Byatt", 1990));
        novels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novels.add(new Novel("White Noise", "Don DeLillo", 1985));
        novels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

        printAllTitles();
        printBookTitle("Under the Net");
        printTitlesInAlphaOrder();
        printGroupByDecade(2009);
        getLongest();
        System.out.println(isThereABookWrittenBetween(1970));
        System.out.println(howManyBooksContain("Under"));
        System.out.println(whichPercentWrittenBetween(1970, 1980));
        System.out.println(getOldestBook().getYearPublished());

        List booksWithLength = getBooksThisLength(10);
        booksWithLength.forEach(n -> System.out.println(n.toString()));
    }

    public static void printAllTitles() {
        System.out.println("--- Print All Titles To UpperCase ---");
        novels.forEach(p -> System.out.println(p.getTitle().toUpperCase()));
    }

    public static void printBookTitle(final String title) {
        System.out.println("--- Print All Titles that matches the parameter ---");
        List<Novel> matchTitles = novels.stream()
                .filter(p -> ((!p.getTitle().isBlank()) &&  (p.getTitle().equalsIgnoreCase(title))))
                .collect(Collectors.toList());
        matchTitles.forEach(p -> System.out.println(p.getTitle()));

    }

    public static void printTitlesInAlphaOrder() {
        System.out.println("--- Print Title in Alphabetical Order ---");
        List<Novel> alphabeticalOrder = novels.stream()
                .collect(Collectors.toList());
        alphabeticalOrder.forEach(p -> System.out.println(p.getTitle()));
    }

    public static void printGroupByDecade(final int decade) {
        System.out.println("--- Print Books only between 2000 to 2009 ---");
        List<Novel> booksInTwoThousands = novels.stream()
                .filter(p -> ((p.getYearPublished() >= 2000) && (p.getYearPublished() <= decade)))
                .collect(Collectors.toList());
        booksInTwoThousands.forEach(p -> System.out.println(p.getTitle() + " was released in " + p.getYearPublished()));
    }

    public static void getLongest() {
        System.out.println("--- Print the longest book title ---");
        Optional<Novel> longestBookTitle = novels.stream()
                .filter(p -> !p.getTitle().isBlank())
                .max(Comparator.comparing(p -> p.getTitle().length()));
        longestBookTitle.ifPresent((p -> System.out.println("The longest book title is " + p.getTitle())));
    }

    public static boolean isThereABookWrittenBetween(final int year) {
        System.out.println("--- Returns boolean of whether there is a book written between a certain year---");
        boolean bookWrittenBetween = novels.stream()
                .anyMatch(p -> ((p.getYearPublished() > 1960) && (p.getYearPublished() < year)));
        return bookWrittenBetween;
    }

    public static int howManyBooksContain(final String word) {
        System.out.println("--- Returns the amount of books that contain the word in the title ---");
        List<Novel> numberBooksContainingWord = novels.stream()
                .filter(n -> n.getTitle().contains(word))
                .collect(Collectors.toList());
        return numberBooksContainingWord.size();
    }

    public static String whichPercentWrittenBetween(final int first,final int last) {
        System.out.println("--- Returns the percentage of books written between specific years ---");
        List<Novel> allNovels = novels.stream()
                .filter(p -> ((p.getYearPublished() >= first) && (p.getYearPublished() <= last)))
                .collect(Collectors.toList());
        System.out.println(allNovels);
        System.out.println(allNovels.size());

        double checkingPercentage = ((double)allNovels.size() / (double)novels.size()) * 100;
        return String.format("%.2f", checkingPercentage);
    }

    public static Novel getOldestBook() {
        System.out.println("--- Returns the oldest book ---");
        Optional<Novel> oldestBook = novels.stream()
                .min(Comparator.comparing(Novel::getYearPublished));
        return oldestBook.get();
    }

    public static List<Novel> getBooksThisLength(final int titleLength) {
        System.out.println("--- Returns books with a called length ---");
        List<Novel> booksThisLength = novels.stream()
                .filter(n -> n.getTitle().length() == titleLength)
                .collect(Collectors.toList());
        return booksThisLength;
    }

}
