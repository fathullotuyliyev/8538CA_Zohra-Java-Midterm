package string_problems;

public class UnitTestingStringProblem {

    /*
     Use this class to unit test all of the classes contained within this package
     */

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Anagram.isAnagram("listen", "silent");
        System.out.println();

        Permutation permutation = new Permutation();
        Permutation.printPermutation("ILY", "ISM" );
        System.out.println();

        Palindrome palindrome = new Palindrome();
        //I just noticed that I did not do this one right, because I did not create a method.
        DuplicateWord duplicateWord = new DuplicateWord();
        //I didn't create a method here either




    }
}
