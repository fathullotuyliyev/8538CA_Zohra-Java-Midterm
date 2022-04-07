package string_problems;

import java.util.Locale;

public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find duplicate words and the number of occurrences of those words in the given string.
            Also, find the average length of all the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        int count;
        String duplicates = "";
        String[] words = st.toLowerCase().trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if(count > 1){
                if(duplicates.isEmpty()){
                    duplicates += " " + words[i] + ":" + count;
                }
                else if(!duplicates.matches("(.*) " + words[i]+ " (.*)")){
                    duplicates += " " + words[i] + " : " + count;
                }
            }
        }
        System.out.println(duplicates);
    }
}


