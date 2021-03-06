package algorithm;

public class QuickSortExample {

/* This function takes last element as pivot, places the pivot element at its correct
   position in sorted array, and places all smaller (smaller than pivot) to left of
   pivot and all greater elements to right of pivot */

    int partition(int array[], int low, int high)
    {
        //set pivot to the value of array at the last index
        int pivot = array[high];

        // index of smaller element
        int i = (low - 1);

        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSortExample ob = new QuickSortExample();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        for (int num : arr) {
            System.out.print(num + " | ");
        }
    }

}
