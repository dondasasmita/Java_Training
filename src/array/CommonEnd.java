package array;

/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.
 */

public class CommonEnd {

    public static boolean commonEnd (int [] firstArray, int [] secondArray) {

        boolean sameEnding = false;
        // variable to store the value of the last index in FirstArray
        int lastIndexFA = firstArray[firstArray.length-1];
        // variable to store the value of the last index in SecondArray
        int lastIndexSA = secondArray[secondArray.length-1];

        if (lastIndexFA == lastIndexSA) {
            sameEnding = true;
        } return sameEnding;

    }

    public static void main(String[] args) {

        int [] array1 = {1,2,3};
        int [] array2 = {7,3};

        System.out.println(commonEnd(array1, array2));

    }
}
