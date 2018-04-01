package array;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
 */

public class FirstLast6 {

    public static boolean firstLast6(int [] nums) {

        boolean sixIsFound = false;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[0] == 6 || nums[nums.length-1] == 6) sixIsFound = true;
        }
        return sixIsFound;
    }

    public static void main(String[] args) {

        int [] array1 = {1,2,6};
        int [] array2 = {6,1,2,3};
        int [] array3 = {13,6,1,2,3};

        System.out.println(firstLast6(array1));
        System.out.println(firstLast6(array2));
        System.out.println(firstLast6(array3));

    }
}
