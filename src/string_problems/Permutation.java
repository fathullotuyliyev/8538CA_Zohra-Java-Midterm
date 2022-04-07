package string_problems;

public class Permutation {

    /*
    Create a Java program to compute all permutations of any given string

        e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    // Implement Here
    public static void main(String[] args){
        String s = "Stress";
        printPermutation(s, "");
    }
    static void printPermutation(String str, String ans){
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printPermutation(ros, ans + character);
        }
    }

}

