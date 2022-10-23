import java.util.ArrayList;
import java.util.List;
public class Notebook{
    public static void main(final String[] args)    {
        final List<String> notes;
        notes = new ArrayList<>();
        notes.add("Work Hard");
        notes.add("Have Fun");
        display(notes, Notebook::upperIt);
        display(notes, Notebook::getFirstLetter);
        //display(notes, s -> s.toUpperCase());
    }

    private static String getFirstLetter(String s) {
        return " " + s.charAt(0);
    }

    private static String lowerIt(String input)    {
        return input.toLowerCase();
    }
    private static String upperIt(String input)    {
        return input.toUpperCase();
    }

    private static void display(List<String> list, Converter converter)    {
        for(String s: list)        {
            System.out.println(converter.convert(s));
        }
    }
}
interface Converter{
    String convert(String input);
}


