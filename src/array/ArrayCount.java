package array;

/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3

 */
public class ArrayCount {

    public static int countArray(int [] array){
        int numOfNine = 0;

        for (int i = 0; i < array.length ; i++) {
            if(array[i] == 9) {
                numOfNine++;
            }
        }

        return numOfNine;
    }


    public static void main(String[] args) {

        int [] array = {1, 9, 9, 3, 9};

        System.out.println(countArray(array));

    }
}
