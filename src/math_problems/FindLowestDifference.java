package math_problems;

import java.util.Arrays;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays
     * HINT: The lowest number that isn't shared between these arrays is 1
     * @return
     */

    public static int main(String[] args) {
        //int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        //int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        int[] getKthElementSorted(int[] array1, int[] array2, int k){
            int length1 = array1.length, length2 = array2.length;
            int[] combinedArray = new int[length1 + length2];
            System.arraycopy(array1, 0, combinedArray, 0, array1.length);
            System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);
            Arrays.sort(combinedArray);

            return combinedArray[k-1];

            }
        public static int getKthElementMerge(int[] array1, int[] array2, int k) {

            int i1 = 0;
            int i2 = 0;

            while(i1 < array1.length && i2 < array2.length && (i1 + i2) < k) {
                if(array1[i1] < array2[i2]) {
                    i1++;
                } else {
                    i2++;
                }
            }
            if((i1 + i2) < k) {
                return i1 < array1.length ? array1[k - i2 - 1] : array2[k - i1 - 1];
            } else if(i1 > 0 && i2 > 0) {
                return Math.max(array1[i1-1], array2[i2-1]);
            } else {
                return i1 == 0 ? array2[i2-1] : array1[i1-1];
            }
        }

        }
    }

