package string_problems;

public class Palindrome {

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here
    public static void main(String args[]){

        String myString = "level";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }
    }
}
