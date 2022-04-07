package math_problems;

import java.sql.SQLOutput;

public class FindMissingNumber {

    /**
     * INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println("Missing number from array array: "+missingNumber(array));

    }
        public static int missingNumber(int[] array){
            int n = array.length+1;
            int sum = n * (n+1)/2;
            int restSum = 0;
            for (int i = 0; i < array.length; i++){
                restSum+=array[i];
            }
            int missingNumber=sum-restSum;
            return missingNumber;
        }


    }

