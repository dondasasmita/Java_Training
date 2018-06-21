package array;

/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */

public class ArrayFront9 {

    public static boolean arrayFront9 (int [] array) {
        boolean nineIsFound = false;
        int lengthOfArray;

        if (array.length >= 4) {
            lengthOfArray = 4;
        } else {
            lengthOfArray = array.length;
        }

        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] == 9){
                nineIsFound = true;
            }
        }
        return nineIsFound;
    }

    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 4};
        int [] array2 = {1, 2, 9, 3, 4};

        System.out.println(arrayFront9(array1));
        System.out.println(arrayFront9(array2));
    }
}
