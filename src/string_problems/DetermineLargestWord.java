package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement a solution to find the length of the longest word in the given sentence below
         Your solution should return a map containing the length of the word as the key & the word itself as the value
            "10: biological"
         */
       String s = "Human brain is a biological learning machine";
       Map<Integer, String> wordNLength = findTheLargestWord(s);

//        wordNLength.put(1, "Human");
//        wordNLength.put(2, "brain");
//        wordNLength.put(3, "is");
//        wordNLength.put(4, "a");
//        wordNLength.put(5, "biological ");
//        wordNLength.put(6, "learning");
//        wordNLength.put(7, "machine");
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        // Implement here

        return map;
    }
}
