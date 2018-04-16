package algorithm;

import java.util.Random;

public class SelectionSortExample {

    public static void selectionSort (int [] array) {

        int minIndex;

        for (int i = 0; i < array.length -1 ; i++) {

            //find the minimum value in the array
            minIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    //reassign the index of minumum value
                    minIndex = j;
                    // swap
                    int temp = array[minIndex];
                    array[minIndex] = array [i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        //create randonNum using Random class
        Random randomNum = new Random();

        int [] randomArray = new int [5];

        for (int i = 0; i < randomArray.length ; i++) {
            //using Random class method nextInt to populate the array with random numbers
            randomArray[i] = randomNum.nextInt(100);
        }

        selectionSort(randomArray);

        for(int value : randomArray) {
            System.out.print(value + " | ");
        }
    }
}
