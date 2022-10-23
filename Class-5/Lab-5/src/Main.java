import javax.swing.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        int size = dictionary.titles.size();

        Wordable wordy = (word, length) -> {
            StringBuilder answer = new StringBuilder();
            StringBuilder convertingAnswer = new StringBuilder();
            System.out.println(word);
            if(word.equalsIgnoreCase("concat")) {
                for(int i = 0; i < length; i++) {
                    answer.append(dictionary.titles.get(i));
                }
            }
            if(word.equalsIgnoreCase("repeat")) {
                for(int i = 0; i < size; i++) {
                    for(int j = 0; j < length; j++) {
                        answer.append(dictionary.titles.get(i));
                    }
                }
            }

            if(word.equalsIgnoreCase("nth")) {
                answer.append(dictionary.titles.get(length));
            }

            if(word.equalsIgnoreCase("reverse")) {
                System.out.println(length);
                for(int i = 0; i < length - 1; i++) {
                    System.out.println(dictionary.titles.get(i));
                    System.out.println(dictionary.titles.get(i).length());
                    for(int j = dictionary.titles.get(i).length() - 1; j >= 0; j--){
                        System.out.println(dictionary.titles.get(j).charAt(j));
                        //convertingAnswer.append();
                        answer.append(dictionary.titles.get(i).charAt(j));
                    }

                    //answer.append(convertingAnswer);
                    System.out.println(answer);
                    System.out.println("\n");
                }

            }

            return answer.toString();
        }; // lambda expression

        if(args[0].equalsIgnoreCase("concat")) {
            System.out.println(dictionary.getWords(args[0],size,wordy));
        } else if(args[0].equalsIgnoreCase("repeat")) {
            System.out.println(dictionary.getWords(args[0],Integer.valueOf(args[1]),wordy));
        } else if(args[0].equalsIgnoreCase("nth")) {
            System.out.println(dictionary.getWords(args[0],Integer.valueOf(args[1]),wordy));
        } else if(args[0].equalsIgnoreCase("reverse")) {
            System.out.println(dictionary.getWords(args[0],size,wordy));
        }
    }
}
