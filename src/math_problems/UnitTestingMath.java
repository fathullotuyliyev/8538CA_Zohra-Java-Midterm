package math_problems;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Factorial.factRecursive(10);
        System.out.println();
        Fibonacci fibonacci = new Fibonacci();
        //no method created :(
        FindMissingNumber missingNumber = new FindMissingNumber();
        //FindMissingNumber.missingNumber();
        System.out.println();
        Pattern pattern = new Pattern();
        //Pattern.main();
        PrimeNumber primeNumber = new PrimeNumber();
        //PrimeNumber.main();
        //I guess I did everything wrong;


    }
}
