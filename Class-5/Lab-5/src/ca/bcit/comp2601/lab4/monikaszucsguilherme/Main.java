package ca.bcit.comp2601.lab4.monikaszucsguilherme;
import javax.swing.*;
import java.util.Collections;

/**
 * Main.java
 *
 * COMP 2601 - CRN: 48065
 * Friday evenings, Fall 2022
 * Lab #5
 *
 * @author Monika Szucs
 * @author Guilherme
 * @version 1.1
 *
 */
public class Main {

    private static final int    INITIAL_START;
    private static final int    INITIAL_ARGUMENT;
    private static final int    SECONDARY_ARGUMENT;
    private static final int    REDUCED_LENGTH;
    private static final int    END_POSITION;

    static
    {
        INITIAL_START       = 0;
        INITIAL_ARGUMENT    = 0;
        SECONDARY_ARGUMENT  = 1;
        REDUCED_LENGTH      = 1;
        END_POSITION        = 0;
    }

    public static void main(String[] args) {
        Dictionary dictionary;
        int size;

        dictionary = new Dictionary();
        size = dictionary.titles.size();

        Wordable wordy = (word, length) -> {
            StringBuilder answer;
            answer = new StringBuilder();

            if(word.equalsIgnoreCase("concat")) {
                for(int i = INITIAL_START; i < length; i++) {
                    answer.append(dictionary.titles.get(i));
                }
            }
            if(word.equalsIgnoreCase("repeat")) {
                for(int i = INITIAL_START; i < size; i++) {
                    for(int j = INITIAL_START; j < length; j++) {
                        answer.append(dictionary.titles.get(i));
                    }
                }
            }

            if(word.equalsIgnoreCase("nth")) {
                answer.append(dictionary.titles.get(length));
            }

            if(word.equalsIgnoreCase("reverse")) {
                for(int i = INITIAL_START; i < length - REDUCED_LENGTH; i++) {
                    for(int j = dictionary.titles.get(i).length() - REDUCED_LENGTH; j >= END_POSITION; j--){
                        answer.append(dictionary.titles.get(i).charAt(j));
                    }
                }
            }

            return answer.toString();
        }; // lambda expression

        if(args[INITIAL_ARGUMENT].equalsIgnoreCase("concat")) {
            System.out.println(dictionary.getWords(args[INITIAL_ARGUMENT],size,wordy));
        } else if(args[INITIAL_ARGUMENT].equalsIgnoreCase("repeat")) {
            System.out.println(dictionary.getWords(args[INITIAL_ARGUMENT],Integer.valueOf(args[SECONDARY_ARGUMENT]),wordy));
        } else if(args[INITIAL_ARGUMENT].equalsIgnoreCase("nth")) {
            System.out.println(dictionary.getWords(args[INITIAL_ARGUMENT],Integer.valueOf(args[SECONDARY_ARGUMENT]),wordy));
        } else if(args[INITIAL_ARGUMENT].equalsIgnoreCase("reverse")) {
            System.out.println(dictionary.getWords(args[INITIAL_ARGUMENT],size,wordy));
        }
        dictionary.titles.forEach(System.out::println);
    }
}
