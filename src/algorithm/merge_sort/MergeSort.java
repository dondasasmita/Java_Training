package algorithm.merge_sort;

public class MergeSort {

    // Merges two subarrays of arr[]. First subarray is arr[l..m]. Second subarray is arr[m+1..r]
    // l is first index, m is the last index of the array on the left
    // the first index of the array on the right is m+1

    public static void merge(double mainArray[], int l, int m, int r){

        /* SPLITTING THE ARRAY */

        // Find sizes of two subarrays to be merged, n1 is array on the left, n2 is array on the right
        int n1 = m - l + 1;
        int n2 = r - m;

        //create temp array
        double L[] = new double[n1];
        double R[] = new double[n2];

        //insert values to the temp array left
        for (int i = 0; i <n1 ; i++) {
            L[i] = mainArray[l+i];
        }

        //insert values to the temp array right
        for (int i = 0; i <n2 ; i++) {
            R[i] = mainArray[m + 1 + i];
        }

        /* MERGING THE TEMP ARRAYS */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                mainArray[k] = L[i];
                i++;
            }
            else
            {
                mainArray[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            mainArray[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            mainArray[k] = R[j];
            j++;
            k++;
        }

    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(double mainArray[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(mainArray, l, m);
            sort(mainArray , m+1, r);

            // Merge the sorted halves
            merge(mainArray, l, m, r);
        }
    }


}
