package math_problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * @return
     */

        static int factRecursive(int number) {
            if (number == 1)
                return 1;
            return number * factRecursive(number - 1);
        }
        private static int factIterative(int number) {
            int factorial = 1;
            for (int iNumber = 1; iNumber <= number; iNumber++) {
                factorial = factorial * iNumber;
            }
            return factorial;
        }
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.printf(" Enter input number : ");
                int number = scanner.nextInt();
                int factNumber = factRecursive(number);
                System.out.printf("factorial(%d) - Recursive method: %d\n",number,factNumber);

                factNumber = factIterative(number);
                System.out.printf("factorial(%d) - Iterative method: %d\n",number,factNumber);
            }
        }
    }






