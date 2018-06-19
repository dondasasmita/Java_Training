/*

Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]

 */

package array;

public class MaxEnd3 {

    public static int [] findMaxAndChange(int [] array) {
        int max = 0;
        max = Math.max(array[0], array[1]);
        max = Math.max(array[2],max);

        for (int i = 0; i < array.length; i++) {
            array[i] = max;
        }

        return array;
    }

    public static void main(String[] args) {

        int [] array = {11, 5, 9};

        findMaxAndChange(array);
        for (int num: array) {
            System.out.println(num + "|");
        }
    }

}
