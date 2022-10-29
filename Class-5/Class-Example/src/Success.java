import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

class Success {
    public static void main(final String[] args) {
        List ideas;

        ideas = new ArrayList();
        ideas.add("can't hurt me");
        ideas.add("power of now");
        ideas.add("discipline equals freedom");

        ideas.forEach(System.out::println);

        // Cast it to a string to get the string methods
        ideas.forEach(idea -> {
            System.out.println(((String)idea).toUpperCase());
        });
    }

//    public static void whatever(String s) {
//        System.out.println(s +  s.toUpperCase());
//    }
}
