package array;

/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
example:
reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */

public class Reverse3 {

    public static int [] reverse3(int [] array) {

        int index = 0;
        int temp = array[index];
        array[index] = array[array.length -1];
        array[array.length -1] = temp;
        return array;
    }

    public static void main(String[] args) {

        int [] array = {5,11,9};
        reverse3(array);

        for(int num : array) {
            System.out.print(num + " | ");
        }

    }
}
