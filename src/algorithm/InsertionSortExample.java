package algorithm;

public class InsertionSortExample {

    public static int[] sort(int [] arr) {

        //assuming the value of array at the index of zero is sorted.
        //this will loop through the array and compare the value to the one on the left
        for (int i = 1; i < arr.length ; i++) {

            //example {50, 10, 20 , 100, 18}
            // temporary variable that holds the value of array at the current index (index 1 to start)
            int key = arr[i];

            //index to compare (the one on the left of the current index)
            int indexToCompare = i - 1;

            //check if the index is equals or greater than 0, and value of the array at the indexToCompare is greater than key
            while (indexToCompare >= 0 && arr[indexToCompare] > key ) {
                // if the above conditions are true
                // overwrite the value of the array at the current index with the value of array at the indexToCompare
                arr[indexToCompare + 1] = arr [indexToCompare];
                //minus the indexToCompare
                indexToCompare -= 1;
            }
            //reassign the indexToCompare with key
            arr[indexToCompare + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] anyArray = new int [] {50, 10, 20 , 100, 18};
        sort(anyArray);

        for(int num : anyArray) {
            System.out.print(num + " | ");
        }
    }
}
